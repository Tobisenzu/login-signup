package com.example.signup.controller;

import com.example.signup.Model.Consumer;
import com.example.signup.repo.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ConsumerController {

    @Autowired
    private ConsumerRepository consumerRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Consumer consumer) {
        // Implement user signup logic (e.g., save user to the database)
        consumerRepository.save(consumer);
        return ResponseEntity.ok("User signed up successfully.");
    }

    @PostMapping("/login")
    private ResponseEntity<?> login(@RequestBody Consumer consumer) {

        Consumer consumer1 =  consumerRepository.findByUsername(consumer.getUsername());

        if(consumer1!=null) {
            System.out.println(consumer1.getPassword());
            System.out.println(consumer1.getUsername());
        }
        if(consumer1 == null)
            return ResponseEntity.ok("Sign up first");
        if(consumer1.getPassword().equals(consumer.getPassword()))
        return ResponseEntity.ok("Hello from GreenStitch");
        else
            return ResponseEntity.ok("Sign up first");
    }

}
