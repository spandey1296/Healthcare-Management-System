package com.project.healthcaremanagement.service;

import com.project.healthcaremanagement.model.DoctorModel;
import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.repository.DoctorRepository;
import com.project.healthcaremanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public DoctorRepository doctorRepository;
    public void addPost(UserModel users)
    {
        userRepository.save(users);
    }
    public void adddoctor(DoctorModel data)
    {
        doctorRepository.save(data);
    }
}
