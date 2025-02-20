package com.anajumartins.webservice.services;

import com.anajumartins.webservice.entities.Order;
import com.anajumartins.webservice.entities.User;
import com.anajumartins.webservice.repositories.OrderRepository;
import com.anajumartins.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
