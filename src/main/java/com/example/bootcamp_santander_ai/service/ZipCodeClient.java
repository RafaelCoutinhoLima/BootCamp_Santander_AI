package com.example.bootcamp_santander_ai.service;

import com.example.bootcamp_santander_ai.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ZipCodeClient",url="http://ZipCodeClient.com.br/ws")
public interface ZipCodeClient {
    @GetMapping("/{zipCode}json/")
    Address getAddressByZipCode(@PathVariable("zipCode") String zipCode);
}
