package com.project.healthcaremanagement.service;

import com.project.healthcaremanagement.model.LoginModel;
import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService
{
    @Autowired
    public UserRepository userRepository;
    public List<UserModel> LoginServer()
    {
        return userRepository.findAll();
    }
}
