package com.example.ventasvehiculos.controller;

import com.example.ventasvehiculos.model.Cliente;
import com.example.ventasvehiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{identificacion}")
    public void deleteCliente(@PathVariable String identificacion) {
        clienteService.deleteCliente(identificacion);
    }
}
