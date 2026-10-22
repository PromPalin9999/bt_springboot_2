package com.cybersoft.btspringboot.controller;


import com.cybersoft.btspringboot.service.B08Service;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class B08Controller {

    private final B08Service b08Service;

    public B08Controller (B08Service b08Service){
        this.b08Service = b08Service;
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
   public ResponseEntity<Void> documentPost(@RequestParam (required = false) MultipartFile file,
                                  @RequestParam String title,
                                  @RequestParam String description,
                                  @RequestParam List<String> tags){
        b08Service.documentPost(file, title, description, tags);
        return ResponseEntity.noContent().build();
    }

}
