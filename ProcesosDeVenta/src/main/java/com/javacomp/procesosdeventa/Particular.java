package com.javacomp.procesosdeventa;

public class Particular extends Persona {
    
    private String DNI;

    public Particular(String DNI, String nombre, String correo, String clave,
            Tarjeta tarjetaCredito, Direccion dir, int numeroTelf) {
        super(nombre, correo, clave, tarjetaCredito, dir, numeroTelf);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Particular{" + "DNI=" + DNI + '}';
    }

    
    
}
