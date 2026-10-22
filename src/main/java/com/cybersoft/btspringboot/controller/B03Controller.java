package com.cybersoft.btspringboot.controller;

import com.cybersoft.btspringboot.constant.HeaderConstants;
import com.cybersoft.btspringboot.dto.response.B03ResponseDTO;
import com.cybersoft.btspringboot.service.B03Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class B03Controller {

    private final B03Service b03Service;

    public B03Controller(B03Service b03Service) {
        this.b03Service = b03Service;
    }
@GetMapping("/{id}")
    public ResponseEntity<B03ResponseDTO> getUser(@PathVariable int id,
                                                  @RequestHeader(HeaderConstants.CLIENT_VERSION) String clientVersion){
        return ResponseEntity.status(200).body(b03Service.getUser(id, clientVersion));
}
}
