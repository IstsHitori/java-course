package practicar;
import java.util.*;
public class Estrucuturas6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int matriz[][] = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "] :");
                matriz[i][j] = consola.nextInt();

            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
