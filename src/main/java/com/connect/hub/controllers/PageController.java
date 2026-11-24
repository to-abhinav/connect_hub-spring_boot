package com.connect.hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String homePage(Model model) {
        System.out.println("Request received for home page");
        model.addAttribute("name", "Hello This is Harry here");
        model.addAttribute("unnacessery", "This is unnacessery part");
        return "Home";
    }

    @RequestMapping("/about")
    public String aboutUs() {
        System.out.println("About us page loding");
        return "About";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services Page");
        return "Services";
    }
    @RequestMapping("/temp")
    public String tempInsert(){
        System.out.println("temp targated");
        return "Temp";
    }
    
}
