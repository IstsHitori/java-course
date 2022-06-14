package Alquiler_Vehiculo;
import POLIMORFISMO.Vehiculo;

import java.util.ArrayList;
import javax.swing.*;

public class Empleado {
    private String ID;
    private String nombre;

    public Empleado(){

    }

    public Empleado(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public void añadeVehiculo(ArrayList<Vehiculos> vehiculos){
        int opcion,plaza;
        String matricula,marca,modelo;

        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Vehiculo coche" +
                    "\n2-Vehiculo microbuses" +
                    "\n3-Vehiculo furgoneta de carga" +
                    "\n4-Vehiculo camion" +
                    "\nElija una opcion:"));

            if(opcion < 1 || opcion > 5){
                JOptionPane.showMessageDialog(null,"Esta opción no existe.");
            }
            else{
                break;
            }
        }
        switch (opcion){
            case 1:
                //Registrar vehiculo coche
                matricula = JOptionPane.showInputDialog("Matricula del coche:");
                marca = JOptionPane.showInputDialog("Marca del coche:");
                modelo = JOptionPane.showInputDialog("Modelo del coche:");
                plaza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la plaza:"));

                Vehiculos_coches coche = new Vehiculos_coches(matricula,marca,modelo,plaza);
                vehiculos.add(coche);
                break;

            case 2:
                //Registrar vehiculo microbus
                matricula = JOptionPane.showInputDialog("Matricula del coche:");
                marca = JOptionPane.showInputDialog("Marca del coche:");
                modelo = JOptionPane.showInputDialog("Modelo del coche:");
                plaza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la plaza"));


                Vehiculos_microbuses microbuses = new Vehiculos_microbuses(matricula,marca,modelo,plaza);
                vehiculos.add(microbuses);
                break;

            case 3:
                //Registrar vehiculo furgoneta
                float PMA;
                matricula = JOptionPane.showInputDialog("Matricula del coche:");
                marca = JOptionPane.showInputDialog("Marca del coche:");
                modelo = JOptionPane.showInputDialog("Modelo del coche:");
                PMA = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso máximo utilizado en toneladas:"));

                Vehiculos_furgonetas furgonetas = new Vehiculos_furgonetas(matricula,marca,modelo,PMA);
                vehiculos.add(furgonetas);
                break;

            case 4:
                //Registrar vehiculo camion
                matricula = JOptionPane.showInputDialog("Matricula del coche:");
                marca = JOptionPane.showInputDialog("Marca del coche:");
                modelo = JOptionPane.showInputDialog("Modelo del coche:");

                Vehiculos_camiones camiones = new Vehiculos_camiones(matricula,marca,modelo);
                vehiculos.add(camiones);
                break;
        }
        JOptionPane.showMessageDialog(null,"Vehiculo añadido exitosamente.");
    }

    public void obtenerPrecioAlquiler(ArrayList<Vehiculos> vehiculos){
        boolean verificar_coche = false;
        String matricula;
        int dias = 0;
        float precio = 0;
        System.out.println("Datos de los vehiculos:");
        for(Vehiculos mostrar : vehiculos){
            System.out.println(mostrar);
            System.out.println("<<------------------->>");
        }


        matricula = JOptionPane.showInputDialog("Ingrese la matricula del vehiculo:");
        for(Vehiculos buscar_matricula : vehiculos){
            if(buscar_matricula.getMatricula().equals(matricula)){
                verificar_coche = true;
                dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días que ha durado el alquiler:"));
                precio = buscar_matricula.precioTotal(dias);
            }
        }
        if(verificar_coche == true){
            JOptionPane.showMessageDialog(null,"El precio del alquiler del coche con matricula: " + matricula + " es de: " + precio);
        }
        else{
            JOptionPane.showMessageDialog(null,"No existe este vehículo en la lista de vehículos registrados.");
        }
    }

    public void mostrarPrecios(ArrayList<Vehiculos> vehiculos){
        int dias;
        int i = 0;

        dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias del alquiler: "));

        for(Vehiculos mostrar_precio : vehiculos){
            System.out.println("La matricula del vehiculo " + (i+1) + " es " + mostrar_precio.getMatricula());
            System.out.println("El precio de alquiler del vehiculo " + (i+1) +  " con matricula " + mostrar_precio.getMatricula() + " es de :" +  mostrar_precio.precioTotal(dias));
            System.out.println("<<<------------------------------------------------------------->>>");
        }
    }
}
