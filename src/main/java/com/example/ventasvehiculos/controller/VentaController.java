package com.example.ventasvehiculos.controller;

import com.example.ventasvehiculos.model.Venta;
import com.example.ventasvehiculos.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @PostMapping
    public Venta saveVenta(@RequestBody Venta venta) {
        return ventaService.saveVenta(venta);
    }

    @DeleteMapping("/{codigoVenta}")
    public void deleteVenta(@PathVariable Long codigoVenta) {
        ventaService.deleteVenta(codigoVenta);
    }
}