package com.example.springbootexample;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void getName() {
        System.out.println("This is auto wiring");
    }
}
