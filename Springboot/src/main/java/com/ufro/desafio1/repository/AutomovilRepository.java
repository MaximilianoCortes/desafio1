package com.ufro.desafio1.repository;

import com.ufro.desafio1.models.Automovil;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class AutomovilRepository {
    private List<Automovil> listaAutomoviles = new ArrayList<>();

    public List<Automovil> obtenerAutomoviles() {
        return listaAutomoviles;
    }
    public void generarAutomoviles(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Automovil automovil = new Automovil();
            automovil.setId(generarIdUnico());
            automovil.setMarca(generarMarcaAleatoria());
            automovil.setAño(generarAñoAleatorio());
            automovil.setColor(generarColorAleatorio());
            automovil.setPrecio(generarPrecioAleatorio());
            automovil.setTurbo(generarTurboAleatorio());
            automovil.setTipo(generarTipoAleatorio());
            automovil.setMotor(generarMotorAleatorio(automovil.getTipo()));
            automovil.setCabinas(generarCabinasAleatorio(automovil.getTipo()));
            automovil.setSunroof(generarSunroofAleatorio(automovil.getTipo()));
            automovil.setPopularidad(0);
            listaAutomoviles.add(automovil);
        }
    }

    public Automovil findById(int id){
        for (int i = 0; i < listaAutomoviles.size(); i++) {
            if (listaAutomoviles.get(i).getId() == (id)) {
                return listaAutomoviles.get(i);
            }
        }
        return null;
    }


    //abajo es para generarlos

    private Long generarIdUnico() {
        // Lógica para generar un ID único
        return new Random().nextLong();
    }

    private String generarMarcaAleatoria() {
        // Lógica para generar una marca aleatoria
        String[] marcas = {"Subaru","Toyota","Kia","Mitsubishi","Honda","BMW","Mazda","Ford"};
        return marcas[new Random().nextInt(marcas.length)];
    }

    private int generarAñoAleatorio() {
        // Lógica para generar un año aleatorio entre 2015 y 2023
        return new Random().nextInt(9) + 2015;
    }

    private String generarColorAleatorio() {
        // Lógica para generar un color aleatorio
        String[] color = {"Rojo","Azul","Blanco","Gris","Crema","Negro","Morado","Verde"};
        return color[new Random().nextInt(color.length)];
    }

    private double generarPrecioAleatorio() {
        // Lógica para generar un precio aleatorio entre $8,000,000 y $30,000,000
        return new Random().nextInt(22000000) + 8000000;
    }

    private boolean generarTurboAleatorio() {
        // Lógica para generar un valor de turbo aleatorio (true o false)
        return new Random().nextBoolean();
    }

    private String generarTipoAleatorio() {
        // Lógica para generar un tipo de automóvil aleatorio (Sedan, Camioneta, SUV)
        String[] tipos = {"Sedan", "Camioneta", "SUV"};
        return tipos[new Random().nextInt(tipos.length)];
    }

    private String generarMotorAleatorio(String tipo) {
        // Lógica para generar un motor aleatorio según el tipo de automóvil
        String[] motoresSedan = {"1.4cc", "1.6cc", "2.0cc"};
        String[] motoresCamioneta = {"2.4cc", "3.0cc", "4.0cc"};
        String[] motoresSUV = {"1.8cc", "2.2cc", "2.8cc"};

        switch (tipo) {
            case "Sedan":
                return motoresSedan[new Random().nextInt(motoresSedan.length)];
            case "Camioneta":
                return motoresCamioneta[new Random().nextInt(motoresCamioneta.length)];
            case "SUV":
                return motoresSUV[new Random().nextInt(motoresSUV.length)];
            default:
                return "";
        }
    }

    private int generarCabinasAleatorio(String tipo) {
        // Lógica para generar un número de cabinas aleatorio (1 o 2) para camionetas
        if (tipo.equals("Camioneta")) {
            return new Random().nextInt(2) + 1;
        } else {
            return 0;
        }
    }

    private boolean generarSunroofAleatorio(String tipo) {
        // Lógica para generar un valor de sunroof aleatorio (true o false) para SUVs
        if (tipo.equals("SUV")) {
            return new Random().nextBoolean();
        } else {
            return false;
        }
    }
}
