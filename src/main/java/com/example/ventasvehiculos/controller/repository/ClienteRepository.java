package com.example.ventasvehiculos.controller.repository;

import com.example.ventasvehiculos.controller.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}