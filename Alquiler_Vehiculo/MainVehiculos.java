package Alquiler_Vehiculo;
import javax.swing.*;
import java.util.ArrayList;

public class MainVehiculos {
    static ArrayList<Vehiculos> vehiculos = new ArrayList<>();

    public static void opcion1(){
        Empleado empleado1 = new Empleado();
        empleado1.añadeVehiculo(vehiculos);
    }
    public static void opcion2(){
        Empleado empleado1 = new Empleado();
        empleado1.obtenerPrecioAlquiler(vehiculos);
    }
    public static void opcion3(){
        Empleado empleado1 = new Empleado();
        empleado1.mostrarPrecios(vehiculos);
    }
    public static void main(String[] args) {
        int opcion;
        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Añade Vehiculo" +
                    "\n2-Obtener precio vehiculo" +
                    "\n3-Mostrar todos los precios" +
                    "\n4-Salir" +
                    "\nIngrese una opcion:"));

            if(opcion < 1 || opcion > 4){
                JOptionPane.showMessageDialog(null,"Esta opción no existe.");
            }
            else if(opcion == 4){
                JOptionPane.showMessageDialog(null,"BYE!!");
                break;
            }
            else{
                switch (opcion){
                    case 1:
                        opcion1();

                        break;

                    case 2:
                        if(vehiculos.size() == 0){
                            JOptionPane.showMessageDialog(null,"La lista de vehiculos está vacía.");
                        }
                        else{
                            opcion2();
                        }
                        break;

                    case 3:
                        if(vehiculos.size() == 0){
                            JOptionPane.showMessageDialog(null,"La lista de vehiculos está vacía.");

                        }
                        else{
                            opcion3();
                        }
                        break;

                }
            }
        }

    }
}
