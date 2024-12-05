package com.TaskManagemntApp.TaskManagemntApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping(value = "/hello")
    public String sayHellow(){
        return "hello yash";
    }

}
