package com.software.juegos2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOJuegos2Impl implements DAOJuegos2{
    private final String JUEGO_ACCION = "C:\\Users\\franc\\Desktop\\Juegos\\JuegoAccion.txt";
    private final String JUEGO_TERROR = "C:\\Users\\franc\\Desktop\\Juegos\\JuegoTerror.txt";
    private final String JUEGO_AVENTURA = "C:\\Users\\franc\\Desktop\\Juegos\\JuegoAventura.txt";

    public DAOJuegos2Impl(){

    }
    @Override
    public int registrarJuego(Juego juego, int opcion) {
        File archivo = null;
        boolean comprobar = false;

        if(opcion == 1){
            archivo = new File(JUEGO_ACCION);
            if(archivo.exists()){
                comprobar = true;
            }else{
                System.out.println("\nEl archivo de juego Accion no existe.");
                opcion = 1;
            }


        }else if(opcion == 2){
            archivo = new File(JUEGO_TERROR);

            if(archivo.exists()){
                comprobar = true;
            }else{
                System.out.println("\nEl archivo de juego Terror no existe.");
                opcion = 2;

            }
        }else if(opcion == 3){
            archivo = new File(JUEGO_AVENTURA);

            if(archivo.exists()){
                comprobar = true;
            }else{
                System.out.println("\nEl archivo de juego Aventura no existe.");
                opcion = 3;

            }
        }

        if(comprobar){
            try{
                PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                escribir.println(juego.toString());
                escribir.close();
                System.out.println("Juego añadido");
            }catch(IOException exception){
                exception.printStackTrace(System.out);
            }
        }

        return opcion;
    }

    @Override
    public void iniciarRegistro() {
        PrintWriter crear = null;
        File carpeta = new File("C:\\Users\\franc\\Desktop\\Juegos");

        File archivo = new File(JUEGO_ACCION);
        File archivo1 = new File(JUEGO_TERROR);
        File archivo2 = new File(JUEGO_AVENTURA);

        if(carpeta.exists()){

            try{
                carpeta.delete();

                carpeta.mkdir();

                crear = new PrintWriter(new FileWriter(archivo));
                crear.close();
                crear = new PrintWriter(new FileWriter(archivo1));
                crear.close();
                crear = new PrintWriter(new FileWriter(archivo2));
                crear.close();

            }catch (IOException exception){
                exception.printStackTrace(System.out);
            }
        }else{
            try{

                if(carpeta.mkdir()){
                    archivo.createNewFile();
                    archivo1.createNewFile();
                    archivo2.createNewFile();
                }

            }catch (IOException exception){
                exception.printStackTrace(System.out);
            }
        }

        System.out.println("\nSe han creado los archivos exitosamente.");

    }

    @Override
    public String eliminarJuego(String nombreJuego, List<Juego> juegos) {
        juegos.forEach(System.out::println);

        String resultado = null;
        File archivo = new File(JUEGO_ACCION);
        File archivo2 = new File(JUEGO_TERROR);
        File archivo3 = new File(JUEGO_AVENTURA);

        if(nombreJuego != null){
            for(Juego eliminar : juegos){
                if(eliminar.getNombre().equalsIgnoreCase(nombreJuego)){
                    juegos.remove(eliminar);
                    if(eliminar instanceof JuegoAccion){

                        if(archivo.delete()){
                            try{
                                archivo.createNewFile();
                                PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));
                                for(Juego ingresar : juegos){
                                    if(ingresar instanceof JuegoAccion){
                                        escribir.println(ingresar.toString());

                                    }
                                }
                                escribir.close();
                            }catch (Exception exception){
                                exception.printStackTrace(System.out);
                            }
                            resultado = "Se ha eliminado el juego " + nombreJuego + " correctamente\n";
                        }

                    }else if(eliminar instanceof JuegoTerror){
                        if(archivo2.delete()){
                            try{
                                archivo2.createNewFile();
                                PrintWriter escribir = new PrintWriter(new FileWriter(archivo2,true));
                                for(Juego ingresar : juegos){
                                    if(ingresar instanceof JuegoTerror){
                                        escribir.println(ingresar.toString());

                                    }
                                }
                                escribir.close();
                            }catch (Exception exception){
                                exception.printStackTrace(System.out);
                            }
                        }
                        resultado = "Se ha eliminado el juego " + nombreJuego + " correctamente\n";
                    }else if(eliminar instanceof JuegoAventura){
                        if(archivo3.delete()){
                            try{
                                archivo3.createNewFile();
                                PrintWriter escribir = new PrintWriter(new FileWriter(archivo3,true));
                                for(Juego ingresar : juegos){
                                    if(ingresar instanceof JuegoAventura){
                                        escribir.println(ingresar.toString());

                                    }
                                }
                                escribir.close();
                            }catch (Exception exception){
                                exception.printStackTrace(System.out);
                            }
                        }
                        resultado = "Se ha eliminado el juego " + nombreJuego + " correctamente\n";
                    }else{
                        resultado = "No se encontro el juego.";

                    }
                    break;
                }
            }
        }else{
            resultado = "No se encontro el juego.";
        }

        return resultado;
    }

    @Override
    public String buscarJuego(String nombreJuego,List<Juego> juegos) {
        String resultado = null;

        if(nombreJuego != null){
            for(Juego buscar : juegos){
                if(buscar.getNombre().equalsIgnoreCase(nombreJuego)){
                    resultado = "Se encontro el juego " + buscar.getNombre();
                    break;
                }else{
                    resultado = "No se encontro el juego";
                }
            }
        }else{
            resultado = "No se aceptan carácteres vacíos";
        }


        return resultado;
    }

    @Override
    public List<Juego> juegos() {
        List<Juego> juegos = new ArrayList<>();
        Juego juego = null;
        File file = new File(JUEGO_ACCION);
        File file2 = new File(JUEGO_TERROR);
        File file3 = new File(JUEGO_AVENTURA);
        String contenido1 = null;
        String contenido2 = null;
        String contenido3 = null;


        if(file.exists() && file2.exists() &&  file3.exists()){
            try{
                BufferedReader leer = new BufferedReader(new FileReader(file));
                BufferedReader leer2 = new BufferedReader(new FileReader(file2));
                BufferedReader leer3 = new BufferedReader(new FileReader(file3));
                contenido1 = leer.readLine();
                contenido2 = leer2.readLine();
                contenido3 = leer3.readLine();

                if(contenido1 != null){
                    while(contenido1 != null){
                        juego = new JuegoAccion(contenido1);
                        juegos.add(juego);
                        contenido1 = leer.readLine();
                    }
                }

                if(contenido2 != null){
                    while(contenido2 != null){
                        juego = new JuegoTerror(contenido2);
                        juegos.add(juego);
                        contenido2 = leer2.readLine();
                    }
                }

                if(contenido3 != null){
                    while(contenido3 != null){
                        juego = new JuegoAventura(contenido3);
                        juegos.add(juego);
                        contenido3 = leer3.readLine();
                    }
                }

                leer.close();
                leer2.close();
                leer3.close();

            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }

        }else{
            System.out.println("\nLos archivos de los juegos no existen.");
        }

        return juegos;
    }
}
