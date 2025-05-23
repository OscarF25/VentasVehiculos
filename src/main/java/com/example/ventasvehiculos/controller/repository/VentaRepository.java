package com.example.ventasvehiculos.controller.repository;

import com.example.ventasvehiculos.controller.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
