package practicar;
import java.util.*;
public class Estructuras5 {
    public static void main(String[] args) {
        int array[];
        Scanner consola = new Scanner(System.in);

        while(true){
            System.out.print("Dame la dimension del array: ");
            int n = consola.nextInt();
            if(n >= 1){
                array = new int[n];
                for(int i = 0; i < array.length; i++){
                    System.out.print("Dame el " +(i+1)+" elemento del array: ");
                    array[i] = consola.nextInt();
                }
                break;
            }

            else{
                System.out.println("La dimension del array no puede ser menor que 1.\n");
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i]; j++){
                System.out.print("*");
            }
            System.out.print(",");
        }
    }
}
