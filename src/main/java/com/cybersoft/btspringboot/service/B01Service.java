package com.cybersoft.btspringboot.service;

import com.cybersoft.btspringboot.dto.response.B01ResponseDTO;
import org.springframework.stereotype.Service;


@Service
public class B01Service {
public B01ResponseDTO getOrder(int orderId, String currency){
    B01ResponseDTO b01ResponseDTO = new B01ResponseDTO();
    b01ResponseDTO.setOrderId(orderId);
    b01ResponseDTO.setCurrency(currency);
    return b01ResponseDTO;
}
}
