package ProyectoParcial;

import java.util.Scanner;

public abstract class TiendaPeliculas {
    private String nombrePelicula;
    private String iD_pelicula;
    private float precioPelicula = 5;
    private int dias;

    public static Scanner consola = new Scanner(System.in);

    public TiendaPeliculas(){

    }

    //Constructor para arrrendar pelicula
    public TiendaPeliculas(String nombrePelicula, String iD_pelicula, float precioPelicula, int dias) {
        this.nombrePelicula = nombrePelicula;
        this.iD_pelicula = iD_pelicula;
        this.precioPelicula = precioPelicula;
        this.dias = dias;
    }
    //Constructor para crear Pelicula
    public TiendaPeliculas(String nombrePelicula,String iD_pelicula, float precioPelicula){
        this.nombrePelicula = nombrePelicula;
        this.iD_pelicula = iD_pelicula;
        this.precioPelicula = precioPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getiD_pelicula() {
        return iD_pelicula;
    }

    public void setiD_pelicula(String iD_pelicula) {
        this.iD_pelicula = iD_pelicula;
    }

    public float getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(float precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public abstract float precioTotal();


    @Override
    public String toString(){
        return "\nNombre de la pelicula: " + nombrePelicula + "\nID de la pelicula: " + iD_pelicula + "\nPrecio de la pelicula: " + precioPelicula;
    }
}
