package com.software.peliculas.servicio;

public interface IControlPeliculas {
    String NOMRBRE_RECURSO = "peliculas.txt";
    public void agregarPelicula(String nombrePelicula);

    public void listarPeliculas();

    public void buscarPelicula(String peliculaBuscar);

    public void iniciarControlPeliculas();
}
