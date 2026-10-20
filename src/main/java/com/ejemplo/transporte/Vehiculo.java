package com.ejemplo.transporte;

public class Vehiculo {

    private String placa;
    private int capacidad;

    public Vehiculo(String placa, int capacidad) {
        this.placa = placa;
        setCapacidad(capacidad);
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) { 
            this.capacidad = capacidad;
        } 
    }

    public double calcularTarifa(double km) {
        return km * 1500;
    }

    public String descripcion() {
        return "Placa " + placa + ", capacidad " + capacidad;
    }


}