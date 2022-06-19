package ProyectoParcial;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String ID;
    private ArrayList<TiendaPeliculas> peliculas = new ArrayList<>();

    public Cliente(){
    }

    public Cliente(String nombre, String apellido, String ID,ArrayList<TiendaPeliculas> peliculas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.peliculas = peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<TiendaPeliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<TiendaPeliculas> peliculas) {
        this.peliculas = peliculas;
    }


    @Override
    public String toString(){
        return "\nNombre del cliente: " + nombre + "\nApellido del cliente: " + apellido + "\nID del cliente: " + ID + "\nLista de peliculas del cliente:" + peliculas ;
    }
}
