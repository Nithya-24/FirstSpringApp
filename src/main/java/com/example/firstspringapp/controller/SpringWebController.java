package com.example.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SpringWebController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "Custom message from Bridgelabz");
        return "message";
    }
}
