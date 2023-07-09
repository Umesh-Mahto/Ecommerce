package com.geekster.EcommerceApi.services;

import com.geekster.EcommerceApi.models.Address;
import com.geekster.EcommerceApi.models.Order;
import com.geekster.EcommerceApi.models.Product;
import com.geekster.EcommerceApi.models.User;
import com.geekster.EcommerceApi.repository.IAddressRepo;
import com.geekster.EcommerceApi.repository.IOrderRepo;
import com.geekster.EcommerceApi.repository.IProductRepo;
import com.geekster.EcommerceApi.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    @Autowired
    IAddressRepo iAddressRepo;
    @Autowired
    IProductRepo iProductRepo;
    @Autowired
    IUserRepo iUserRepo;

    public String addOrder(Order order) {
        Integer userId=order.getUser().getUserId();
        User userObj=iUserRepo.findById(userId).get();
        order.setUser(userObj);


        Integer addressId=order.getAddress().getAddressId();
        Address addressObj=iAddressRepo.findById(addressId).get();
        order.setAddress(addressObj);


        Integer productId=order.getProduct().getProductId();
        Product productObj=iProductRepo.findById(productId).get();
        order.setProduct(productObj);

        iOrderRepo.save(order);

        return "Order Placed Successfully!!";
    }

    public Optional<Order> getOrderById(Integer id) {
        return iOrderRepo.findById(id);

    }
}
