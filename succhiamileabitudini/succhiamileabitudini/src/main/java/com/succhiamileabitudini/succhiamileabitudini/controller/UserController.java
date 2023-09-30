package com.succhiamileabitudini.succhiamileabitudini.controller;

import com.succhiamileabitudini.succhiamileabitudini.dtos.UserDto;
import com.succhiamileabitudini.succhiamileabitudini.entity.UserEntity;
import com.succhiamileabitudini.succhiamileabitudini.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("/user")
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping( "/insert")
    public UserEntity test(@Valid  @RequestBody UserDto user){

        UserEntity userEntity = new UserEntity();
        userEntity.setCognome(userEntity.getCognome());
        userEntity.setNome(user.getNome());
        userEntity.setEmail(user.getEmail());
        userEntity.setCf(user.getCf());

       return userRepository.save(userEntity);

    }

    @GetMapping("/users")
    List<UserEntity> getusers(){
        return userRepository.findAll();
    }





}
