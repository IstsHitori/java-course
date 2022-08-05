package com.software.juegos;
import java.util.Scanner;
public class MainJuego {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        DAOJuegosImpl daoJuegos = new DAOJuegosImpl();
        int opcion;
        String nombreJuego;

        do{
            System.out.println("\n---------------------------");

            System.out.println("1-Crear archivo\n2-Eliminar Archivo\n3-Crear juego\n4-Eliminar juego\n5-Buscar juego\n6-Listar juegos\n7.Salir");
            System.out.print("Elija una opcion:");
            opcion = consola.nextInt();

            switch (opcion){
                case 1:
                    daoJuegos.crear();
                    break;
                case 2:
                    daoJuegos.eliminar();
                    break;
                case 3:
                    consola.nextLine();
                    System.out.print("Nombre del juego que desea agregar:");
                    nombreJuego = consola.nextLine();
                    Juego juego = new Juego(nombreJuego);
                    daoJuegos.agregarJuego(juego);
                    break;
                case 4:
                    consola.nextLine();
                    System.out.print("Juego que desea eliminar:");
                    nombreJuego = consola.nextLine();
                    System.out.println(daoJuegos.eliminarJuego(nombreJuego,daoJuegos.listarJuegos()));
                    break;
                case 5:
                    consola.nextLine();
                    System.out.print("Nombre del juego que desea buscar:");
                    nombreJuego = consola.nextLine();

                    System.out.println(daoJuegos.buscarJuego(nombreJuego));
                    break;
                case 6:
                    System.out.println("\nEstos son los juegos que hay:");

                    daoJuegos.listarJuegos().forEach(System.out::println);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\nEsta opcion no existe.");
            }
        }while (opcion != 7);
    }
}
