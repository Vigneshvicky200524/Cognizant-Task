package com.example.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.AuthenticationRequest;
import com.example.jwt.model.AuthenticationResponse;
import com.example.jwt.util.JwtUtil;

@RestController
public class AuthenticationController {

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        // Simple username and password validation
        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(token);
        }

        return new AuthenticationResponse("Invalid Username or Password");
    }
}