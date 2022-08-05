package com.software.juegos2;

import java.util.Scanner;

public class MainJuegos2 {
    public static void main(String[] args) {
       Scanner consola = new Scanner(System.in);
       DAOJuegos2Impl daoJuegos2 = new DAOJuegos2Impl();
       int opcion;
       String nombreJuego;
       Juego juego = null;

       do{
           System.out.println("\n------------------------");
           System.out.println("1-Iniciar Registro\n" +
                   "2-Registrar juego\n" +
                   "3-Eliminar juego\n" +
                   "4-Buscar juego\n" +
                   "5-Listar juegos\n" +
                   "6-Salir");
           System.out.print("Elija una opcion:");
           opcion = consola.nextInt();

           switch (opcion){
               case 1:
                   daoJuegos2.iniciarRegistro();
                   break;
               case 2:
                   do {
                       System.out.println("1-Juego Accion\n" +
                               "2-Juego Terror\n" +
                               "3-Juego Aventura");
                       System.out.print("Elija una opcion:");
                       opcion = consola.nextInt();
                       switch (opcion){
                           case 1:
                               consola.nextLine();
                               System.out.print("Nombre del juego de Accion que desea agregar:");
                               nombreJuego = consola.nextLine();
                               juego = new JuegoAccion(nombreJuego);
                               opcion = daoJuegos2.registrarJuego(juego,opcion);

                               break;
                           case 2:
                               consola.nextLine();

                               System.out.print("Nombre del juego de Terror que desea agregar:");
                               nombreJuego = consola.nextLine();
                               juego = new JuegoTerror(nombreJuego);
                               opcion = daoJuegos2.registrarJuego(juego,opcion);


                               break;
                           case 3:
                               consola.nextLine();

                               System.out.print("Nombre del juego de Aventura que desea agregar:");
                               nombreJuego = consola.nextLine();
                               juego = new JuegoAventura(nombreJuego);
                               opcion = daoJuegos2.registrarJuego(juego,opcion);

                               break;
                           default:
                               System.out.println("\nEsta opcion no existe.");
                       }
                   }while (opcion < 1 || opcion > 3);

                   break;
               case 3:
                   consola.nextLine();
                   System.out.print("Escriba el juego que desea eliminar:");
                   nombreJuego = consola.nextLine();
                   System.out.println(daoJuegos2.eliminarJuego(nombreJuego,daoJuegos2.juegos()));

                   break;
               case 4:
                   consola.nextLine();
                   System.out.print("Escriba el nombre del juego que desea buscar:");
                   nombreJuego = consola.nextLine();

                   System.out.println(daoJuegos2.buscarJuego(nombreJuego,daoJuegos2.juegos()));
                   break;
               case 5:
                   System.out.println("-------------------------------------------");
                   System.out.println("\nEstos son los juegos que hay registrados.\n");

                   daoJuegos2.juegos().forEach(System.out::println);
                   break;
               case 6:
                   System.out.println("\nHasta luego.");
                   opcion = 6;
                   break;

               default:
                   System.out.println("\nEsta opcion no existe.");
           }
       }while (opcion!=6);
    }
}
