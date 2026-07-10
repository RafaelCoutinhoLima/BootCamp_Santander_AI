package com.example.bootcamp_santander_ai.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.bootcamp_santander_ai.model.Address;

public interface AddressRepository extends CrudRepository<Address,String> {
}
