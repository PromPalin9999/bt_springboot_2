package com.cybersoft.btspringboot.controller;

import com.cybersoft.btspringboot.dto.response.B01ResponseDTO;
import com.cybersoft.btspringboot.service.B01Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class B01Controller {

private final B01Service b01Service;

public B01Controller(B01Service b01Service){
    this.b01Service = b01Service;
};
@GetMapping("/{orderId}")
    public ResponseEntity<B01ResponseDTO> getOrder(@PathVariable int orderId,
                                                   @RequestParam String currency ){
       return ResponseEntity.status(200).body(b01Service.getOrder(orderId,currency));
   }

}
