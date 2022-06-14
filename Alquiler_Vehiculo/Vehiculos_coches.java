package Alquiler_Vehiculo;

public class Vehiculos_coches extends Vehiculos{
    private float suma_precio_base = 1.5F;

    public Vehiculos_coches(String matricula,String marca,String modelo){
        super(matricula, marca, modelo);
    }

    public float getSuma_precio_base() {
        return suma_precio_base;
    }

    public void setSuma_precio_base(float suma_precio_base) {
        this.suma_precio_base = suma_precio_base;
    }

    public float precioTotal(){
        
    }
    @Override
    public String toString(){
        return "\nVehiculo coche:\n" + super.toString() + "\nPrecio total:" + precioTotal();
    }
}
