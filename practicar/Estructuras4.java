package practicar;
import java.util.*;
public class Estructuras4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int array1[];
        int array2[];
        int array3[];
        int n = 0;

        while(true){
            System.out.print("De cuanto quiere la dimension del primer array: ");
            n = consola.nextInt();
            if(!(n % 2 == 0)){
                System.out.println("\nEl array no puede ser impar\n");
            }
            else{
                array1 = new int[n];
                System.out.print("De cuanto quiere la dimension del segundo array: ");
                n = consola.nextInt();
                if((!(n % 2 == 0)) || (n != array1.length)){
                    System.out.print("\nEl segundo no puede ser impar y tampoco diferente a la dimension del primer array\n");
                }
                else{
                    array2 = new int[n];
                    break;

                }
            }
        }
        array3 = new int[n];

        for(int  i = 0; i < n; i++){
            System.out.print("Dame el "+(i+1)+ " numero del primer array :");
            int numero = consola.nextInt();
            array1[i] = numero;

            System.out.print("Dame el "+(i+1)+ " numero del segundo array :");
            numero = consola.nextInt();
            array2[i] = numero;

        }
        for(int i = 0; i < n; i++){
            int mult = 0;
            int mul2 = 0;
            int total = 0;

            mult = array1[i];
            mul2 = array2[i];

            total = mult * mul2;

            array3[i] = total;
        }
        System.out.println("\nEl resultado de las multiplicaciones del array son de: ");
        for(int i : array3){
            System.out.print(i+"-");
        }
    }
}
