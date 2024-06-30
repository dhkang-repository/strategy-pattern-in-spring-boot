package com.thegeekyasian.designpatterns.observation.order.controller;

import com.thegeekyasian.designpatterns.observation.order.model.Order;
import com.thegeekyasian.designpatterns.observation.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return "Order created successfully" + order.toString();
    }
//
//    @PostMapping("/reactive")
//    public Mono<String> createOrderReactive(@RequestBody Order order) {
//        return orderService.createOrderReactive(order)
//                .thenReturn("Order created successfully");
//    }
}
