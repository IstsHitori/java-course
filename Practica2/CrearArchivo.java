package Practica2;
import java.io.File;
import java.io.IOException;

public class CrearArchivo{
    public static void main(String[] args) {
        //para crar un archivo tipo texto
        //File file = new File("prueba.txt");

        /**
         * Para crear una carpeta
        File file = new File("carpeta_prueba");

         */
        /**
        try{
            if(file.createNewFile()){
                System.out.println("Archivo creado correctamente");
            }else{
                System.out.println("Ya existe el archivo o ocurrio un error");
            }
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
        */

        /**
        if(file.mkdir()){
            System.out.println("Se creo la carpeta correctamente");
        }else{
            System.out.println("Ya existe este archivo o hubo un error");
        }

         */

        /**
         * Para eliminar un archivo
        File file = new File("prueba.txt");
        if(file.delete()){
            System.out.println("Se eliminó el archivo ");
        }else{
            System.out.println("No se encontro el archivo o hubo un error");
        }

         * Para saber el nombre del archivo
         System.out.prinln("El nombre del archivo es " + file.getName());

         * Para saber la ruta del archivo
         * System.out.println("La ruta del arhicvo es: " + file.getPath());
         *
         *Para saber la ruta absoluta del archivo
         * System.out.println("La ruta absoluta del archivo es: " + file.getAbsolutePath());
         *
         * Para saber si existe el archivo
         * System.out.println("Existe el archivo? " + file.exists());
         *
         * Para saber si se puede escribir en el archivo
         * System.out.println("Se puede escribir en el archivo? " + file.canWrite());
         *
         * Para saber si se puede leer el archivo
         * System.out.println("Se puede leer el archivo?" + file.canRead());
         */
    }
}
