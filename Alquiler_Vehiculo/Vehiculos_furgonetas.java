package Alquiler_Vehiculo;

public class Vehiculos_furgonetas extends Vehiculos{
    private float precio_suma = 20;
    private float PMA;

    public Vehiculos_furgonetas(String matricula, String marca, String modelo, float PMA) {
        super(matricula, marca, modelo);
        this.PMA = PMA;
    }

    public float getPrecio_suma() {
        return precio_suma;
    }

    public void setPrecio_suma(float precio_suma) {
        this.precio_suma = precio_suma;
    }

    public float getPMA() {
        return PMA;
    }

    public void setPMA(float PMA) {
        this.PMA = PMA;
    }
}
