package com.geekster.EcommerceApi.controllers;

import com.geekster.EcommerceApi.models.Order;
import com.geekster.EcommerceApi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("post")
    public String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
    @GetMapping("getOrderById/{id}")
   public Optional<Order>orderList(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

}
