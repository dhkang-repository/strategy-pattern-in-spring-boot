package com.thegeekyasian.designpatterns.observation.order.service;

import com.thegeekyasian.designpatterns.observation.order.event.OrderCreatedEvent;
import com.thegeekyasian.designpatterns.observation.order.model.Order;
import com.thegeekyasian.designpatterns.observation.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final ApplicationEventPublisher eventPublisher;
    private final OrderRepository orderRepository;
//    private final ReactiveOrderRepository reactiveOrderRepository;

    public void createOrder(Order order) {
        // 주문을 JPA를 사용하여 데이터베이스에 저장
        orderRepository.save(order);

        // 주문 생성 이벤트 발행
        OrderCreatedEvent event = new OrderCreatedEvent(this, order);
        eventPublisher.publishEvent(event);
    }
//
//    public Mono<Order> createOrderReactive(Order order) {
//        return reactiveOrderRepository.save(order)
//                .doOnSuccess(savedOrder -> {
//                    // 주문 생성 이벤트 발행
//                    OrderCreatedEvent event = new OrderCreatedEvent(this, savedOrder);
//                    eventPublisher.publishEvent(event);
//                });
//    }
}
