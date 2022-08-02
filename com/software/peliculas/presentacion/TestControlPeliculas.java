package com.software.peliculas.presentacion;
import com.software.peliculas.servicio.ControlPeliculasIMPL;
import com.software.peliculas.servicio.IControlPeliculas;

import java.util.Scanner;
public class TestControlPeliculas {
    public static void main(String[] args) {
        IControlPeliculas control = new ControlPeliculasIMPL();
        Scanner consola = new Scanner(System.in);
        int opcion;

        do{
            System.out.print("\n--------------------------------");
            System.out.print("Software Control de Peliculas");
            System.out.println("--------------------------------");

            System.out.println("1. Iniciar control de peliculas");
            System.out.println("2. Agregar pelicula");
            System.out.println("3. Listar peliculas");
            System.out.println("4. Buscar pelicula");
            System.out.println("5. Salir");
            System.out.print("--------------------------------");

            System.out.print("\nDigite una opcion:");
            opcion = consola.nextInt();

            switch (opcion){
                case 1:
                    control.iniciarControlPeliculas();
                    break;
                case 2:
                    String nombreP;
                    consola.nextLine();
                    System.out.print("Digite el nombre de la pelicula:");
                    nombreP = consola.nextLine();

                    control.agregarPelicula(nombreP);
                    System.out.println("Pelicula agregada correctamente");
                    break;
                case 3:
                    System.out.println("");
                    control.listarPeliculas();
                    break;
                case 4:
                    consola.nextLine();
                    System.out.println("");
                    System.out.print("Digite la pelicula a buscar:");
                    String peliculaBuscar = consola.nextLine();

                    control.buscarPelicula(peliculaBuscar);
                    break;
                case 5:
                    System.out.println("Hasta pronto.");
                    opcion = 5;
                    break;

                default:
                    System.out.println("\nEsta opcion no existe\n");
            }
        }while (opcion != 5);
    }
}
