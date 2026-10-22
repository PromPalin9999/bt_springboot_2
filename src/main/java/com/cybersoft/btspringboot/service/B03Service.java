package com.cybersoft.btspringboot.service;

import com.cybersoft.btspringboot.dto.response.B03ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class B03Service {

public B03ResponseDTO getUser(int id, String clientVersion){
    B03ResponseDTO b03ResponseDTO = new B03ResponseDTO();

    b03ResponseDTO.setId(id);
    b03ResponseDTO.setClientVersion(clientVersion);
    return b03ResponseDTO;
}
}
