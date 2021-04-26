package com.project.healthcaremanagement.controller;


import com.project.healthcaremanagement.model.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SignupController {


    @RequestMapping(method= RequestMethod.POST value="/signup")
    public String saveUser(UserModel user){



    }




}
