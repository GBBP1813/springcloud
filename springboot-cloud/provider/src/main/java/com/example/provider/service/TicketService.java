package com.example.provider.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService  implements  Ticket{
    @Override
    public  String getTicket(){
        return "《后来的我们》";
    }
}
