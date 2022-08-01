package com.software.peliculas.datos;

import com.software.peliculas.domain.Pelicula;
import com.software.peliculas.excepciones.AccesoDatosExcepciones;
import com.software.peliculas.excepciones.EscrituraDatosExcepciones;
import com.software.peliculas.excepciones.LecturasExcepciones;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class AccesoDatosIMPL implements IAccesoDatos{
    @Override
    public boolean comprobarSiExisteArchivo(String nombreArchivo) throws AccesoDatosExcepciones {
        File archivo = new File(nombreArchivo);

        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombrePelicula) throws LecturasExcepciones {
        File archivo = new File(nombrePelicula);
        List<Pelicula> peliculas = new ArrayList<>();
        try{
            BufferedReader lectura = new BufferedReader(new FileReader(archivo));
            String contenido = null;
            contenido = lectura.readLine();

            while(contenido != null){
                Pelicula pelicula = new Pelicula(contenido);
                peliculas.add(pelicula);
                contenido = lectura.readLine();
            }
            lectura.close();
        }catch(IOException exception){
            exception.printStackTrace(System.out);
            throw new LecturasExcepciones("Excepcion a listar peliculas " + exception.getMessage());
        }

        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepciones {
        File archivo = new File(nombreRecurso);

        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();

            System.out.println("");
            System.out.println("Se ha añadido la pelicula: " + pelicula);
            System.out.println("");
        }catch (IOException exception){
            exception.printStackTrace(System.out);
            throw new EscrituraDatosExcepciones("Excepcion al escribir en el archivo: " + exception.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturasExcepciones {
        File archivo = new File(nombreRecurso);
        String resultado = null;

        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int indice = 1;
            linea = entrada.readLine();

            while(linea != null){
                if(buscar != null  && buscar.equalsIgnoreCase(linea)) {
                    System.out.println("");
                    resultado = "Pelicula: " + linea + " encontrada en el indice: " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();

            return resultado;
        }catch (IOException exception){
            exception.printStackTrace(System.out);
            throw new LecturasExcepciones("Excepcion al buscar la pelicula " + exception.getMessage());
        }
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosExcepciones {
        File archivo = new File(nombreRecurso);

        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch (IOException exception){
            exception.printStackTrace(System.out);
            throw new AccesoDatosExcepciones("Excepcion al crear archivo: " + exception.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosExcepciones {
        File archivo = new File(nombreRecurso);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("Se ha eliminado el archivo.");
        }
    }
}
