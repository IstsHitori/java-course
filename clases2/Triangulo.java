package clases2;

public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    @Override
    public double area(){
        double P = (lado1 + lado2 + lado3) / 2;

        double A = Math.sqrt(P * (P - lado1) * (P - lado2) * (P - lado3));

        return A;
    }
    @Override
    public String toString(){
        return "Triangulo:\n" + super.toString() + "\nLado1: " +lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3 ;
    }
}
