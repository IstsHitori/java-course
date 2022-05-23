package clases;
import java.util.Scanner;
public class MainCuadrilatero {
    public static void main(String[] args) {
        Scanner consola =  new Scanner(System.in);
        Cuadrilatero c1;
        float lado1,lado2;

        while(true){
            System.out.print("Ingrese el valor del primer lado: ");
            lado1 = consola.nextFloat();

            System.out.print("Ingrese el valor del segundo lado: ");
            lado2 = consola.nextFloat();

            if(lado1 == lado2){ //Es un cuadrado
                c1 = new Cuadrilatero(lado1);
            }
            else{
                c1 = new Cuadrilatero(lado1,lado2);
            }

            System.out.println("El perimetro es: " + c1.getPerimetro());
            System.out.println("El area es: " + c1.getArea());

            System.out.println("\nDesea calcular algo mas?: (Y/N): ");
            String op = consola.next();
            op.toUpperCase();

            if(op.contains("N")){
                break;
            }

            else{
                System.out.println(" ");
            }
        }
    }
}
