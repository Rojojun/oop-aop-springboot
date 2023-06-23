package com.example.oopaopspringboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AopController {

    @GetMapping("/get/{id}")
    public String httpGetMethod(@PathVariable Long id, @RequestParam String name) {
        return id + "" + name;
    }
}
