package com.example.ventasvehiculos.repository;

import com.example.ventasvehiculos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
}