package clases;

import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public float getPrecio(){
        return precio;
    }

    public String toString(){
        return "El coche con marca " + marca + " de modelo " + modelo + " tiene un precio de " + precio;
    }
}
