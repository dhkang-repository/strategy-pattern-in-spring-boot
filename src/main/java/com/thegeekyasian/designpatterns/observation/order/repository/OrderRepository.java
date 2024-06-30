package com.thegeekyasian.designpatterns.observation.order.repository;

import com.thegeekyasian.designpatterns.observation.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
