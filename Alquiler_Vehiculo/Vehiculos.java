package Alquiler_Vehiculo;

public abstract class Vehiculos {
    private String matricula;
    private String marca;
    private String modelo;
    private float precio_dia = 50;



    public Vehiculos(){

    }
    public Vehiculos(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(float precio_dia) {
        this.precio_dia = precio_dia;
    }

    public abstract float precioTotal(int dias);
    @Override
    public String toString(){
        return "Matricula:" + matricula + "\nMarca:" + marca + "\nModelo:" + modelo;
    }
}
