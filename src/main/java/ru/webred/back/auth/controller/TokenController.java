//package ru.webred.back.auth.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@RequestMapping
//@Controller
//public class TokenController {
//    private TokenService tokenService;
//@Autowired
//    public TokenController (TokenService tokenService){this tokenService=tokenService;}
//
//@GetMapping(/Get)
//public <value> ResponseEntity getToken(RequestParam(value="username")String username, @RequestParam(value="password")String password {
//    try {
//        return ResponseEntity.ok(tokenService.getToken(username,password));
//    }
//    catch (UsernameNotFoundException e) {
//        e.printStackTrace();
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//    }
//)
//@PostMapping(value = "/check",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE);
//public ResponseEntity checkToken(RequestParam String token) {
//    return ResponseEntity.ok(tokenService.checkToken(token));
//}
//
//
//
//}
