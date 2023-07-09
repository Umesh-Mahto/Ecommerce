package com.geekster.EcommerceApi.services;

import com.geekster.EcommerceApi.models.Product;
import com.geekster.EcommerceApi.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String createProduct(Product productList) {
        iProductRepo.save(productList);
        return "product added";
    }

    public List<Product> getAllProduct() {
        return iProductRepo.findAll();
    }

    public String deleteById(Integer id) {
        iProductRepo.deleteById(id);
        return "product deleted";
    }

    public Optional<Product> getProductById(Integer id) {
        return iProductRepo.findById(id);
    }
}
