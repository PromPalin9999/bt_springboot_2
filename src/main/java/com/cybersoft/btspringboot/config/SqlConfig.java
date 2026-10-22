package com.cybersoft.btspringboot.config;


import com.cybersoft.btspringboot.dto.response.B01ResponseDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SqlConfig {

    @Bean
    public B01ResponseDTO connectB01(){
B01ResponseDTO b01ResponseDTO = new B01ResponseDTO();
b01ResponseDTO.setOrderId(101);
b01ResponseDTO.setCurrency("VND");
return b01ResponseDTO;
    }

}
