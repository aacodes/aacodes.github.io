package org.aacodes.aatuts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("about")
    public String getAboutPage() {
        System.out.println("about page");
        return "about";
    }
}
