package com.example.oopaopspringboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AopController {

    @GetMapping("/get/{id}")
    public String httpGetMethod(@PathVariable Long id, @RequestParam String name) {
        System.out.println("Get 실행");
        System.out.println("Get {id} : " + id);
        System.out.println("Get {name} : " + name);


        return id + "" + name;
    }

    @PostMapping("/post")
    public String
}
