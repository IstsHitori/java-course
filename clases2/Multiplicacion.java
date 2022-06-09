package clases2;

public class Multiplicacion extends Calculadora {
    public Multiplicacion(){
        super();
    }

    public void multiplicar(){
        double multi = getNum1() * getNum2();
        System.out.println("El resultado de la multiplicacion es " + multi);
    }
}
