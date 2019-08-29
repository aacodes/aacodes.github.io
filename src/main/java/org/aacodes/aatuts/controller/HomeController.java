package org.aacodes.aatuts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        System.out.println("Home page");
        return "home";
    }

}
