package com.project.healthcaremanagement.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/users")
@RestController
public class SignupController
{
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public void Signup(@RequestBody UserModel  data)
    {
        userService.addPost(data);
        System.out.println("a");

    }







}
