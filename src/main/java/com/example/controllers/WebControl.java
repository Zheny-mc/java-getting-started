package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebControl {

    @GetMapping("/")
    public String to() {
        return "index";
    }

    @GetMapping("/main")
    public String toMain() {
        return "main";
    }

    @GetMapping("/basket")
    public String toBasket() {
        return "basket";
    }


}