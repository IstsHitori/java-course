package clases2;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {
        String pregunta;
        int opcion;
        Suma sumar = new Suma();
        Resta restar = new Resta();
        Multiplicacion multiplicar = new Multiplicacion();
        Potencia potenciar = new Potencia();
        Division dividir = new Division();

        int n1,n2;
        Scanner consola = new Scanner(System.in);
        do{
            do{
                System.out.print("1-SUMA\n2-RESTA\n3-MULTIPLICACION\n4-DIVISION\n5-POTENCIA\n:");
                opcion = consola.nextInt();
                if(opcion < 1 || opcion > 5){
                    System.out.println("Esta opcion no existe.");
                }
            }
            while(opcion < 1 || opcion > 5);

            switch (opcion){
                case 1:
                    System.out.print("Numero 1: ");
                    n1 = consola.nextInt();
                    System.out.print("Numero 2: ");
                    n2 = consola.nextInt();
                    sumar.setNum1(n1);
                    sumar.setNum2(n2);
                    sumar.suma();
                    break;
                case 2:
                    System.out.print("Numero 1: ");
                    n1 = consola.nextInt();
                    System.out.print("Numero 2: ");
                    n2 = consola.nextInt();
                    restar.setNum1(n1);
                    restar.setNum2(n2);
                    restar.resta();
                    break;
                case 3:
                    System.out.print("Numero 1: ");
                    n1 = consola.nextInt();
                    System.out.print("Numero 2: ");
                    n2 = consola.nextInt();
                    multiplicar.setNum1(n1);
                    multiplicar.setNum2(n2);
                    multiplicar.multiplicar();
                    break;
                case 4:
                    System.out.print("Numero 1: ");
                    n1 = consola.nextInt();
                    System.out.print("Numero 2: ");
                    n2 = consola.nextInt();
                    dividir.setNum1(n1);
                    dividir.setNum2(n2);
                    dividir.divide();
                    break;
                case 5:
                    System.out.print("Numero 1: ");
                    n1 = consola.nextInt();
                    System.out.print("Numero 2: ");
                    n2 = consola.nextInt();
                    potenciar.setNum1(n1);
                    potenciar.setNum2(n2);
                    potenciar.potenciar();
                    break;
            }

            System.out.println("Desea hacer otro calculo (S/N)");
            pregunta = consola.next();
        }
        while(pregunta.contains("S") || pregunta.contains("s"));
    }
}