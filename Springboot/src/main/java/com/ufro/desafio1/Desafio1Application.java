package com.ufro.desafio1;

import com.ufro.desafio1.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);
    }

    @Autowired
    private AutomovilRepository automovilRepository;
    @Override
    public void run(String... args) throws Exception {
        automovilRepository.generarAutomoviles(30);

    }
}
