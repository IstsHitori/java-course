package clases;

import java.util.Scanner;

public class Cuenta {
    Scanner consola = new Scanner(System.in);
    private String NameCliente;
    private String NumberAccount;
    private double Interes;
    private double Saldo;

    public Cuenta(){

    }

    public Cuenta(String NameCliente, String NumberAccount, double Saldo){
        this.NameCliente = NameCliente;
        this.NumberAccount = NumberAccount;
        this.Interes = Interes;
        this.Saldo = Saldo;
    }

    //Metodos get y set

    public String getNameCliente() {
        return NameCliente;
    }

    public void setNameCliente(String nameCliente) {
        NameCliente = nameCliente;
    }

    public String getNumberAccount() {
        return NumberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        NumberAccount = numberAccount;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        Interes = interes;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    @Override
    public String toString(){
        return "El cliente " + NameCliente + " con numero de cuenta " + NumberAccount + " tiene un saldo de " + Saldo;
    }

    public double ingreso(String NumberAccount, double SaldoCuenta){
        System.out.println("Cuanto desea añadir al saldo: ");
        double Monto = consola.nextDouble();
        if (Monto < 0){
            System.out.println("No puede añadir numeros negativos.");
        }
        else{
            System.out.println("Monto añadido exitosamente.");
            Saldo += Monto;
        }
        return Monto;
    }

    public double reintegro(String NumberAccount, double SaldoCuenta){
        double Monto = 0;
        if(SaldoCuenta == 0){
            System.out.println("El saldo es 0, no puede retirar.\n");
        }
        else{
            System.out.println("Cuanto dinero desea retirar de la cuenta: ");
            Monto = consola.nextDouble();

            if(SaldoCuenta < Monto){
                System.out.println("Usted no tiene disponible esta cantidad de dinero.\n");
            }

            else if(Monto < 0){
                System.out.println("No puede añadir numeros negativos.\n");
            }

            else{
                Saldo -= Monto;
                System.out.println("Retiro exitosamente.\n");
            }
        }

        return Monto;
    }

    public double transferencia(String destino, double importe) {
        double monto = 0;

        while(true){
            System.out.print("Cuanto desea transferir: ");
            monto = consola.nextDouble();

            if(monto < 0){
                System.out.println("No se aceptan numeros negativos. ");
            }
            else if(importe < monto){
                System.out.println("no tiene este saldo para transferir");
            }
            else{

                System.out.println("Transferencia exitosamente.\n");
                Saldo -= monto;
                break;

            }
        }
        return monto;
    }
}
