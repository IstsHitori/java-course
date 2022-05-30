package POLIMORFISMO;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67","Mazda","2003");
        misVehiculos[1] = new VehiculoTurismo(4,"GH76","Audi","2020");
        misVehiculos[2] = new VehiculoDeportivo(500,"GH89","Ferrari","2021");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"JI8H","Toyota","2006");

        for(Vehiculo vehiculos : misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
    }
}
