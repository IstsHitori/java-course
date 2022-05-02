package ArrayList;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int n;
        ArrayList <Integer> NombreArray = new ArrayList<Integer>();

        System.out.print("Dame un numero: ");
        n = consola.nextInt();

        NombreArray.add(n);

        for(int i = 0; i < NombreArray.size(); i++){
            System.out.print(NombreArray.get(i));
        }
    }
}
