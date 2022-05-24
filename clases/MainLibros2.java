package clases;

import java.util.Scanner;
public class MainLibros2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String tit;
        String aut;
        int ejemplares;
        int ejemplaresPrestados;

        Libros2 c1 = new Libros2();
        Libros2 c2 = new Libros2("Mil sombras","Gabriel Garcia Marques",3,1);

        System.out.print("Titulo del libro: ");
        tit = consola.nextLine();

        System.out.print("Nombre del autor: ");
        aut = consola.nextLine();

        System.out.print("Ejemplares disponibles: ");
        ejemplares = consola.nextInt();

        System.out.print("Ejemplares prestados: ");
        ejemplaresPrestados = consola.nextInt();

        c1.setTitulo(tit);
        c1.setAutor(aut);
        c1.setNejemplares(ejemplares);
        c1.setNejemplaresPrestados(ejemplaresPrestados);

        while(true){
            System.out.println("Datos libro1: ");
            System.out.println(c1.toString());

            System.out.println("\n");

            System.out.println("Datos libro2: ");
            System.out.println(c2.toString());

            System.out.print("Opcion\n1-Prestar libro\n2-Devolver libro\n3-Salir\n:");
            int opcion = consola.nextInt();

            if(opcion == 1) {
                System.out.print("Qué libro desea prestar\n1-Libro1\n2-Libro2\n:");
                opcion = consola.nextInt();

                if(opcion == 1){
                    c1.prestamo();
                }
                else if(opcion == 2){
                    c2.prestamo();
                }

                else{
                    System.out.println("Esta opcion no existe.");
                }
            }

            else if(opcion == 2){
                System.out.print("Qué libro desea devolver\n1-Libro1\n2-Libro2\n:");
                opcion = consola.nextInt();

                if(opcion == 1){
                    c1.devolusion();
                }
                else if(opcion == 2){
                    c2.devolusion();
                }

                else{
                    System.out.println("Esta opcion no existe.");
                }
            }

            else if(opcion == 3){
                break;
            }

            else{
                System.out.println("Esta opcion no existe.");
            }
        }
    }
}
