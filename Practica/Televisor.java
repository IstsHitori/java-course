package Practica;

public class Televisor  extends Electrodomesticos{
    private int resolucion;
    private boolean sincronizadorTDT;

    public Televisor(){

    }
    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sincronizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    @Override
    public double obtenerPrecioFinal(){
        double plus = super.obtenerPrecioFinal();

        if(resolucion > 40){
            plus += getPrecioBase() * 0.3;
        }

        if(sincronizadorTDT){
            plus += 50;
        }
        return plus;
    }
}
