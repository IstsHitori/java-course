package com.software.juegos;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOJuegosImpl implements DAOJuegos {

    public DAOJuegosImpl(){

    }

    @Override
    public void agregarJuego(Juego nombreJuego) {
        File archivo = new File(NOMBRE_ARCHIVO);

        if(archivo.exists()){
            if(nombreJuego != null){
                try{
                    PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                    escribir.println(nombreJuego.toString());
                    escribir.close();
                    System.out.println("\nJuego con nombre " + nombreJuego.toString() + " agregado con exito.");
                }catch (Exception exception){
                    exception.printStackTrace(System.out);
                }
            }else{
                System.out.println("No se aceptan caracteres vacios.");
            }
        }else{
            System.out.println("El archivo no existe.");
        }
    }

    @Override
    public String eliminarJuego(String nombreJuego, List<Juego> juegos) {
        File archivo = new File(NOMBRE_ARCHIVO);
        String resultado = null;

        if(archivo.exists()){
            try {
                for(Juego eliminar : juegos){
                    if(eliminar.getNombre().equalsIgnoreCase(nombreJuego)){
                        juegos.remove(eliminar);

                        if(archivo.delete()){
                            try{
                                archivo.createNewFile();
                                PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                                for(Juego ingresar : juegos){
                                    escribir.println(ingresar.toString());
                                }
                                escribir.close();
                            }catch (Exception exception){
                                exception.printStackTrace(System.out);
                            }
                            resultado = "Se ha eliminado el juego " + nombreJuego + " correctamente.";
                        }

                        break;
                    }else{
                        resultado = "No se encontro el juego " + nombreJuego;
                    }
                }
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }else{
            System.out.println("El archivo no existe.");
        }

        return resultado;
    }

    @Override
    public void eliminar() {
        File archivo = new File(NOMBRE_ARCHIVO);

        archivo.delete();

        System.out.println("\nArchivo eliminado con exito.");
    }

    @Override
    public void crear() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if(archivo.exists()){
            System.out.println("El archivo ya existe.");
        }else{
            try{
                PrintWriter crear = new PrintWriter(new FileWriter(archivo));
                crear.close();
                System.out.println("Archivo creardo con exito.");
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }

    }

    @Override
    public List<Juego> listarJuegos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        List<Juego> juegos = new ArrayList<>();
        try{
            String contenido = null;
            BufferedReader salida = new BufferedReader(new FileReader(archivo));

            contenido = salida.readLine();

            while (contenido != null){
                Juego juego = new Juego(contenido);

                juegos.add(juego);
                contenido = salida.readLine();
            }
            salida.close();
        }catch (Exception exception){
            exception.printStackTrace(System.out);
        }
        return juegos;
    }

    @Override
    public String buscarJuego(String nombreJuego) {
        File archivo = new File(NOMBRE_ARCHIVO);
        String resultado = null;

        if(archivo.exists()){
            try{
                String contenido = null;

                BufferedReader buscar = new BufferedReader(new FileReader(archivo));
                contenido = buscar.readLine();

                while (contenido != null){
                    if(nombreJuego != null && contenido.equalsIgnoreCase(nombreJuego)){
                        resultado = "Se ha encontrado el juego " + nombreJuego;
                        break;
                    }else{
                        resultado = "No se encontro el juego " + nombreJuego;
                    }

                    contenido = buscar.readLine();
                }
                buscar.close();
            }catch (Exception exception){
                exception.printStackTrace(System.out);

            }
        }else{
            resultado = "El archivo no existe.";
        }

        return resultado;
    }
}
