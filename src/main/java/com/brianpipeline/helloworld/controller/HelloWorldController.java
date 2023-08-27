package com.brianpipeline.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld(@Value("${env.var}") String thing) {
        System.out.println(thing);
        return "hello world!";
    }
}
