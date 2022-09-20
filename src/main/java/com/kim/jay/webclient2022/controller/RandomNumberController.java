package com.kim.jay.webclient2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/randomnumber")
public class RandomNumberController {
    private final Random random = new Random();

    @GetMapping
    @RequestMapping("/int")
    public int getRandomInt() {
        return random.nextInt();
    }
}
