package Practica;

import java.util.ArrayList;
public class Cliente {
    private String name;
    private int aumentar = 100;
    private int DNI;
    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public Cliente(){

    }

    /**
     * Constructor con 3 parámetros
     * @param name para el nombre del cliente
     * @param DNI para el DNI del cliente
     * @param carros para lista de carros del cliente
     */
    public Cliente(String name,int DNI,ArrayList<Carro> carros) {
        this.name = name;
        this.DNI = aumentar;
        aumentar++;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAumentar() {
        return aumentar;
    }


    public void setAumentar(int aumentar) {
        this.aumentar = aumentar;
    }


    public int getDNI() {
        return DNI;
    }


    public ArrayList<Carro> getCarros() {
        return carros;
    }


    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString(){
        return "\nNombre del cliente:" + name + "\nDNI del cliente:" + DNI + "\nCarros del cliente:" + getCarros();
    }
}
