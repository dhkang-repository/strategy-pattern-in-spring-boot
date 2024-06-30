package com.thegeekyasian.designpatterns.observation.order.event;

import com.thegeekyasian.designpatterns.observation.order.service.PaymentService;
import com.thegeekyasian.designpatterns.observation.order.service.ShippingService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderEventListener(PaymentService paymentService, ShippingService shippingService) {
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    @EventListener
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {
        paymentService.processPayment(event.getOrder());
        shippingService.scheduleShipping(event.getOrder());
    }
}
