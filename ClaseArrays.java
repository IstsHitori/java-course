import java.util.Scanner;

public class ClaseArrays {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int n = 9;
        String android[][][][] = new String[2][3][2][2];
        android[1][0][0][1] = "Monkey";

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    for(int l = 0; l < 2; l++){
                        System.out.println(android[i][j][k][l]);
                        System.out.println("Matriz: " + "["+i+"]"+"["+j+"]"+"["+k+"]"+"["+l+"]" );
                    }
                }
            }
        }

        System.out.println("\n");

    }
}
