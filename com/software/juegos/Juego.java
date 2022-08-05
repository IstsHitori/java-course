package com.software.juegos;

public class Juego {
    String nombre;
    public Juego(){

    }
    public Juego(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
