package com.javacomp.procesosdeventa;

public class Persona {
    
    private String nombre;
    private String correo;
    private String clave;
    private Tarjeta tarjetaCredito;
    private Direccion dir;
    private int numeroTelf;

    public Persona(String nombre, String correo, String clave,
            Tarjeta tarjetaCredito, Direccion dir, int numeroTelf) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.tarjetaCredito = tarjetaCredito;
        this.dir = dir;
        this.numeroTelf = numeroTelf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Tarjeta getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Tarjeta tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public int getNumeroTelf() {
        return numeroTelf;
    }

    public void setNumeroTelf(int numeroTelf) {
        this.numeroTelf = numeroTelf;
    }

    
}
