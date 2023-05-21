package com.ufro.desafio1.controllers;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automoviles")
@CrossOrigin(origins = "http://localhost:8081")
public class AutomovilController {

    private final AutoService automovilService;

    @Autowired
    public AutomovilController(AutoService automovilService) {
        this.automovilService = automovilService;
    }

    @GetMapping("/")
    public String obtenerAutomovilesView() {
        return "index";
    }

    @GetMapping("/api")
    public ResponseEntity<List<Automovil>> obtenerAutomoviles() {
        List<Automovil> automoviles = automovilService.obtenerAutomoviles();
        return ResponseEntity.ok().body(automoviles);
    }

    @PostMapping("/generar")
    public ResponseEntity<List<Automovil>> generarAutomoviles(@RequestParam("cantidad") int cantidad) {
        List<Automovil> automovilesGenerados = automovilService.generarAutomoviles(cantidad);
        return ResponseEntity.ok().body(automovilesGenerados);
    }
}