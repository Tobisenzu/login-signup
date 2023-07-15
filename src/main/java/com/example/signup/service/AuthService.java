//package com.example.signup.service;
//
//import com.example.signup.api.AuthRequest;
//import com.example.signup.api.AuthResponse;
//import com.example.signup.repo.ConsumerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthService {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private ConsumerRepository userRepository;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    public AuthResponse authenticateUser(AuthRequest authRequest) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
//        );
//
//        UserDetails userDetails = userRepository.findByUsername(authRequest.getUsername());
//        String token = jwtUtil.generateToken(userDetails);
//
//        return new AuthResponse(token);
//    }
//}
