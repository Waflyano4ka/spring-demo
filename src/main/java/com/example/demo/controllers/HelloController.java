package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello, " + name + " " + surname);
        return "hello_world";
    }
    @GetMapping("/hello-world2")
    public String sayHello2(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname
            ){
        System.out.println("Hello, " + name + " " + surname);
        return "hello_world";
    }

    // boots-trap
    // time leave
}
