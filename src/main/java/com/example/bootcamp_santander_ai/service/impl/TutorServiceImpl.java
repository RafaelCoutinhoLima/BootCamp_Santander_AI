package com.example.bootcamp_santander_ai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootcamp_santander_ai.model.Address;
import com.example.bootcamp_santander_ai.model.Tutor;
import com.example.bootcamp_santander_ai.repository.AddressRepository;
import com.example.bootcamp_santander_ai.repository.TutorRepository;
import com.example.bootcamp_santander_ai.service.TutorService;
import com.example.bootcamp_santander_ai.service.ZipCodeClient;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ZipCodeClient zipCodeClient;

    @Override
    public Iterable<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    @Override
    public Tutor findById(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    @Override
    public void insert(Tutor tutor) {
        saveTutorWithZipCode(tutor);
    }

    @Override
    public void update(Long id, Tutor tutor) {
        if (tutorRepository.findById(id).isPresent()) {
            saveTutorWithZipCode(tutor);
        }
    }

    @Override
    public void delete(Long id) {
        tutorRepository.deleteById(id);
    }
    private void saveTutorWithZipCode(Tutor tutor) {
        String zipCode = tutor.getAddress().getZipCode();

        Address address = addressRepository.findById(zipCode).orElseGet(() -> {
            Address newAddress = zipCodeClient.getAddressByZipCode(zipCode);
            addressRepository.save(newAddress);
            return newAddress;
        });

        tutor.setAddress(address);
        tutorRepository.save(tutor);
    }
}