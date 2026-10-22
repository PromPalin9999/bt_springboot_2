package com.cybersoft.btspringboot.service;


import com.cybersoft.btspringboot.dto.request.B09RequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class B09Service {
    public void putInfo (int id, B09RequestDTO email){
        if(id <= 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id is invalid");
            }
        if(email == null || email.getEmail() == null || email.getEmail().isBlank()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"No information to update");
        }
        System.out.println("id "+ id  + " updated successfully");

    }
}
