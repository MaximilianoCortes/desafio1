package com.ufro.desafio1.controllers;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081")
public class AutomovilController {

    @Autowired
    private AutomovilRepository automovilRepository;


    @GetMapping("/automoviles")
    public List<Automovil> obtenerAutomoviles() {
        return automovilRepository.obtenerAutomoviles();
    }

    @PostMapping("/generar")
    public void generarAutomoviles(@RequestParam("cantidad") int cantidad) {
        automovilRepository.generarAutomoviles(cantidad);
    }
}