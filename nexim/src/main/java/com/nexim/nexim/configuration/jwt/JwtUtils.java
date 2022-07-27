package com.nexim.nexim.configuration.jwt;

import com.nexim.nexim.model.Users;
import com.nexim.nexim.services.user.UserDetailsImpl;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseCookie;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

@Component
public class JwtUtils implements Serializable {
  private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${nexim.app.jwtSecret}")
    private String jwtSecret;

    @Value("${nexim.app.jwtExpirationMs}")
    private int jwtExpirationMs;


    public String generateJwtToken(Authentication authentication) {
    UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();
        return Jwts.builder()
            .setSubject(userPrincipal.getUsername())
            .setIssuedAt(new Date())
            .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
            .signWith(SignatureAlgorithm.HS512, jwtSecret)
            .compact();
    }
    public String getUserNameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature: {}", e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }







//
//    @Value("${jwt.secret}")
//    private String secret;
//
//    /**
//     * Tries to parse specified String as a JWT token. If successful, returns User object with username, id and role prefilled (extracted from token).
//     * If unsuccessful (token is invalid or not containing all required user properties), simply returns null.
//     *
//     * @param token the JWT token to parse
//     * @return the User object extracted from specified token or null if a token is invalid.
//     */
//    public Users parseToken(String token) {
//        try {
//            Claims body = Jwts.parser()
//                .setSigningKey(secret)
//                .parseClaimsJws(token)
//                .getBody();
//
//            Users u = new Users();
//            u.setUsername(body.getSubject());
//            u.setUserId(Long.parseLong((String) body.get("userId")));
//            u.setRoles((String) body.get("role"));
//
//            return u;
//
//        } catch (JwtException | ClassCastException e) {
//            return null;
//        }
//    }
//
//    /**
//     * Generates a JWT token containing username as subject, and userId and role as additional claims. These properties are taken from the specified
//     * User object. Tokens validity is infinite.
//     *
//     * @param u the user for which the token will be generated
//     * @return the JWT token
//     */
//    public String generateToken(User u) {
//        Claims claims = Jwts.claims().setSubject(u.getUsername());
//        claims.put("userId", u.getId() + "");
//        claims.put("role", u.getRole());
//
//        return Jwts.builder()
//            .setClaims(claims)
//            .signWith(SignatureAlgorithm.HS512, secret)
//            .compact();
//    }
//}

//
//
//
//
//    public static final long JWT_TOKEN_VALIDITY = 5*60*60;
//    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);
//
//    @Value("${nexim.app.jwtSecret}")
//    private String jwtSecret;
//
//    @Value("${nexim.app.jwtExpirationMs}")
//    private int jwtExpirationMs;
//
//    @Value("${nexim.app.jwtCookieName}")
//    private String jwtCookie;
//
//    public String getJwtFromCookies(HttpServletRequest request) {
//        Cookie cookie = WebUtils.getCookie(request, jwtCookie);
//        if (cookie != null) {
//            return cookie.getValue();
//        } else {
//            return null;
//        }
//    }
//
//    public ResponseCookie generateJwtCookie(UserDetailsImpl userPrincipal) {
//        String jwt = generateTokenFromUsername(userPrincipal.getUsername());
//        ResponseCookie cookie = ResponseCookie.from(jwtCookie, jwt).path("/api").maxAge(24 * 60 * 60).httpOnly(true).build();
//        return cookie;
//    }
//
//    public ResponseCookie getCleanJwtCookie() {
//        ResponseCookie cookie = ResponseCookie.from(jwtCookie, null).path("/api").build();
//        return cookie;
//    }
//
//    public String getUserNameFromJwtToken(String token) {
//        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
//    }
//
//    public boolean validateJwtToken(String authToken) {
//        try {
//            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
//            return true;
//        } catch (SignatureException e) {
//            logger.error("Invalid JWT signature: {}", e.getMessage());
//        } catch (MalformedJwtException e) {
//            logger.error("Invalid JWT token: {}", e.getMessage());
//        } catch (ExpiredJwtException e) {
//            logger.error("JWT token is expired: {}", e.getMessage());
//        } catch (UnsupportedJwtException e) {
//            logger.error("JWT token is unsupported: {}", e.getMessage());
//        } catch (IllegalArgumentException e) {
//            logger.error("JWT claims string is empty: {}", e.getMessage());
//        }
//
//        return false;
//    }
//
//    public String generateTokenFromUsername(String username) {
//
//        return Jwts.builder()
//            .setSubject(username)
//            .setIssuedAt(new Date())
//            .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
//            .signWith(SignatureAlgorithm.HS512, jwtSecret)
//            .compact();
//    }


//    public String generateJwtToken(String username) {
//
//        return Jwts.builder()
//            .setSubject(username)
//            .setIssuedAt(new Date())
//            .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
//            .signWith(SignatureAlgorithm.HS512, jwtSecret)
//            .compact();
//    }
}
