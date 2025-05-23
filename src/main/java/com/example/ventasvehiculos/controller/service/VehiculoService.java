package com.example.ventasvehiculos.controller.service;

import com.example.ventasvehiculos.controller.model.Vehiculo;
import com.example.ventasvehiculos.controller.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculo(String placa) {
        vehiculoRepository.deleteById(placa);
    }
}