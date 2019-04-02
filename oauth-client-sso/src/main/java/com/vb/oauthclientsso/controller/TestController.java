package com.vb.oauthclientsso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/logoutS")
    public String LogOut(){
        return "logout successed !";
    }

}
