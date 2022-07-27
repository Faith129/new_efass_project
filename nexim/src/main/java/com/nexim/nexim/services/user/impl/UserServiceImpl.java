package com.nexim.nexim.services.user.impl;

import com.nexim.nexim.configuration.exceptions.ResourceNotFoundException;
import com.nexim.nexim.configuration.exceptions.ServiceException;
import com.nexim.nexim.model.Users;
import com.nexim.nexim.payload.ServiceResponse;
import com.nexim.nexim.payload.request.SignUpRequest;
import com.nexim.nexim.repository.UserRepository;
import com.nexim.nexim.services.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    //Find user by Username service
    @Override
    public ServiceResponse findByUsername(String username) throws ResourceNotFoundException {
        return userRepository.findByUsername(username).map(user -> {
            return ServiceResponse.builder().message("Username found").status(HttpStatus.OK).data(user)
                .build();
        }).orElseThrow(
            () -> new ResourceNotFoundException("The user with username " + username + "does not exist"));

    }

    //Find all users service
    @Override
    public ServiceResponse findAll() throws ResourceNotFoundException {
        List<Users> userList = userRepository.findAll();
        String message = !userList.isEmpty() ? "Users found successfully" : "No records found";
        return ServiceResponse.builder().message(message).status(HttpStatus.OK).data(userList).build();
    }
    //Find user by UserId service
    @Override
    public ServiceResponse findByUserId(long userId) throws ResourceNotFoundException {
        return userRepository.findByUserId(userId).map(uid -> {
            return ServiceResponse.builder().message("User id found").status(HttpStatus.OK).data(uid)
                .build();
        }).orElseThrow(() -> new ResourceNotFoundException("The user with id " + userId + "does not exist"));
    }
    //Update user service

    @Override
    public ServiceResponse updateUser(long userId, SignUpRequest dto) throws ResourceNotFoundException {
        Users existingUsers = userRepository.findByUserId(userId).get();
        if (userRepository.findByUserId(userId).isPresent()) {
            existingUsers.setFullname(dto.getFullname());
            existingUsers.setUsername(dto.getUsername());
            existingUsers.setPassword(passwordEncoder.encode(dto.getPassword()));
            //  existingUsers.setEnabled(dto.isEnabled());
        }

        return userRepository.findByUserId(userId).map(updateUser -> {
            userRepository.save(updateUser);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "user with name " + dto.getFullname() +
            "does not exist"));
    }

    @Override
    public ServiceResponse updateUserByUsername(String username, SignUpRequest dto) throws ResourceNotFoundException {
        Users existingUsers = userRepository.findByUsername(username).get();
        if (userRepository.findByUsername(username).isPresent()) {
            existingUsers.setFullname(dto.getFullname());
            existingUsers.setUsername(dto.getUsername());
            existingUsers.setPassword(dto.getPassword());
            //  existingUsers.setEnabled(dto.isEnabled());
        }
        return userRepository.findByUsername(username).map(updateUser -> {
            userRepository.save(updateUser);
            return ServiceResponse.builder().message("Update was successful").status(HttpStatus.OK).build();
        }).orElseThrow(() -> new ServiceException(HttpStatus.NOT_FOUND, "user with username " + dto.getUsername() +
            "does not exist"));
    }
   // Delete user by username service

    public void deleteUser(long userId){
        userRepository.deleteById(userId);
    }
}
