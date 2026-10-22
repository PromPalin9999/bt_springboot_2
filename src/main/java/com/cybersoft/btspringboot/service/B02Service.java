package com.cybersoft.btspringboot.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class B02Service {
    public void postCmt(int postId, String content){
    if(postId <= 0){
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "postId invalid");
    }
    if(content == null || content.isBlank()){
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Content can not empty");
    }
        System.out.println("Cmt post succesfully: postId = " + postId + " with content :" + content);
    }
}
