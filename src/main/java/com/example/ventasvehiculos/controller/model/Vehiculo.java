package com.example.ventasvehiculos.controller.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    private String placa;
    private String marca;
    private String modelo;
    private double valor;
    private boolean activo = true;
}