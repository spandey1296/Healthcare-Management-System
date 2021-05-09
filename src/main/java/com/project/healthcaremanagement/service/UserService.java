package com.project.healthcaremanagement.service;

import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    public UserRepository userRepository;
    public void addPost(UserModel users)
    {
        userRepository.save(users);

    }
}
