package com.software.peliculas.domain;

public class Pelicula {
    private String nombre;

    public Pelicula(){

    }
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    //Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
