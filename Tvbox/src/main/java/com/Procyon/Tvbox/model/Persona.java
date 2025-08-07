package com.Procyon.Tvbox.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private int edad;
    private String nombre;
    private String apellido;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
