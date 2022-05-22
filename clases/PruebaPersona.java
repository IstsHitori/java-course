package clases;
import java.util.*;
public class PruebaPersona {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        //Persona persona1;
        Persona persona1 = new Persona();
        persona1.nombre = "Fran";
        persona1.apellido = "Serrano";
        persona1.desplegarInformacion();

        //Persona persona2 = new Persona();
        //persona2.nombre = consola.nextLine();
        //persona2.apellido = consola.nextLine();
        //persona2.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Javier";
        persona2.apellido = "Julio";
        persona2.desplegarInformacion();

        System.out.println("Persona1 " + persona1);
        System.out.println("Persona2 " + persona2);
    }
}
