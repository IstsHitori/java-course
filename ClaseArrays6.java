import java.util.Scanner;

public class ClaseArrays6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float numero;
        int numero2;
        System.out.print("Dame el número:");
        numero = consola.nextFloat();
        separanum(numero);

        System.out.print("Dame el otro numero: ");
        numero2 = consola.nextInt();
        cuantasmonedas(numero2);
    }

    public static float separanum(float valor){
        float centavos = 0,unidades = 0,decenas = 0,centenas = 0;

        centavos =(valor - (int)valor) * 100;
        centavos = (int)centavos;
        centenas =(int) (valor / 100);
        decenas = (int) (valor - 100)/100;
        unidades = (int) valor % 10;

        System.out.print("Centavos "+ centavos + " unidades " + unidades+" decenas "  + decenas+ " centenas "  + centenas + "\n");

        return valor;
    }

    public static float cuantasmonedas(int centavos){
        int moneda = centavos;
        int moneda_1 = 0,moneda5 = 0,moneda10 = 0,moneda25 = 0,moneda50 = 0;

        moneda50 = moneda / 50;
        if(moneda50 >= 1){
            moneda50 = moneda50;
            moneda = moneda - 50;
        }
        else{
            moneda50 = 0;
        }

        moneda25 = moneda / 25;
        if(moneda25 >= 1){
            moneda25 = moneda25;
            moneda = moneda - 25;
        }
        else {
            moneda25 = 0;
        }

        moneda10 = moneda/10;
        if(moneda10>= 1){
            moneda10 = moneda10;
            moneda = moneda - 10;
        }
        else{
            moneda10 = 0;
        }

        moneda_1 = moneda / 1;
        if(moneda_1 >= 1){
            moneda_1 = moneda_1;
            moneda = moneda - 1;
        }
        else{
            moneda = 0;
        }

        System.out.println("monedas de 50 centavo : " + moneda50);
        System.out.println("monedas de 25 centavo : " + moneda25);
        System.out.println("monedas de 10 centavo : " + moneda10);
        System.out.println("monedas de 5 centavo : " + moneda5);
        System.out.println("monedas de 1 centavo : " + moneda_1);

        return moneda;
    }
}
