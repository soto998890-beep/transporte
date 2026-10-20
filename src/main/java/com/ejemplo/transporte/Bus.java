package com.ejemplo.transporte;

public class Bus extends Vehiculo {

    private String ruta;

    public Bus(String placa, int capacidad, String ruta) {
        super(placa, capacidad);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    @Override
    public double calcularTarifa(double km) {
        return km * 900;
    }

    @Override
    public String descripcion() {
        return "Bus " + super.descripcion() + ", ruta " + ruta;
    }
}