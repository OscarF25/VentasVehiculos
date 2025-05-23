package com.example.ventasvehiculos.controller.repository;

import com.example.ventasvehiculos.controller.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
}