package com.k8sDemo.k8sDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class K8SDemoController {

    @GetMapping("am-i-lucky")
    public String myLuckyDay() {
        Random random = new Random();
        return random.nextBoolean() ? "It's your lucky Day :D" : "Oh no ! Try again,Harder :)";
    }
}
