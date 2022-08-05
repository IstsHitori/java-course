package com.software.clientes.DAO;
import java.io.File;
import java.util.List;
import java.util.Scanner;
public class MainCliente {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        File archivo = null;
        DAOClienteImpl cliente = new DAOClienteImpl();
        Cliente cliente1 = new Cliente();
        int opcion;

        do{
            System.out.println("-------------------------");
            System.out.println("1-Crear Archivo\n2-Eliminar Archivo\n3-Agregar cliente\n4-Eliminar Cliente\n5-Listar Clientes\n6-Buscar cliente\n7-Salir");
            System.out.print("Elija una opcion:");
            opcion = consola.nextInt();
            switch (opcion) {
                case 1:
                    cliente.crear();
                    break;
                case 2:
                    cliente.eliminar();
                    break;
                case 3:
                    consola.nextLine();
                    System.out.print("Nombre del cliente que desea agregar:");
                    String nombreCliente = consola.nextLine();
                    cliente1 = new Cliente(nombreCliente);
                    cliente.escribir(cliente1, true);
                    break;
                case 4:
                    consola.nextLine();
                    System.out.print("\nNombre del cliente que desea borrar:");
                    nombreCliente = consola.nextLine();
                    System.out.println(cliente.borrarCliente(nombreCliente,cliente.listar()));
                    break;
                case 5:
                    System.out.println("Los clientes registrados son:");

                    for(Cliente listar : cliente.listar()){
                        System.out.println(listar.toString());
                    }
                    break;
                case 6:
                    consola.nextLine();
                    System.out.print("Nombre del cliente que desea buscar:");
                    nombreCliente = consola.nextLine();
                    System.out.println(cliente.buscar(nombreCliente));
                    break;
                case 7:
                    opcion = 7;
                    break;
                default:
                    System.out.println("\nEsta opcion no existe");
            }
        }while (opcion != 7);
    }
}
