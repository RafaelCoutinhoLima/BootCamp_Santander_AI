package com.example.bootcamp_santander_ai.service;

import com.example.bootcamp_santander_ai.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="viacep",url="http://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
