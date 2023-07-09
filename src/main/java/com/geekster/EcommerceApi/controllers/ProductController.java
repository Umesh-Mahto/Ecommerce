package com.geekster.EcommerceApi.controllers;

import com.geekster.EcommerceApi.models.Order;
import com.geekster.EcommerceApi.models.Product;
import com.geekster.EcommerceApi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("createProduct")
    public String createProduct(@RequestBody Product productList){
        return productService.createProduct(productList);
    }
    @GetMapping("getAllProduct")
    public List<Product> productList(){
        return productService.getAllProduct();
    }
    @GetMapping("getProductById/{id}")
    public Optional<Product> productList(@PathVariable Integer id) {
        return productService.getProductById(id);
    }
    @DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        return productService.deleteById(id);
    }
}
