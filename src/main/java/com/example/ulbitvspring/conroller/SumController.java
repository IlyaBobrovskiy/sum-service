package com.example.ulbitvspring.conroller;

import java.util.Scanner;

import com.example.ulbitvspring.Views;
import com.example.ulbitvspring.entity.SumEntity;
import com.example.ulbitvspring.exception.SumAlreadyExistException;
import com.example.ulbitvspring.exception.SumNotFoundException;
import com.example.ulbitvspring.repository.SumRepo;
import com.example.ulbitvspring.service.SumService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class SumController {
    @Autowired
    ObjectMapper objectMapper = new ObjectMapper();
    Views views = new Views();
            views.setCode(0);
            views.setDescription("ok");
String result = ObjectMapper.writeValueAsString(views);
    private SumService userService;

    @PostMapping("/add")
    public ResponseEntity registration(@RequestBody SumEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PostMapping("/remove")
    public ResponseEntity deleteUser(@PathVariable Long remove) {
        try {
            userService.delete(remove);
            return ResponseEntity.ok(result);
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
        if (first == SumEntity.name) {
            x = SumEntity.getValue();
        }
        if (second == SumEntity.name) {
            y = SumEntity.getValue();
        }
        try {
            return ResponseEntity.ok(x + y);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}

