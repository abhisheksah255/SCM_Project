package com.abhisheksah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class PageController {


    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is the home page API");
        model.addAttribute("name", "Abhishek");
        model.addAttribute("age", "21");
        model.addAttribute("gender", "Male");

        return "home";
    }
}
