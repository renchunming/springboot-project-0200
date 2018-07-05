package com.example.springbootproject0200.controller;

import com.example.springbootproject0200.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public Object login(){

        return new User("jim","123123");
    }


}
