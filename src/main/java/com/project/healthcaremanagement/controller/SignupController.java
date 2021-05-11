package com.project.healthcaremanagement.controller;
import com.project.healthcaremanagement.model.DoctorModel;
import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/patients")
@RestController
public class SignupController
{
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public boolean Signup(@RequestBody UserModel  data)
    {
        try{
            userService.addPost(data);
            return true;
        }
        catch(Exception e)
        {
          return false;
        }
    }
    @PostMapping("/savedoctor")
    public boolean Signup(@RequestBody DoctorModel data)
    {
        try{
            userService.adddoctor(data);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }

    }


}
