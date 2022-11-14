package ru.webred.back.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/controller")
@Controller
public class BackController {
    @GetMapping("/hello")
    public ResponseEntity helloPage(){
           return ResponseEntity.ok(true);};

    @GetMapping("/goodbye")
    public  String goodByePage(){
return "/goodbye";
    }
}
