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

    @Autowired
    private SumRepo userRepo;

    public Sum getOne(String name) throws SumNotFoundException {
        SumEntity entity = userRepo.findByName(name);
        if (entity == null) {
            throw new SumNotFoundException("Значение не найдено");
        }
        return Sum.toModel(entity);
    }

    public boolean add(String name, Integer value){
        SumEntity entity = new SumEntity();
        entity.setName(name);
        entity.setValue(value);
        SumEntity savedEntity =(SumEntity) userRepo.save(entity);
        if (savedEntity != null){
            return true;
        }else{
            return false;
        }
    }

    public void delete(String name) throws SumNotFoundException {
        SumEntity entity = userRepo.findByName(name);
        if(entity != null){
            userRepo.delete(entity);
        }else{
            throw new SumNotFoundException("Значение не найдено");
        }
    }


}

