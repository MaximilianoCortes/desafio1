package com.ufro.desafio1.services;

import com.ufro.desafio1.models.Automovil;
import com.ufro.desafio1.repository.AutomovilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AutomovilService {
    @Autowired
    private AutomovilRepository repository;



    public List<Automovil> getListaAutomovil() {
        return repository.obtenerAutomoviles();
    }

    public Automovil getById(int id) {
        return repository.findById(id);
    }

    public void generarAutomoviles(int cantidad) {
        repository.generarAutomoviles(cantidad);
    }
}