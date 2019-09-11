package com.endie.avizandum.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/")
    public String home() {

        return "home";
    }
}
