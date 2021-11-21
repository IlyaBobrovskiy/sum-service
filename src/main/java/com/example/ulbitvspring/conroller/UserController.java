package com.example.ulbitvspring.conroller;

import java.util.Scanner;
import com.example.ulbitvspring.entity.UserEntity;
import com.example.ulbitvspring.exception.UserAlreadyExistException;
import com.example.ulbitvspring.exception.UserNotFoundException;
import com.example.ulbitvspring.repository.UserRepo;
import com.example.ulbitvspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    private Long sum;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok("{\"{\\\"code\\\" : \\\"description:\\\"}\"}");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @PostMapping("/remove")
    public ResponseEntity deleteUser(@PathVariable Long remove) {
        try {
            return ResponseEntity.ok("{\"{\\\"code\\\" : \\\"0\\\"}\"\n\"" +
                    "decription\\\\\\\" : \\\\\\\"ok\\\\\\\"}\\\"}\"}");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping("/sum")
    @Bean
    public ResponseEntity calcSum() {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        int x = 0;
        int y = 0;
        if (first == UserRepo.sql) {
            x = UserEntity.getValue();
        }
        if (second == UserRepo.sql) {
            y = UserEntity.getValue();
        }
        try {
            return ResponseEntity.ok(x + y);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}

