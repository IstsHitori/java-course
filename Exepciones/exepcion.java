package Exepciones;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class exepcion {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        int n1,n2;

        System.out.print("Dame el primer numero:");
        n1 = consola.nextInt();
        System.out.print("Dame el segundo numero:");
        n2 = consola.nextInt();

        try{
            int resultado = n1 / n2;

        }catch(ArithmeticException ex){
            System.out.println("Error, no se puede dividir sobre 0");
        }
    }
}
