package com.example.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER")
public interface TicketClientService {

    @GetMapping("/ticket")
    public String getTicket();
}
