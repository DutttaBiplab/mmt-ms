package com.example.mmt_ms.;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {

    @GetMapping("/flights")
    public String getdata() {return "please ebook flights at 20% discount"; }
}