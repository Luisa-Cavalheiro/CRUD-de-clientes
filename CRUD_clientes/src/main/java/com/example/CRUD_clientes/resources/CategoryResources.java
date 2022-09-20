package com.example.CRUD_clientes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD_clientes.entities.Clientes;

@RestController
@RequestMapping(value = "/clientes")
public class CategoryResources {

@GetMapping    
public ResponseEntity<List<Clientes>> findAll() {
        List <Clientes> list = new ArrayList<>();
        list.add(new Clientes(1L, "João da Silva"));
        list.add(new Clientes(2L, "Marina Barbosa"));
        list.add(new Clientes(3L, "Luisa Abreu"));
        list.add(new Clientes(4L, "Cauã Gianechini"));
        list.add(new Clientes(5L, "Leonardo Onix"));
        return ResponseEntity.ok().body(list);
    }

}
