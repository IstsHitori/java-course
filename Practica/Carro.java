package Practica;

public class Carro{
    private String name;
    private String marca;
    private String matricula;
    private int modelo;
    private float precio;

    public Carro(){

    }
    public Carro(String name, String marca, String matricula, int modelo,float precio){
        this.name = name;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    @Override
    //Para mostrar los datos del coche
    public String toString() {
        return "\nNombre: " + name + "\nMarca:" + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo +"\nPrecio:" + precio;
    }
}