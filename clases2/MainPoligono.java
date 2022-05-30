package clases2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPoligono {
    static Scanner consola = new Scanner(System.in);
    static ArrayList <Poligono> poligono = new ArrayList<Poligono>();
    public static void main(String[] args) {
        //Llenar poligono
        llenarPoligono();

        //Mostrar datos y area de cada poligono
        mostrarResultados();
    }

    public static void llenarPoligono(){
        int opcion;
        String respuesta;
        do{
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.print("1-Triangulo\n2-Rectangulo\n:");
                opcion = consola.nextInt();
            }
            while(opcion < 1 || opcion > 2);

            switch(opcion){
                case 1: //Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: //LLenar un rectangulo
                    llenarRectangulo();
                    break;
            }
            System.out.print("\nDesea introducir otro poligono? Digite (S/N): ");
            respuesta = consola.next();
            System.out.println(" ");
        }
        while(respuesta.contains("S") || respuesta.contains("s"));
    }

    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.print("Digite el lado1 del triangulo: ");
        lado1 = consola.nextDouble();

        System.out.print("Digite el lado2 del triangulo: ");
        lado2 = consola.nextDouble();

        System.out.print("Digite el lado3 del triangulo: ");
        lado3 = consola.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1,lado2;

        System.out.print("Digite el lado1 del rectangulo: ");
        lado1 = consola.nextDouble();

        System.out.print("Digite el lado2 del rectangulo: ");
        lado2 = consola.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);

        poligono.add(rectangulo);
    }

    public static void mostrarResultados(){
        for(Poligono poli : poligono){
            System.out.println(poli.toString());
            System.out.println("El area es: " +poli.area());
            System.out.println("");
        }
    }
}
