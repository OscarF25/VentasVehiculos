package com.example.ventasvehiculos.controller.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    private String identificacion;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean activo = true;
}