package com.javacomp.procesosdeventa;

import java.io.Serializable;
import java.time.LocalDate;

public class Resena implements Serializable {
    private int calificacion;
    private String comentario;
    private LocalDate fechaResena;

    public Resena(int calificacion, String comentario, LocalDate fechaResena) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaResena = fechaResena;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaResena() {
        return fechaResena;
    }

    public void setFechaResena(LocalDate fechaResena) {
        this.fechaResena = fechaResena;
    }
    
    
}
