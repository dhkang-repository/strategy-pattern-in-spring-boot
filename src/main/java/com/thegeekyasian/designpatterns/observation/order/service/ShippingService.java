package com.thegeekyasian.designpatterns.observation.order.service;

import com.thegeekyasian.designpatterns.observation.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void scheduleShipping(Order order) {
        // 배송 일정 잡기 로직
        System.out.println("Scheduling shipping for order: " + order.getOrderId());
    }
}
