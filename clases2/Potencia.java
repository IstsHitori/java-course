package clases2;

public class Potencia extends Multiplicacion{
    public Potencia(){
        super();
    }

    public void potenciar(){
        double potencia = Math.pow(getNum1(), getNum2());
        System.out.println("El reusltado de la potencia es: " + potencia);
    }
}
