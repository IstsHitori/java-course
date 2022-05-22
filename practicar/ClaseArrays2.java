package practicar;

import java.util.Scanner;
public class ClaseArrays2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numeros[] = new int[10];
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        int n;

        for(int i =0; i < numeros.length; i++){
            System.out.println("Numero: " +(i+1)+": ");
            n = consola.nextInt();
            numeros[i] = n;

            if(n > 0){
                positivos++;
            }

            else if( n == 0){
                ceros++;
            }

            else if(n < 0){
                negativos++;
            }
        }


        System.out.println("Hay "+negativos+" numeros negativos.");
        System.out.println("Hay "+positivos+" numeros positivos");
        System.out.println("Hay" + ceros + " numeros ceros");
    }
}
