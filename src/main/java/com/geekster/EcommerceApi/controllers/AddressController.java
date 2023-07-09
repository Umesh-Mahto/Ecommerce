package com.geekster.EcommerceApi.controllers;

import com.geekster.EcommerceApi.models.Address;
import com.geekster.EcommerceApi.models.User;
import com.geekster.EcommerceApi.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/createAddress")
    public String createAddress(@RequestBody Address addressObj) {
        return addressService.createAddress(addressObj);
    }

    @GetMapping("getAddressById/{id}")
    public Optional<Address> addressList(@PathVariable Integer id) {
        return addressService.getAddressById(id);
    }
}