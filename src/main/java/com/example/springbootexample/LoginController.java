package com.example.springbootexample;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class LoginController {

    private static HashMap<String, String>  map = new HashMap<>();

    static {

        map.put("Arushi","password1");
        map.put("Sonal","password2");
        map.put("Honey","password3");
    }

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        if(password.equals(map.get(username))){
            return "Valid details";
        }else{
            return "Invalid details";
        }
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        map.put(user.getUsername(), user.getPassword());
        return  "Yes";
    }
}
