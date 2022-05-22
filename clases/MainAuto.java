package clases;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1001,"XZD-455","mercedes","2010","blanco",4,"automovil");
        Auto auto2 = new Auto(1002,"XZD-456","Lambo","2008","rojo",5,"automovil");
        Auto auto3 = new Auto(1003,"XZD-457","Ferrari","2020","gris",3,"automovil");

        auto1.setPasajeros(10);
        if((auto1.getPasajeros() > auto2.getPasajeros()) && (auto1.getPasajeros() > auto3.getPasajeros())){
            System.out.println("El auto1 tiene mayor numero de pasajeros");
        }
        if((auto2.getPasajeros() > auto1.getPasajeros()) && (auto2.getPasajeros() > auto3.getPasajeros())){
            System.out.println("El auto2 tiene mayor numero de pasajeros");
        }
        if((auto3.getPasajeros() > auto2.getPasajeros()) && (auto3.getPasajeros() > auto1.getPasajeros())){
            System.out.println("El auto3 tiene mayor numero de pasajeros");
        }
    }
}
