package com.geekster.EcommerceApi.services;

import com.geekster.EcommerceApi.models.Address;
import com.geekster.EcommerceApi.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
   private IAddressRepo iAddressRepo;

    public String createAddress(Address addressObj) {
            iAddressRepo.save(addressObj);
            return "address added";
    }

    public Optional<Address> getAddressById(Integer id) {
        return iAddressRepo.findById(id);
    }
}
