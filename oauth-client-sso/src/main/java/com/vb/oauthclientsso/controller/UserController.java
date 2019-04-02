package com.vb.oauthclientsso.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("/user/me")
    public Authentication user(Authentication user) {
        System.out.println("xyz  : "+user.getName()+" ");
        return user;
    }

}
