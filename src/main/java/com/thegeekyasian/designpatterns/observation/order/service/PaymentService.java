package com.thegeekyasian.designpatterns.observation.order.service;

import com.thegeekyasian.designpatterns.observation.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(Order order) {
        // 결제 처리 로직
        System.out.println("Processing payment for order: " + order.getOrderId());
    }


}
