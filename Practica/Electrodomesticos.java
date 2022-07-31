package Practica;

public class Electrodomesticos {
    //Valores por defecto
    private final static String COLOR_DEFECTO = "blanco";

    private final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private final static double PRECIO_BASE_DEFECTO = 100;
    private final static double PESO_DEFECTO = 5;


    //Creamos los atributos
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomesticos(){

    }
    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        comprobarColor(color);
        consumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double obtenerPrecioFinal(){
        double plus = 0;

        switch(consumoEnergetico){
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }
        if(peso >= 0 && peso <= 19){
            plus += 10;
        }else if(peso >= 20 && peso <= 49){
            plus += 50;
        }else if(peso >= 50 && peso <= 79) {
            plus += 80;
        }else if(peso > 80) {
            plus += 100;
        }
        return precioBase + plus;
    }

    //Metodo para comprobar el color
    private void comprobarColor(String color){
        String colores[] = {"blanco","azul","negro","rojo","gris"};
        boolean encontrado = false;

        for(int i = 0; i < colores.length && !encontrado; i++){
            if(colores[i].equals(color)){
                encontrado = true;
            }
        }
        if(encontrado){
            this.color = color;
        }else{
            this.color = COLOR_DEFECTO;
        }
    }
    //Para comprobar el consumo energetico
    public final void consumoEnergetico(char consumo){
        if(consumo >= 65 && consumo <= 70){
            this.consumoEnergetico = consumo;
        }else{
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        }
    }
}
