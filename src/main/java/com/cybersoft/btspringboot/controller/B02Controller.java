package com.cybersoft.btspringboot.controller;

import com.cybersoft.btspringboot.dto.request.B02RequestDTO;
import com.cybersoft.btspringboot.service.B02Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class B02Controller {

    private final B02Service b02Service;
    public B02Controller(B02Service b02Service) {
        this.b02Service = b02Service;
    }
    @PostMapping
    public ResponseEntity<Void>postCmt(@RequestParam int postId,
                                       @RequestBody B02RequestDTO content ){
     b02Service.postCmt(postId, content.getContent());
        return ResponseEntity.noContent().build();
    }



}
