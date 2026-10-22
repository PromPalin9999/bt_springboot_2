package com.cybersoft.btspringboot.service;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class B10Service {
    public void deletePost (int id, String authorization){
        if(id <= 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"id is invalid");
        }
        if(authorization == null || authorization.isBlank()){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "authorization header must not empty");
        }
        if(!authorization.startsWith("Bearer ") || authorization.substring(7).isBlank()){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "authorization header is invalid");

        }
        System.out.println("Deleted post with id " + id);
    }
}
