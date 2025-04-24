package com.example.controller;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

public class Person_Controller {

    @RestController
@RequestMapping("valid")
public class PersonController {

    @PostMapping
    public Result validUser(@Valid @RequestBody UserDTO userDTO) {
        if (UserDTO.Inn([0]<5)) {
            return Result.validUser('ООО "Рога и копыта"');
        }
        else (UserDTO.Inn([0]= 5-8)) {
            return Result.validUser('ООО "Заглушкасервис"');
        }
        else (UserDTO.Inn([0] >=8)) {
            return Result.validUser('ООО "Волга"');
        }
        return Result.validUser();
    }

   
    }

}

