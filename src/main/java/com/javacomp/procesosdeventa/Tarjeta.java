package com.javacomp.procesosdeventa;

import java.time.LocalDate;

public class Tarjeta {
    
    private String nombre;
    private int numeroTarjeta;
    private LocalDate fechaCaducidad;

    public Tarjeta(String nombre, int numeroTarjeta, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "nombre=" + nombre + ", numeroTarjeta=" + 
                numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
}
