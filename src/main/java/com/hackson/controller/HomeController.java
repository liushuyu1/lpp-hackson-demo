package com.hackson.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/home")
    public String home(){
        return "expediaHome";
    }

    @RequestMapping("/search")
    public String search(){
        return "hotelSearch";
    }

    @RequestMapping("/info")
    public String info(){
        return "hotelInfo";
    }

    @RequestMapping("/review")
    public String review(){
        return "reviewDialog";
    }

}
