package com.nexim.nexim.controller;

import com.nexim.nexim.configuration.jwt.JwtUtils;
import com.nexim.nexim.model.EnumRole;
import com.nexim.nexim.model.Role;
import com.nexim.nexim.model.Users;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.payload.request.LoginRequest;
import com.nexim.nexim.payload.request.SignUpRequest;
import com.nexim.nexim.payload.response.JwtResponse;
import com.nexim.nexim.payload.response.MessageResponse;
import com.nexim.nexim.payload.response.UserInfoResponse;
import com.nexim.nexim.repository.RoleRepository;
import com.nexim.nexim.repository.UserRepository;

import com.nexim.nexim.services.user.UserDetailsImpl;
import com.nexim.nexim.services.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin()
@RestController
@RequestMapping("/api/v1")
public class ApplicationController {
@Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtUtils jwtUtils;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
        }

        // Create new user's account

        Users userInfo = modelMapper.map(signUpRequest, Users.class);
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        userInfo.setCreatedDate(LocalDate.now());
//        if (userInfo != null && userInfo.isEnabled()) {
//            return ResponseEntity.ok(new MessageResponse("User is enabled"));
//
//        }
        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(EnumRole.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                switch (role) {

                    case "admin":
                        Role adminRole = roleRepository.findByName(EnumRole.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);
                 break;
                    default:
                        Role userRole = roleRepository.findByName(EnumRole.ROLE_USER)
                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(userRole);
                }
            });
        }

        userInfo.setRoles(roles);
        userRepository.save(userInfo);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        System.out.println("Tried logging with " + loginRequest.getPassword());
        Authentication authentication = authenticationManager
            .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

                List<String> roles = userDetails.getAuthorities().stream()
            .map(item -> item.getAuthority())
            .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,userDetails.getUserId(),
                userDetails.getFullname(),
                userDetails.getUsername(),
                userDetails.getPassword(),
                roles));
    }

    @GetMapping(value = "/listUser/{username}")
    public ResponseEntity<ServiceResponse> findByUsername(@PathVariable String username) throws Exception{
        ServiceResponse response = userService.findByUsername(username);
        return new ResponseEntity<>(response, response.getStatus());
    }

//    @GetMapping("listUser/{fullname}")
//    public ResponseEntity<ServiceResponse> findByFullname(@PathVariable (value = "fullname") String fullname) throws Exception{
//        ServiceResponse response = userService.findByFullname(fullname);
//        return new ResponseEntity<>(response, response.getStatus());
//    }

    @GetMapping("/{userId}")
    public ResponseEntity<ServiceResponse> findByUserId(@PathVariable(value = "userId") long userId)throws Exception{
        ServiceResponse response = userService.findByUserId(userId);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/listAllUsers")
    public ResponseEntity<ServiceResponse> findAllUsers() throws Exception{
        ServiceResponse response = userService.findAll();
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<ServiceResponse> updateUser(@PathVariable(value = "userId") long userId, @Valid @RequestBody SignUpRequest dto) throws Exception{
        ServiceResponse response = userService.updateUser(userId, dto);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping(value = "/updateUser/{username}")
    public ResponseEntity<ServiceResponse> updateByUsername(@PathVariable String username, @Valid @RequestBody SignUpRequest dto) throws Exception{
        ServiceResponse response = userService.updateUserByUsername(username, dto);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUsers(@PathVariable("userId") long userId){
        userService.deleteUser(userId);

    }
}
