package clases;

public class TrianguloIsoceles {
    private double base;
    private double lado;

    public TrianguloIsoceles(){

    }

    public TrianguloIsoceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }

    public double getBase(){
        return base;
    }
    public void setBase(float base){
        this.base = base;
    }

    public double getLado(){
        return lado;
    }
    public void setLado(float lado){
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double P = 2 * lado + base;

        return P;
    }

    public double obtenerArea(){
        double area = ( base * Math.sqrt((lado * lado) - ((base * base ) / 4))) / 2 ;
        return area;
    }
}
