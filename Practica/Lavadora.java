package Practica;

public class Lavadora  extends Electrodomesticos{
    private int carga;

    public Lavadora(){

    }
    public Lavadora(double precioBase, String color, char consumoEenergetico, double peso ,int carga){
        super(precioBase, color, consumoEenergetico, peso);
        this.carga = carga;
    }

    public void setCarga(int carga){
        this.carga = carga;
    }

    public int getCarga(){
        return carga;
    }
    @Override
    public double obtenerPrecioFinal(){
        double plus = super.obtenerPrecioFinal();

        if(getCarga() > 30){
            plus += 50;
        }
        return plus;
    }
}
