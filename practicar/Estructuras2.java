package practicar;
import java.util.*;
public class Estructuras2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6};
        int suma = 0;

        for(int i = 0; i < a.length; i++){
            suma = suma + a[i];

        }

        System.out.print("la suma del array es: " + suma);
    }
}
