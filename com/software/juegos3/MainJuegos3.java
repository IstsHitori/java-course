package com.software.juegos3;
import java.util.Scanner;
public class MainJuegos3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        DAOJuegos3Impl daoJuegos3 = new DAOJuegos3Impl();
        byte opcion;
        String nombreJuego;

        do{
            System.out.println("\n------------------------");
            System.out.println("1-Iniciar proyecto\n2-Agregar juego\n3-Eliminar juego\n4-Buscar Juego\n5-Listar juegos\n6-Salir");
            System.out.print("Elija una opcion:");
            opcion = consola.nextByte();

            switch (opcion){
                case 1:
                    daoJuegos3.iniciarProyecto();
                    break;
                case 2:
                    consola.nextLine();
                    System.out.print("Nombre del juego que desea registrar:");
                    nombreJuego = consola.nextLine();

                    System.out.println(daoJuegos3.crearJuego(nombreJuego));
                    break;
                case 3:
                    consola.nextLine();
                    System.out.print("Que juego desea eliminar:");
                    nombreJuego = consola.nextLine();
                    System.out.println(daoJuegos3.eliminarJuego(nombreJuego,daoJuegos3.listarJuegos()));
                    break;
                case 4:
                    consola.nextLine();
                    if(daoJuegos3.listarJuegos().size() == 0){
                        System.out.println("No hay juegos registrados");
                    }else{
                        System.out.print("Nombre del juego que desea buscar:");
                        nombreJuego = consola.nextLine();
                        System.out.println(daoJuegos3.buscarJuego(nombreJuego,daoJuegos3.listarJuegos()));
                    }
                    break;
                case 5:
                    if(daoJuegos3.listarJuegos().size() == 0){
                        System.out.println("No hay juegos registrados");
                    }else{
                        System.out.println("\nEstos son los juegos registrados:");
                        daoJuegos3.listarJuegos().forEach(System.out :: println);
                    }

                    break;
                case 6:
                    opcion = 6;
                    break;
                default:
                    System.out.println("Esta opcion no existe.");
            }
        }while (opcion != 6);
    }
}
