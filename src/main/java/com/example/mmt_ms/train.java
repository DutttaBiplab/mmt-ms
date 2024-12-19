package com.example.mmt_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trains {

    @GetMapping("/trains")
    public String   getdata() {return "please ebook trains at 20% discount"; }
}