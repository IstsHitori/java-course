package practicar;

import java.util.Scanner;
public class ClaseArrays3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float altura[];
        int n;
        float persona;
        int superior = 0;
        float media = 0;
        int inferior = 0;


        System.out.print("De cuantas personas desea leer las alturas: ");
        n = consola.nextInt();

        altura = new float[n];

        for(int i = 0; i < altura.length; i++){
            System.out.println(("Altura de la " +(i+1)+" persona:"));
            persona = consola.nextFloat();

            altura[i] = persona;
        }

        for(int  i = 0; i < altura.length; i++){
            media = (media + altura[i]);
            // 0 + 1.50
            //1.50 1.80

        }

        media = media / n;
        //4,6 = 4,6 / 3

        for(int j = 0; j < altura.length; j++){
            if(altura[j] > media){
                superior++;
            }

            else if(altura[j] < media){
                inferior++;
            }
        }

        System.out.println("La altura media es de: " + media);
        System.out.println("Las alturas mayoes a la media son: " + superior);
        System.out.println("Las alturas menores a la media son: " + inferior);
    }
}
