package com.example.ventasvehiculos.controller;

import com.example.ventasvehiculos.controller.model.Vehiculo;
import com.example.ventasvehiculos.controller.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    @PostMapping
    public Vehiculo saveVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.saveVehiculo(vehiculo);
    }

    @DeleteMapping("/{placa}")
    public void deleteVehiculo(@PathVariable String placa) {
        vehiculoService.deleteVehiculo(placa);
    }
}
