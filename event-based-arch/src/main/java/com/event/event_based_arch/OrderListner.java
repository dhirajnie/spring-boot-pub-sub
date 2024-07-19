package com.event.event_based_arch;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListner implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent event) {
        System.out.println("Event arrived"+event+toString());
    }
}
