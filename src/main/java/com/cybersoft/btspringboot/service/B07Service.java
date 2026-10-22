package com.cybersoft.btspringboot.service;


import com.cybersoft.btspringboot.dto.response.B07ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class B07Service {
    public B07ResponseDTO login(String username, String password){
        if(username.isBlank() || password.isBlank()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "username or password can not empty");
        }
        if(!username.equals("admin") || !password.equals("123")){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"username or password is wrong");
        }

        B07ResponseDTO b07RequestDTO = new B07ResponseDTO();
        b07RequestDTO.setToken("b07-login-token-123");
        System.out.println("Login successfully");

        return b07RequestDTO;
    }
}
