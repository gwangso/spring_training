package com.icia.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public void method1() {

    }
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
