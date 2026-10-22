package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.dto.response.B07ResponseDTO;
import com.cybersoft.btspringboot.service.B07Service;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login-form")
public class B07Controller {
    private final B07Service b07Service;

    public B07Controller (B07Service b07Service){
        this.b07Service = b07Service;
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<B07ResponseDTO> login(@RequestParam String username,
                                         @RequestParam String password){
       return ResponseEntity.status(200).body(b07Service.login(username,password));
    }
}
