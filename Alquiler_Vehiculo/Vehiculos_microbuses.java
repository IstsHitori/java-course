package Alquiler_Vehiculo;

public class Vehiculos_microbuses extends Vehiculos{
    private float suma_plaza = 2;
    private int plaza;

    public Vehiculos_microbuses(String matricula, String marca, String modelo, int plaza) {
        super(matricula, marca, modelo);
        this.plaza = plaza;
    }

    public float getSuma_plaza() {
        return suma_plaza;
    }

    public void setSuma_plaza(float suma_plaza) {
        this.suma_plaza = suma_plaza;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public float precioTotal(int dias){
        float precio = (dias * super.getPrecio_dia()) + (suma_plaza  / plaza);
        return precio;

    }
    @Override
    public String toString(){
        return "\nCoche microbus:\n" + super.toString();
    }
}
