package Practica2;
import java.io.*;
import java.util.Scanner;

public class LeerArchivo2 {
    File file;

    private void crearArchivoDeTexto(){
        file = new File("Archivo.txt");

        try{
            if (file.createNewFile()){
                System.out.println("Archivo creado exitosamente.");
            }else{
                System.out.println("Error al crear archivo.");
            }
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    private void eliminarArchivoDeTexto(){
        if(file.delete()){
            System.out.println("Archivo eliminado con exito");
        }else{
            System.out.println("Error al eliminar archivo");
        }
    }
    //Metodo para escribir en el archivo de texto

    private void escribirAlArchivoTexto(){
        try{
            FileWriter escribir = new FileWriter(file);

            escribir.write("Mi nombre es:\n");
            escribir.write("Francisco");
            escribir.close();
            System.out.println("Texto añadido correctamente");
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    //Metodo para leer Archivo
    private void leerArchivo(){
        try{
            Scanner consola = new Scanner(file);
            FileReader leer = new FileReader(file);//Indicamos el archivo que vamos a leer
            BufferedReader lectura = new BufferedReader(leer);//Le pasamos el archivo a leer

            while(consola.hasNextLine()){
                System.out.println(consola.nextLine());
            }
        }catch (IOException exception){
            exception.printStackTrace(System.out);
        }
    }
    public static void main(String[] args) {
        LeerArchivo2 leerArchivo = new LeerArchivo2();
        leerArchivo.crearArchivoDeTexto();
        leerArchivo.escribirAlArchivoTexto();
        leerArchivo.leerArchivo();
    }

}
