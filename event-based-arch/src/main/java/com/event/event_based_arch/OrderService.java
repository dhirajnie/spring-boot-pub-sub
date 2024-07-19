package com.event.event_based_arch;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private ApplicationEventPublisher publisher;
    public OrderService(ApplicationEventPublisher publisher){
        this.publisher=publisher;
    }

    public void placeOrder(){
        var orderEvent = new OrderEvent(this);
        orderEvent.setOrderId(123);
        publisher.publishEvent(orderEvent);
    }
}
