package com.example.bootcamp_santander_ai.repository;
import com.example.bootcamp_santander_ai.model.Tutor;
import org.springframework.data.repository.CrudRepository;
import com.example.bootcamp_santander_ai.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco,String> {
}
