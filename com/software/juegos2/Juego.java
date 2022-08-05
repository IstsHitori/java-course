package com.software.juegos2;

public class Juego {
    private String nombre;

    public Juego(){

    }
    public Juego(String nombre){
        this.nombre = nombre;
    }

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
