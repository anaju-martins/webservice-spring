package com.anajumartins.webservice.repositories;

import com.anajumartins.webservice.entities.Category;
import com.anajumartins.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
