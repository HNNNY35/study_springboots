package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"", "/", "/main"})    // http://localhost:8080/home
    public String main(){
        int i = 0;
        return "WEB-INF/views/main.jsp";
    }
    @RequestMapping(value = "/home")    // http://localhost:8080/home
    public void home(){
        int i = 0;  // jsp가 없어서 화이트라벨 에러 뜸
    }
    @RequestMapping(value = "/homejsp")    // http://localhost:8080/home
    public String homejsp(){
        int i = 0;
        return "WEB-INF/views/home.jsp";
    }
    @RequestMapping(value = "/homehtml")    // http://localhost:8080/home
    public String homehtml(){
        int i = 0;
        return "WEB-INF/views/home.html";   // 여긴 들어오는데 화이트라벨 에러 뜸
    }
}