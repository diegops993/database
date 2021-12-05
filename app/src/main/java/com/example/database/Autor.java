package com.example.database;

public class Autor {
    private String Autor;
    private String Nombre;
    private String Estado;

    public Autor() {
        Autor = "";
        Nombre = "";
        Estado = "";
    }


    public Autor(String autor, String nombre, String estado) {
        Autor = autor;
        Nombre = nombre;
        Estado = estado;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Autor='" + Autor + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
