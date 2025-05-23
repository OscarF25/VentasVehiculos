package com.example.ventasvehiculos.service;

import com.example.ventasvehiculos.model.Venta;
import com.example.ventasvehiculos.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteVenta(Long codigoVenta) {
        ventaRepository.deleteById(codigoVenta);
    }
}