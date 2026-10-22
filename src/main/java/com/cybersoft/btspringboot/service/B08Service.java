package com.cybersoft.btspringboot.service;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class B08Service {
    public void documentPost (MultipartFile file,
                         String title,
                         String description,
                         List<String> tags){
        if(file == null || file.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"file must not empty");
        }
        if(title.isBlank() ){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"title must not empty");
        }
        if(description.isBlank()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"description must not empty");
        }
        if(tags.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"tags must not empty");
        }
        System.out.println("Upload OK: title=" + title
                + ", description=" + description
                + ", tags=" + tags
                + ", file=" + file.getOriginalFilename()
                + " (" + file.getSize() + " bytes)");

    }

}
