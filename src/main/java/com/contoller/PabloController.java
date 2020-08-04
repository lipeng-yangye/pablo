package com.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PabloController {
    @GetMapping("/pablo")
    public String helloPablo(){
        return "hello pablo!";
    }
}
