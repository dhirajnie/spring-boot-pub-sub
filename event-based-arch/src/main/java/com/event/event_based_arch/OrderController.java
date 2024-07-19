package com.event.event_based_arch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/placeOrder")
    public boolean placeOrer(){
        orderService.placeOrder();
        return true;
    }
}

