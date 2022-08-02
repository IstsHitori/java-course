package com.software.peliculas.servicio;

import com.software.peliculas.datos.AccesoDatosIMPL;
import com.software.peliculas.datos.IAccesoDatos;
import com.software.peliculas.domain.Pelicula;
import com.software.peliculas.excepciones.AccesoDatosExcepciones;

import java.util.List;

public class ControlPeliculasIMPL implements IControlPeliculas{
    private final IAccesoDatos datos;

    public ControlPeliculasIMPL(){
        this.datos = new AccesoDatosIMPL();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try{
            anexar = datos.comprobarSiExisteArchivo(NOMRBRE_RECURSO);
            datos.escribir(pelicula,NOMRBRE_RECURSO,anexar);
        }catch (AccesoDatosExcepciones excepcion){
            System.out.println("\nError de acceso a datos");
            excepcion.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try{
            List<Pelicula> peliculas = this.datos.listar(NOMRBRE_RECURSO);

            for(Pelicula pelicula : peliculas){
                System.out.print(pelicula);
                System.out.println("");
            }
        }catch (AccesoDatosExcepciones excepcion){
            System.out.println("\nError de acceso a datos");
            excepcion.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String peliculaBuscar) {
        String resultado = null;
        try{
            resultado = this.datos.buscar(NOMRBRE_RECURSO,peliculaBuscar);
        }catch (AccesoDatosExcepciones excepcion){
            System.out.println("\nError de acceso a datos");
            excepcion.printStackTrace(System.out);
        }

        if(resultado == null){
            System.out.println("No se ha encontrado la pelicula");
        }else{
            System.out.println("Pelicula encontrada: " + resultado);
        }
    }

    @Override
    public void iniciarControlPeliculas() {

        try{
            if(this.datos.comprobarSiExisteArchivo(NOMRBRE_RECURSO)){
                datos.borrar(NOMRBRE_RECURSO);
                datos.crear(NOMRBRE_RECURSO);
            }else{
                datos.crear(NOMRBRE_RECURSO);
            }
        }catch (Exception excepcion){
            System.out.println("\nError al iniciar control de peliculas");
            excepcion.printStackTrace(System.out);
        }
    }
}
