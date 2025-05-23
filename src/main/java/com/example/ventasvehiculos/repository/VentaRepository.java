package com.example.ventasvehiculos.repository;

import com.example.ventasvehiculos.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
