package com.example.CRUD_clientes.services;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.CRUD_clientes.dto.ClientesDTO;
import com.example.CRUD_clientes.entities.Clientes;
import com.example.CRUD_clientes.repositories.ClientesRepository;
import com.example.CRUD_clientes.services.Exceptions.EntityNotFoundException;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    @Transactional(readOnly = true)
    public List<ClientesDTO> findAll() {
        List<Clientes> list = repository.findAll();
        return list.stream().map(x -> new ClientesDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClientesDTO findById(Long id) {
        Optional<Clientes> obj = repository.findById(id);
        Clientes entity = obj.orElseThrow(() -> new EntityNotFoundException ("Cliente não encontrado"));
        return new ClientesDTO(entity);
    }

}
