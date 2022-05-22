package clases;

public class MainCaja {
    public static void main(String[] args) {
        Caja volumen1 = new Caja(3,2,6);

        int operacion = (volumen1.volumen(volumen1.ancho, volumen1.alto, volumen1.profundo));

        System.out.println("El resultado es: " + operacion);
    }
}
