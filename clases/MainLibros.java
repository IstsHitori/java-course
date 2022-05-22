package clases;
import java.util.*;
public class MainLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Libros libro1 = new Libros(1001,"El kamasutra","Santillana","Elian Castilla",1000);
        Libros libro2 = new Libros(1002,"Detrás de ti","Santillana","Juancho Roy",800);

        System.out.println(libro1.salidaString());
        System.out.println(libro2.salidaString());

        libro2.setNumPaginas(2500);

        if(libro1.getNumPaginas() > libro2.getNumPaginas()){
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2");
        }
        else if(libro1.getNumPaginas() == libro2.getNumPaginas()){
            System.out.println("Tienen el mismo numero de paginas");
        }
        else{
            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1");
        }
    }
}
