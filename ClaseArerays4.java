

import java.util.*;

public class ClaseArerays4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String usuarios[][][][];
        int n;
        String cedula,nombre,apellido,nota;
        System.out.print("De cuantos estudiantes:");
        n = consola.nextInt();

        usuarios = new String[n][n][n][n];

        while(true){
            consola.nextLine();
            for(int i = 0; i < n;i++ ){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        for(int l = 0; l < n; l++){

                            System.out.print("Matríz ["+i+"]["+j+"]["+k+"]["+l+"] :");
                            usuarios[i][j][k][l] = consola.nextLine();
                        }
                    }
                }
            }
        }

    }
}
