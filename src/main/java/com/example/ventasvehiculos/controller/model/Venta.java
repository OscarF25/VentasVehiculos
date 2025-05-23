package com.example.ventasvehiculos.controller.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;

    @ManyToOne  // Una venta tiene un cliente
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne  // Una venta tiene un vehículo
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;
}
