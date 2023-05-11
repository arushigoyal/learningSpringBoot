package com.example.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class myController {

    MyBean autoWire;

    @Autowired
    User user;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {

        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello1")
    public String sayHello1(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/foos")
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }

    @GetMapping("/api/employees/{id}")
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }

}
