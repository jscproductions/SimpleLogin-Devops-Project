package com.jsc.myproject.controller;

import com.jsc.myproject.dto.UserDTO;
import com.jsc.myproject.entity.User;
import com.jsc.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        User savedUser = userService.addUser(user);

        if (savedUser != null) {
            return ResponseEntity.ok("User data submitted successfully!");
        } else {
            return ResponseEntity.badRequest().body("An error occurred while submitting user data.");
        }
    }
}
