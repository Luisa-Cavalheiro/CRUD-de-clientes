package com.example.CRUD_clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD_clientes.entities.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    
}
