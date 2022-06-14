package Alquiler_Vehiculo;

public class Vehiculos_camiones extends Vehiculos{
    private float suma_precio = 40;

    public Vehiculos_camiones(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public float getSuma_precio() {
        return suma_precio;
    }

    public void setSuma_precio(float suma_precio) {
        this.suma_precio = suma_precio;
    }
}
