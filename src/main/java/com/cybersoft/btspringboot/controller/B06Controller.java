package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.service.B06Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/filters")
public class B06Controller {
    private final B06Service b06Service;

    public B06Controller (B06Service b06Service){
        this.b06Service = b06Service;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> getFilter(@RequestParam Map<String, String> filters) {
        return ResponseEntity.status(200).body(b06Service.getFilter(filters));
    }

}
