package com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	Cliente findByCpf(String cpf);

} 
