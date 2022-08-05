package com.software.juegos3;

public class Juegos3 {
    String nombreJuego;

    public Juegos3(){

    }

    public Juegos3(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    @Override
    public String toString(){
        return nombreJuego;
    }
}
