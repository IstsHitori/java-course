package com.software.peliculas.datos;

import com.software.peliculas.domain.Pelicula;
import com.software.peliculas.excepciones.AccesoDatosExcepciones;
import com.software.peliculas.excepciones.EscrituraDatosExcepciones;
import com.software.peliculas.excepciones.LecturasExcepciones;

import java.util.*;

public interface IAccesoDatos {
    public boolean comprobarSiExisteArchivo(String nombreArchivo) throws AccesoDatosExcepciones;

    public List<Pelicula> listar(String nombrePelicula) throws LecturasExcepciones;

    public void escribir(Pelicula pelicula,String nombreRecurso, boolean anexar) throws EscrituraDatosExcepciones;

    public String buscar(String nombreRecurso,String buscar)throws LecturasExcepciones;

    public void crear(String nombreRecurso) throws AccesoDatosExcepciones;

    public void borrar(String nombreRecurso) throws AccesoDatosExcepciones;
}
