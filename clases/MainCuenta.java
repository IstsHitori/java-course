package clases;
import java.util.Scanner;
public class MainCuenta {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        String Nombre,Ncuenta;
        double Saldo2;
        double Saldo;

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Joan","1003",1000);

        System.out.println("Registrando datos de la cuenta1: ");
        System.out.print("Nombre del cliente de la cuenta: ");
        Nombre = consola.nextLine();
        System.out.print("Numero de cuenta del cliente: ");
        Ncuenta = consola.nextLine();
        while(true){
            System.out.print("Saldo de la cuenta del cliente: ");
            Saldo = consola.nextDouble();
            if(Saldo < 0){
                System.out.println("No se acepta saldo menor que cero.");
            }
            else{
                break;
            }
        }
        cuenta1.setNameCliente(Nombre);
        cuenta1.setNumberAccount(Ncuenta);
        cuenta1.setSaldo(Saldo);
        while(true){
            System.out.println("Datos de la cuenta1: ");
            System.out.println(cuenta1.toString());
            System.out.println("Datos de la cuenta2: ");
            System.out.println(cuenta2.toString());

            System.out.println("\nQue opcion desea hacer: ");
            System.out.print("1-Añadir saldo\n2-Retirar saldo\n3-Transferir\n4-Salir\n:");
            int opcion = consola.nextInt();

            if(opcion == 1){
                System.out.println("A cual cuenta desea añadir: ");
                System.out.print("1-Cuenta1\n2-Cuenta2\n:");
                opcion = consola.nextInt();
                if(opcion == 1){
                    cuenta1.ingreso(Ncuenta,Saldo);
                }
                else if(opcion == 2){
                    cuenta2.ingreso(cuenta2.getNumberAccount(),cuenta2.getSaldo());
                }
                else{
                    System.out.println("Esta opcion no existe");
                }
            }
            else if(opcion == 2){
                System.out.println("A cual cuenta desea retirar: ");
                System.out.print("1-Cuenta1\n2-Cuenta2\n:");
                opcion = consola.nextInt();
                if(opcion == 1){
                    cuenta1.reintegro(Ncuenta,Saldo);
                }
                else if(opcion == 2){
                    cuenta2.reintegro(cuenta2.getNumberAccount(),cuenta2.getSaldo());
                }
                else{
                    System.out.println("Esta opcion no existe");
                }
            }
            else if(opcion == 3){
                System.out.println("A cual cuenta desea transferir: ");
                System.out.print("1-Cuenta1\n2-Cuenta2\n:");
                opcion = consola.nextInt();
                if(opcion == 1){
                    cuenta1.setSaldo(cuenta1.getSaldo() + cuenta2.transferencia(cuenta2.getNumberAccount(),cuenta2.getSaldo()));
                }
                else if(opcion == 2){
                    cuenta2.setSaldo(cuenta2.getSaldo() + cuenta1.transferencia(cuenta1.getNumberAccount(),cuenta1.getSaldo()));
                }
                else{
                    System.out.println("Esta opcion no existe");
                }
            }
            else if(opcion == 4){
                break;
            }
            else{
                System.out.println("Esta opcion no existe.");
            }
        }
    }
}
