package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.constant.HeaderConstants;
import com.cybersoft.btspringboot.service.B10Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class B10Controller {
    private final B10Service b10Service;

    public B10Controller (B10Service b10Service){
        this.b10Service = b10Service;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost (@PathVariable int id,
                                            @RequestHeader(value = HeaderConstants.AUTHORIZATION, required = false) String authorization){
        b10Service.deletePost(id, authorization);
        return ResponseEntity.noContent().build();
    }
}
