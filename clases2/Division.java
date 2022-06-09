package clases2;

public class Division extends Calculadora{
    public Division(){
        super();
    }

    public void divide(){
        if(getNum2() == 0){
            System.out.println("La division sobre 0 no existe.");
        }

        else{
            double division = getNum1() / getNum2();
            System.out.println("El reusltado de la division es: " + division);
        }
    }
}
