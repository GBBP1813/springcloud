package com.example.consumerfeign.controller;


import com.example.consumerfeign.service.TicketClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
     private  TicketClientService ticketClientService;



    @GetMapping("/buy")
    public  String buyTicket(String name){

        return name+"购买了"+ticketClientService.getTicket();
    }
}
