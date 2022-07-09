package edu.mum.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/home"})
    public String displayHomepage() {
        return "index";
    }

    @GetMapping(value = {"/about"})
    public String displayAboutpage() {
        return "about";
    }
}
