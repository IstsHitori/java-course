package Practica;
import java.util.*;

public class Positive{
    static List lista = new ArrayList<>();
    public static void main(String[] args) {
        lista.add("Hola");
        lista.add(18);
        lista.add(true);

        lista.set(2,"Maria");
        lista.forEach( dato -> {
            System.out.println(dato);
        });

        System.out.println("\n");

        Map mapa = new HashMap();

        mapa.put(1,"Uno");
        mapa.put(2, "Dos");
        mapa.put(3,"Tres");
        System.out.println(mapa);

        boolean verf = true;
        for(Object buscar : mapa.keySet()){
            //System.out.println("Clave: " + buscar + " Valor: " + mapa.get(buscar));
        }

        HashMap hasp = new HashMap<>();
        hasp.put(1,"Uno");
        hasp.put(2,"Dos");
        hasp.put(3,"Tres");

        System.out.println(hasp);
    }
}