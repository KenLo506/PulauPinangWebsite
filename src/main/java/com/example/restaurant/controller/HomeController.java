package com.example.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @RequestMapping(value = "/index")
    @GetMapping("/")
    public String home(Model model) {
        // Add any required data to the model if needed
        return "home";
    }
}
