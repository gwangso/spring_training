package com.study.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/req1")
    public String req1(){
        System.out.println("HomeController.req1");
        return "req1";
    }

    @GetMapping("/req2")
    public String req2(@RequestParam("q1") String q1, @RequestParam("q2") int q2){
        System.out.println("q1 = " + q1 + ", q2 = " + q2);
        return "welcome";
    }

    //파라미터이름=변수이름 => 파라미터이름 생략 가능
//    @GetMapping("/req2")
//    public String req2(@RequestParam String q1){
//        System.out.println("q1 = " + q1);
//        return "welcome";
//    }

    @PostMapping("/req3")
    public String req3(@RequestParam("p1") String p1, @RequestParam("p2") String p2){
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "welcome";
    }
}
