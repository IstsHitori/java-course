package practicar;
import java.util.Scanner;
public class Estructuras1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero;
        boolean p = true;
        System.out.print("Escriba un número: ");
        numero = consola.nextInt();

        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                p = false;
            }
        }

        if( p == true){
            System.out.println("El numero es primo.");
        }

        else {
            System.out.println("El numero no es primo.");
        }
    }
}
