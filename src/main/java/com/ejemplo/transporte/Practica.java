package com.ejemplo.transporte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practica {
    public static void main(String[] args) {

        // ===== ETAPA 1 =====
        Vehiculo v = new Vehiculo("VEH301", 8);
        System.out.println(v.descripcion());        // Placa VEH301, capacidad 8
        v.setCapacidad(-5);
        System.out.println(v.getCapacidad());       // sigue siendo 8
        v.setCapacidad(10);
        System.out.println(v.getCapacidad());       // ahora es 10
        System.out.println(v.calcularTarifa(10));   // 15000.0

        // ===== ETAPA 2: polimorfismo =====
        System.out.println("----- Etapa 2 -----");
        Vehiculo v1 = new Vehiculo("VEH301", 8);
        Vehiculo v2 = new Bus("BUS101", 40, "Centro-Norte");
        Vehiculo v3 = new Taxi("TAX201", 4, "Taxis Bogotá");

        System.out.println(v1.descripcion() + " -> " + v1.calcularTarifa(10));
        System.out.println(v2.descripcion() + " -> " + v2.calcularTarifa(10));
        System.out.println(v3.descripcion() + " -> " + v3.calcularTarifa(10));

        // ===== ETAPA 3: colecciones =====
        System.out.println("----- Etapa 3 -----");

        // 1. Lista con 5 vehículos: 2 buses, 2 taxis y 1 vehículo base
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Bus("BUS101", 40, "Centro-Norte"));
        flota.add(new Bus("BUS102", 35, "Sur-Occidente"));
        flota.add(new Taxi("TAX201", 4, "Taxis Bogotá"));
        flota.add(new Taxi("TAX202", 4, "Taxis Libres"));
        flota.add(new Vehiculo("VEH301", 8));
        System.out.println("Tamaño de la flota: " + flota.size()); // 5

        // 2. Recorrer: descripción y tarifa para 10 km
        for (Vehiculo x : flota) {
            System.out.println(x.descripcion() + " -> $" + x.calcularTarifa(10));
        }

        // 3. Contar vehículos con capacidad mayor a 10
        int grandes = 0;
        for (Vehiculo x : flota) {
            if (x.getCapacidad() > 10) {
                grandes++;
            }
        }
        System.out.println("Vehículos con capacidad mayor a 10: " + grandes); // 2

        // 4. Mapa placa -> conductor
        Map<String, String> conductores = new HashMap<>();
        conductores.put("BUS101", "Carlos");
        conductores.put("BUS102", "Marta");
        conductores.put("TAX201", "Andrés");

        // 5. Consultar una placa que existe y otra que no
        System.out.println("Conductor de BUS101: " + conductores.get("BUS101"));

        String placaBuscada = "XYZ999";
        if (conductores.containsKey(placaBuscada)) {
            System.out.println("Conductor: " + conductores.get(placaBuscada));
        } else {
            System.out.println("La placa " + placaBuscada + " no tiene conductor asignado");
        }
    }
}