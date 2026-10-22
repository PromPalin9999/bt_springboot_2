package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.service.B05Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class B05Controller {
    private final B05Service b05Service;

    public B05Controller (B05Service b05Service){
        this.b05Service = b05Service;
    }

    @GetMapping
    public ResponseEntity<List<String>> getTagLst(@RequestParam List<String> tags){
        return ResponseEntity.status(200).body(b05Service.getTagLst(tags));
    }
}
