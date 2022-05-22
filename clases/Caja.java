package clases;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){
        System.out.println("Ejecuanto constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo){
        System.out.println("Ejecutando contructor con argumentos.");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int volumen(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        int vol = this.ancho * this.alto * this.profundo;

        return vol;
    }
}
