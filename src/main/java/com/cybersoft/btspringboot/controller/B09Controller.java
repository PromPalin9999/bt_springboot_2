package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.dto.request.B09RequestDTO;
import com.cybersoft.btspringboot.service.B09Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class B09Controller {
    private final B09Service b09Service;

    public B09Controller(B09Service b09Service){
        this.b09Service = b09Service;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> putInfo(@PathVariable int id,
                                 @RequestBody(required = false) B09RequestDTO email){
        b09Service.putInfo(id, email);
        return ResponseEntity.noContent().build();
    }
}
