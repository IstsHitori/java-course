package Alquiler_Vehiculo;

public class Vehiculos_coches extends Vehiculos{
    private float suma_precio_base = 1.5F;
    private int plaza;

    public Vehiculos_coches(String matricula,String marca,String modelo,int plaza){
        super(matricula, marca, modelo);
        this.plaza = plaza;
    }

    public float getSuma_precio_base() {
        return suma_precio_base;
    }

    public void setSuma_precio_base(float suma_precio_base) {
        this.suma_precio_base = suma_precio_base;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public float precioTotal(int dias){
        float precio = (super.getPrecio_dia() * dias) + ((suma_precio_base * dias) + (suma_precio_base * plaza));

        return precio;
    }
    @Override
    public String toString(){
        return "\nVehiculo coche:\n" + super.toString();
    }
}
