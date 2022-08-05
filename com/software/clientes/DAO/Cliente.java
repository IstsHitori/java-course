package com.software.clientes.DAO;

public class Cliente {
    String nombre;

    public Cliente(){

    }

    public Cliente(String nombre){
        this.nombre = nombre;
    }

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
