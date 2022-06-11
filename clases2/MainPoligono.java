package clases2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPoligono {
    static Scanner consola = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

    public static void llenarTriangulo(){
        double lado1,lado2,lado3;

        System.out.print("Digite el lado1 del triangulo:");
        lado1 = consola.nextDouble();
        System.out.print("Digite el lado2 del triangulo:");
        lado2 = consola.nextDouble();
        System.out.print("Digite el lado3 del triangulo:");
        lado3 = consola.nextDouble();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

        poligonos.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;

        System.out.print("Digite el lado1 del rectangulo: ");
        lado1 = consola.nextDouble();

        System.out.print("Digite el lado del rectangulo: ");
        lado2 = consola.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);

        poligonos.add(rectangulo);
    }

    public static void mostrarDatos(){
        for(Poligono poli : poligonos){
            System.out.println(poli.toString());
            System.out.println("\nEl area es: " + poli.area());

            System.out.println("");
        }
    }

    public static void llenarPoligono(){
        int opcion;
        String respuesta;
        do{
            do{
                System.out.println("Digite que poligono desea: ");
                System.out.print("1-Triangulo\n2-Rectangulo\nDigite una opcion:");
                opcion = consola.nextInt();
            }
            while(opcion < 1 || opcion > 2);

            switch(opcion){
                case 1:
                    //Llamamos la funcion llenar triangulo
                    llenarTriangulo();
                    break;

                case 2:
                    //Llamamos la funcion llenar rectangulo
                    llenarRectangulo();
                    break;
            }
            System.out.print("Desea introducir otro Poligono? (S/N)");
            respuesta = consola.next();
        }
        while(respuesta.contains("S") || respuesta.contains("s"));


    }
    public static void main(String[] args) {
        //Metodo para llenar un poligono
        llenarPoligono();
        mostrarDatos();

    }
}
