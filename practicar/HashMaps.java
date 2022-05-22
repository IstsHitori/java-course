package practicar;

import java.util.*;

public class HashMaps{
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> todo = new HashMap<>();
        ArrayList<String> personas = new ArrayList<>();

        String nombre = "Maria";

        personas.add("Maria");
        personas.add("José");
        todo.put(nombre,personas);
        System.out.println(todo);
    }
}
