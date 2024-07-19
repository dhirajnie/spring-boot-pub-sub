package com.event.event_based_arch;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class OrderEvent extends ApplicationEvent {
    int orderId;

    public OrderEvent(Object source) {
        super(source);
    }

    public OrderEvent(Object source, Clock clock) {
        super(source, clock);
    }
//
//    public OrderEvent(int orderId) {
//        this.orderId = orderId;
//    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
