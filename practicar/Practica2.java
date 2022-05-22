package practicar;
import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float M1=0,Vi1=0,M2=0,Vi2=0,V1=0,V2=0;
        byte opcion = 0;

        while(true){
            System.out.print("Qué o pción desea hacer:\n" +
                    "1-Despejar velocidad inicial en 1 = Vi1\n" +
                    "2-Despejar velocidad inicial en 2 = Vi2\n" +
                    "3-Despejar velocidad en 1 = V1\n" +
                    "4-Despejar velovidad en 2 = V2\n" +
                    "5-Salir.\n:");
            opcion = consola.nextByte();
            if (opcion == 1) {
                System.out.print("Dame la masa en 1 = M1: ");
                M1 = consola.nextFloat();

                System.out.print("Dame la velocidad en 1 = V1: ");
                V1 = consola.nextFloat();

                System.out.print("Dame la masa en 2 = M2: ");
                M2 = consola.nextFloat();

                System.out.print("Dame la velocidad en 2 = V2: ");
                V2 = consola.nextFloat();

                System.out.print("Dame la velocidad inicial en 2 = Vi2: ");
                Vi2 = consola.nextFloat();

                Vi1 = M1*V1+M2*V2/M1+M2+Vi2;

                System.out.println("La velocidad inicial en 1 = Vi1 es: " + Vi1+"m/s\n");

            }

            else if(opcion == 5){
                break;
            }
        }
    }
}
