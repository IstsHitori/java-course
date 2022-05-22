package practicar;
import java.util.*;
public class Estructuras3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int array1[] = {1,2,3};
        int array2[] = {1,2,3,4};
        int array3[] = {1,2,2};

        while(true){
            System.out.print("Que arrays desea comparar:\n" +
                    "1-array1 y array2\n" +
                    "2-array1 y array3\n" +
                    "3-array2 y array3\n" +
                    "4-array1 y array1\n"+
                    "5-array2 y array2\n"+
                    "6-array3 y array3\n"+
                    "7-Salir\n"+
                    ":");
            int opcion = consola.nextInt();

            if(opcion == 1){
                int sumar1 = 0;
                int sumar2 = 0;

                for(int i = 0; i < array1.length; i++){
                    sumar1 = sumar1 + array1[i];
                }

                for(int i = 0; i < array2.length;i++){
                    sumar2 = sumar2 + array2[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }
            }

            else if(opcion == 2){
                int sumar1 = 0;
                int sumar2 = 0;
                for(int i = 0; i < array1.length; i++){
                    sumar1 = sumar1 + array1[i];
                }

                for(int i = 0; i < array3.length;i++){
                    sumar2 = sumar2 + array3[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }

            }

            else if(opcion == 3){
                int sumar1 = 0;
                int sumar2 = 0;
                for(int i = 0; i < array2.length; i++){
                    sumar1 = sumar1 + array2[i];
                }

                for(int i = 0; i < array3.length;i++){
                    sumar2 = sumar2 + array3[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }
            }

            else if(opcion == 4){
                int sumar1 = 0;
                int sumar2 = 0;
                for(int i = 0; i < array1.length; i++){
                    sumar1 = sumar1 + array1[i];
                }

                for(int i = 0; i < array1.length;i++){
                    sumar2 = sumar2 + array1[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }
            }

            else if(opcion == 5){
                int sumar1 = 0;
                int sumar2 = 0;
                for(int i = 0; i < array2.length; i++){
                    sumar1 = sumar1 + array2[i];
                }

                for(int i = 0; i < array2.length;i++){
                    sumar2 = sumar2 + array2[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }
            }

            else if(opcion == 6){
                int sumar1 = 0;
                int sumar2 = 0;
                for(int i = 0; i < array3.length; i++){
                    sumar1 = sumar1 + array3[i];
                }

                for(int i = 0; i < array3.length;i++){
                    sumar2 = sumar2 + array3[i];
                }
                if(sumar1 == sumar2){
                    System.out.println("Los arrays son iguales.");
                }
                else{
                    System.out.println("Los arrays no son iguales.");
                }
            }

            else if(opcion == 7){
                break;
            }

            else{
                System.out.println("Esta opcion no existe.\n");
            }
        }
    }
}
