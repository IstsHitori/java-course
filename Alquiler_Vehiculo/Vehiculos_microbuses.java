package Alquiler_Vehiculo;

public class Vehiculos_microbuses extends Vehiculos{
    private float suma_plaza = 2;

    public Vehiculos_microbuses(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }

    public float getSuma_plaza() {
        return suma_plaza;
    }

    public void setSuma_plaza(float suma_plaza) {
        this.suma_plaza = suma_plaza;
    }
}
