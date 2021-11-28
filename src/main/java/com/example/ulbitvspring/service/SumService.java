package com.example.ulbitvspring.service;

import com.example.ulbitvspring.entity.SumEntity;
import com.example.ulbitvspring.exception.SumNotFoundException;
import com.example.ulbitvspring.model.Sum;
import com.example.ulbitvspring.repository.SumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class SumService {

    private SumRepo userRepo;

    public int getOne(Long id) throws SumNotFoundException {
        String user = userRepo.findByUsername(SumEntity.name).getUsername();
        if (user == null) {
            throw new SumNotFoundException("Пользователь не найден");
        }
        return Sum.toModel(SumEntity.name);
    }

    public void registration(SumEntity user) {
    }

    public Long delete(Long id) {
        userRepo.delete(SumEntity.name);
        return id;
    }
}

