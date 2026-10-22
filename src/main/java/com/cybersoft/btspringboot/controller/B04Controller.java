package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.dto.response.B04ResponseDTO;
import com.cybersoft.btspringboot.service.B04Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class B04Controller {

    private final B04Service b04Service;

    public B04Controller (B04Service b04Service){
        this.b04Service = b04Service;
    }

    @GetMapping
    public ResponseEntity<B04ResponseDTO> getSearch(@RequestParam String keyword,
                                                    @RequestParam(defaultValue = "0") int page,
                                                    @RequestParam(defaultValue = "10") int size
                                                    ){
        return ResponseEntity.status(200).body(b04Service.getSearch(keyword, page, size));
    }

}
