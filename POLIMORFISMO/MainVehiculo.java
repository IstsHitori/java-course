package POLIMORFISMO;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("GTR-000","Ferrari","2000");
        misVehiculos[1] = new VehiculoTurismo(4,"GTR-001","Lambo","2001");
        misVehiculos[2] = new VehiculoDeportivo(3000, "GTR-002","Mazda","2002");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"GTR-003","Toyota","2003");

        for(Vehiculo vehiculos : misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("\n");
        }
    }
}
