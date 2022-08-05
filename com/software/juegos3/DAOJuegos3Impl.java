package com.software.juegos3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOJuegos3Impl implements DAOJuegos3{
    public DAOJuegos3Impl(){

    }

    public static void borrarDirectorio(File directorio){
        File[] ficheros = directorio.listFiles();

        for(int x = 0; x < ficheros.length; x++){
            if(ficheros[x].isDirectory()){
                borrarDirectorio(ficheros[x]);
            }
            ficheros[x].delete();
        }
    }
    @Override
    public void iniciarProyecto() {
        File archivo = new File(ARCHIVO_JUEGO);
        File carpeta = new File(CARPETA_JUEGO);

        if(carpeta.exists()){
            borrarDirectorio(carpeta);
            if(carpeta.delete()){
                try{
                    carpeta.mkdir();
                    archivo.createNewFile();
                    System.out.println("\nSe ha creado la carpeta y el archivo correctamente");
                }catch (Exception exception){
                    exception.printStackTrace(System.out);
                }
            }
        }else{
            try{
                carpeta.mkdir();
                archivo.createNewFile();
                System.out.println("\nSe ha creado la carpeta y el archivo correctamente");
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }
    }

    @Override
    public String crearJuego(String nombreJuego) {
        String resultado = null;
        File archivo = new File(ARCHIVO_JUEGO);

        if(nombreJuego != null && nombreJuego.length() > 0){
            if(archivo.exists()){
                try {
                    PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                    Juegos3 juego3 = new Juegos3(nombreJuego);

                    escribir.println(juego3.toString());

                    escribir.close();
                    resultado = "Se ha registrado el juego correctamente";
                }catch (Exception exception){
                    exception.printStackTrace(System.out);
                }
            }
        }else{
            resultado = "No se aceptan caracteres vacios";
        }
        return resultado;
    }

    @Override
    public String eliminarJuego(String nombreJuego, List<Juegos3> juegos) {
        File archivo = new File(ARCHIVO_JUEGO);
        String resultado = null;

        if(nombreJuego !=null && nombreJuego.length() > 0){
            if(archivo.exists()){
                if(juegos.size() == 0){
                    resultado = "La lista de juegos esta vacia";
                }else{
                    for(Juegos3 eliminar : juegos){
                        if(eliminar.getNombreJuego().equalsIgnoreCase(nombreJuego)){
                            juegos.remove(eliminar);
                            if(archivo.delete()) {
                                try {
                                    if (archivo.createNewFile()) {
                                        PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                                        for(Juegos3 ingresar : juegos){
                                            escribir.println(ingresar.toString());
                                        }
                                        resultado = "El juego " + nombreJuego + " se ha eliminado correctamente.";
                                        escribir.close();
                                    }
                                } catch (Exception exception){
                                    exception.printStackTrace(System.out);
                                }

                            }
                            break;
                        }else{
                            resultado = "No se encontro el juego";
                        }
                    }
                }

            }
        }else{
            resultado = "No se aceptan caracteres vacios";
        }


        return resultado;
    }

    @Override
    public String buscarJuego(String nombreJuego, List<Juegos3> juegos) {
        String resultado = null;
        File archivo = new File(ARCHIVO_JUEGO);

        if(nombreJuego!= null && nombreJuego.length() > 0){
            if(archivo.exists()){
                for(Juegos3 buscar : juegos){
                    if(buscar.getNombreJuego().equalsIgnoreCase(nombreJuego)){
                        resultado = "Se encontro el juego " + nombreJuego;
                        break;
                    }else{
                        resultado = "No se encontro el juego";
                    }
                }
            }
        }else{
            resultado = "No se aceptan caracteres vacios";
        }
        return resultado;
    }

    @Override
    public List<Juegos3> listarJuegos() {
        List<Juegos3> juegos3s = new ArrayList<>();
        File archivo = new File(ARCHIVO_JUEGO);
        String linea = null;
        if(archivo.exists()){
            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                linea = leer.readLine();
                while (linea != null){
                    Juegos3 juegos3 = new Juegos3(linea);
                    juegos3s.add(juegos3);
                    linea = leer.readLine();
                }
                leer.close();
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }
        return juegos3s;
    }
}
