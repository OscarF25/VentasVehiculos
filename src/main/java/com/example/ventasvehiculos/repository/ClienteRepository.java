package com.example.ventasvehiculos.repository;

import com.example.ventasvehiculos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}