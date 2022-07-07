package Practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LeerArchivo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\franc\\Desktop\\Cursos\\miPrimerArchivo.txt");
        try{
            Scanner consola = new Scanner(file);
            boolean leer = consola.hasNextLine();

            System.out.println(leer);

            if(leer == true){
                while (consola.hasNextLine()){
                    System.out.println(consola.nextLine());
                }
            }else{
                System.out.println("El archivo esta vacio");
            }
            consola.close();
        }catch (FileNotFoundException ex){
            System.out.println("No se encontro el archivo. " + ex);
        }
    }
}
