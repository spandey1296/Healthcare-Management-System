package com.project.healthcaremanagement.controller;

import com.project.healthcaremanagement.model.LoginModel;
import com.project.healthcaremanagement.model.UserModel;
import com.project.healthcaremanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/users")
@RestController
public class LoginController
{
    @Autowired
    public LoginService loginService;
    @PostMapping("/login")
    public String login(@RequestBody LoginModel body)
    {
        int flag=0;
        List<UserModel>list=loginService.LoginServer();
        for(int i=0;i<list.size();i++)
        {
            UserModel temp=list.get(i);
            if(temp.getUsername()== body.getUsername())
            {
              flag=1;
              break;
            }
        }
        if(flag==1)
        {
            String response ="{\"success\":true,\"message\":\"Post has been added successfully\"}";
            return response;

        }
        else
        {
            String response ="{\"Not success\":true,\"message\":\"Post has not  been added successfully\"}";
            return response;
        }


    }
}
