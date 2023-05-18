package com.kyrs.Interface;

import com.kyrs.Table.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findTopByOrderByIdDesc();
}
