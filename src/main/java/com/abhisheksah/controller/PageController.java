package com.abhisheksah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {


    @RequestMapping("/home")
    public String homePage(Model model) {
        System.out.println("This is the home page API");
        model.addAttribute("name", "Abhishek");
        model.addAttribute("age", "21");
        model.addAttribute("gender", "Male");

        return "home";
    }

@RequestMapping("/about")
public String aboutPage(){
System.out.println("This is the about page API");
    return "about";
}

@RequestMapping("/service")
public String servicePage(){
System.out.println("This is the service page API");
    return "about";
}

}