package com.example.bootcamp_santander_ai.model;
import jakarta.persistence.*;
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;
}
