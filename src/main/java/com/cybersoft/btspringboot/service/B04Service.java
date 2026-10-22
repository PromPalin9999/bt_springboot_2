package com.cybersoft.btspringboot.service;


import com.cybersoft.btspringboot.dto.response.B04ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class B04Service {

    public B04ResponseDTO getSearch(String keyword, int page, int size){

        if(keyword == null || keyword.isBlank()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "keyword is empty!!");
        }

        B04ResponseDTO b04ResponseDTO = new B04ResponseDTO();

        b04ResponseDTO.setKeyword(keyword);
        b04ResponseDTO.setPage(page);
        b04ResponseDTO.setSize(size);
        return b04ResponseDTO;
    }
}
