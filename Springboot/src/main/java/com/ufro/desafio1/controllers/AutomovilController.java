package com.ufro.desafio1.controllers;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automoviles")
public class AutomovilController {

    private final AutoService automovilService;

    @Autowired
    public AutomovilController(AutoService automovilService) {
        this.automovilService = automovilService;
    }

    @GetMapping("/")
    public List<Automovil> obtenerAutomoviles() {
        return automovilService.obtenerAutomoviles();
    }

    @PostMapping("/generar")
    public List<Automovil> generarAutomoviles(@RequestParam("cantidad") int cantidad) {
        return automovilService.generarAutomoviles(cantidad);
    }
}