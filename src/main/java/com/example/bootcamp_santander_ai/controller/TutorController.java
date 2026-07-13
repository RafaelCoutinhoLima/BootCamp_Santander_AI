package com.example.bootcamp_santander_ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bootcamp_santander_ai.model.Tutor;
import com.example.bootcamp_santander_ai.service.TutorService;

@RestController
@RequestMapping("tutors")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @GetMapping
    public Iterable<Tutor> findAll() {
        return tutorService.findAll();
    }

    @GetMapping("/{id}")
    public Tutor findById(@PathVariable Long id) {
        return tutorService.findById(id);
    }

    @PostMapping
    public Tutor insert(@RequestBody Tutor tutor) {
        tutorService.insert(tutor);
        return tutor;
    }

    @PutMapping("/{id}")
    public Tutor update(@PathVariable Long id, @RequestBody Tutor tutor) {
        tutorService.update(id, tutor);
        return tutor;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tutorService.delete(id);
    }
}