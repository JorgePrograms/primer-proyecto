package com.example.tiendaElectronica.domain.ports.out;

import com.example.tiendaElectronica.domain.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositoryPort {
    Cliente save(Cliente cliente);
    Optional<Cliente> findById(Long id);
    List<Cliente> findAll();
    Optional<Cliente> update(Long id, Cliente cliente);
    boolean deleteById(Long id);
}
