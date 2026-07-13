package com.example.bootcamp_santander_ai.service;

import com.example.bootcamp_santander_ai.model.Tutor;

public interface TutorService {
    Iterable<Tutor> findAll();
    Tutor findById(Long id);
    void insert(Tutor tutor);
    void update(Long id, Tutor tutor);
    void delete(Long id);
}