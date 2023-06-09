package com.ufro.desafio1.controllers;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @RequestMapping("/generar")
    @ResponseBody
    public List<Automovil> listCars(@RequestParam("cantidad") int cantidad){
        return automovilRepository.generarAutomoviles(cantidad);
    }

    @RequestMapping("/filtrar")
    @ResponseBody
    public List<Automovil> filtrarAutos(@RequestParam("precio") int precio){
        return automovilRepository.filtrarAutomovilesPorPrecio(precio);
    }
    @GetMapping("/filtrados")
    public List<Automovil> filtrarAutomovilesPorPrecio() {
        return automovilRepository.obtenerAutomovilesFiltrados();
    }

}