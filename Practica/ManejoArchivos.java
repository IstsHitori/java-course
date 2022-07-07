package Practica;
import java.io.*;
import java.util.Scanner;


public class ManejoArchivos {
    static Scanner consola;

    public static void crearArchivo(String ruta){
        File file = new File(ruta);
        try {
            boolean verificar = file.createNewFile();
            if(verificar == true){
                System.out.println("El archivo se creo correctamente.\n");
            }else{
                System.out.println("El archivo ya se creo o no se creo correctamente.");
            }
        }catch (IOException ex){
            System.out.println("Error al crear el archivo. " + ex);
        }
    }
    public static void leerArchivo(String ruta){
        File file = new File(ruta);

        try{
            consola = new Scanner(file);
            boolean verf = consola.hasNextLine();
            if(verf == true){
                while (consola.hasNextLine()){
                    System.out.println(consola.nextLine());
                }
            }else{
                System.out.println("El archivo esta vacio");
            }

        }catch (FileNotFoundException ex){
            System.out.println("No se encontro el archivo.");
        }
    }

    public static void escribirArchivo(String ruta,String contenido){
        File file = new File(ruta);

        try{
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(contenido);
            fileWriter.close();
        }catch (IOException ex){
            System.out.println("No se encontro el archivo " + ex);
        }
    }

    //public static void escribirArchivo2(String ruta ,String contenido){
        //File file = new File(ruta);

       //try {
            //PrintWriter salida  = new PrintWriter(new FileWriter(ruta));
            //salida.println(contenido);
            //.close();
        //}catch (FileNotFoundException ex){
            //System.out.println("No se encontro el archivo " + ex);
        //} catch (IOException ex2){
            //System.out.println("No se encontro el archivo " + ex2);
        //}
    //}

}
