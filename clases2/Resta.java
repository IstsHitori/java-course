package clases2;

public class Resta  extends Calculadora{
    public Resta(){
        super();
    }

    public void resta(){
        double resta = getNum1() - getNum2();
        System.out.println("El resultado de la resta es:" + resta);
    }
}
