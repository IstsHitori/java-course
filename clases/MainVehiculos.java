package clases;

import java.util.Scanner;

public class MainVehiculos {

    public static int indiceCocheMvarto(Vehiculo coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        System.out.println(precio);

        for(int i = 1; i < coches.length; i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int nVehiculos, indiceCocheMbarato;

        System.out.print("Digite la cantidad de vehiculos: ");
        nVehiculos = consola.nextInt();


        Vehiculo coches[] = new Vehiculo[nVehiculos];

        for(int i = 0; i < coches.length; i++){
            consola.nextLine();
            System.out.println("Digite las caracteristicas del coche " + (i+1));

            System.out.print("Introduzca la marca del coche: ");
            marca = consola.nextLine();

            System.out.print("Introduzca el modelo del coche: ");
            modelo = consola.nextLine();

            System.out.print("Introduzca el precio del coche: ");
            precio = consola.nextFloat();

            coches[i] = new Vehiculo(marca,modelo,precio);
        }

        for(int i = 0; i < coches.length; i++){
            System.out.println(coches[i]);
        }
        indiceCocheMbarato = indiceCocheMvarto(coches);

        System.out.print("\nEl coche más barato es: " + coches[indiceCocheMbarato]);
    }
}
