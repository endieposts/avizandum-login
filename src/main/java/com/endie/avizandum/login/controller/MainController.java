package com.endie.avizandum.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("testString")
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {

        String testString = "foo";

        model.addAttribute("testString", testString);

        return "login";
    }

    @GetMapping("/user")
    public String userIndex(@ModelAttribute("testString") String testString) {
        return "index";
    }
}