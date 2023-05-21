package com.ufro.desafio1.controllers;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.services.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081")
public class AutomovilController {

    private final AutomovilService automovilService;

    @Autowired
    public AutomovilController(AutomovilService automovilService) {
        this.automovilService = automovilService;
    }


    @GetMapping("/api")
    public List<Automovil> obtenerAutomoviles() {
        return automovilService.getListaAutomovil();
    }

    @PostMapping("/generar")
    public void generarAutomoviles(@RequestParam("cantidad") int cantidad) {
        automovilService.generarAutomoviles(cantidad);
    }
}