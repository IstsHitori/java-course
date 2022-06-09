package clases2;

public class Suma extends Calculadora{

    public Suma(){
        super();
    }

    public void suma(){
        double suma = getNum1() + getNum2();

        System.out.println("El resultado es: " + suma);
    }
}
