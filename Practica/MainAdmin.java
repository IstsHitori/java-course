package Practica;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainAdmin {
    static Scanner consola = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Carro> carros = new ArrayList<>();
    static ArrayList<Carro> llevar_coche;
    static Admin admin = new Admin();
    static Carro coche = new Carro();
    static File file_clientes = new File("C:\\Users\\franc\\Desktop\\Cursos\\Clientes.txt");
    static File file_coches = new File("C:\\Users\\franc\\Desktop\\Cursos\\Coches.txt");
    static Cliente cliente = new Cliente();
    public static void main(String[] args) {
        int opcion = 0;
        while(true){
            try {
                System.out.print("1-Iniciar sesion\n2-Salir\n:");
                opcion = consola.nextInt();
                if(opcion < 1 || opcion > 2){
                    System.out.println("Esta opcion no existe.");
                }else if(opcion == 2){
                    break;
                }else{
                    consola.nextLine();
                    String user,password;

                    System.out.print("Usuario:");
                    user = consola.nextLine();
                    System.out.print("Contraseña:");
                    password = consola.nextLine();

                    if(admin.iniciarSesion(user,password)){

                        System.out.println("SESION INICIADA CORRECTAMENTE\n");

                        while(true){
                            System.out.print("1-Registrar cliente\n2-Registrar coche a la lista de coches\n3-Ver Clientes\n4-Ver coches\n5-Cerrar sesion\n:");
                            opcion = consola.nextInt();

                            if(opcion < 1 || opcion > 5){
                                System.out.println("Esta opcion no existe.\n");
                            } else if (opcion == 5) {
                                break;
                            }else{
                                switch (opcion){
                                    case 1:
                                        consola.nextLine();
                                        String respuesta = "";
                                        if(carros.size() == 0){
                                            System.out.print("No hay carros para vender, desea registrar un coche a la lista? (S/N):");
                                            respuesta = consola.nextLine();
                                            if(respuesta.equals("S")|| respuesta.equals("s")){
                                                registrarCoche();
                                            }else{
                                                System.out.println("\nNo se registro el cliente.\n ");
                                            }
                                        }else{
                                            registrarCliente();
                                        }
                                        break;

                                    case 2:
                                        consola.nextLine();
                                        registrarCoche();
                                        break;

                                    case 3:
                                        if (clientes.size() == 0) {
                                            System.out.println("No hay clientes registados.");
                                        }else{
                                            verClientes();

                                        }
                                        break;
                                    case 4:
                                        if (carros.size() == 0) {
                                            System.out.println("No hay coches registados.");
                                        }else{
                                            verCoches();
                                        }
                                        break;
                                }
                            }
                        }
                    }else{
                        System.out.println("USUARIO O CONTRASEÑA INCORRECTA");
                    }
                }
            }catch (InputMismatchException ex){
                consola.nextLine();
                System.out.println("No se aceptan caracteres String " + ex + " \n");
            }
        }
    }

    public static void registrarCliente(){
        String name;
        int DNI = cliente.getAumentar();
        boolean buscar = true;

        System.out.print("Nombre del cliente:");
        name = consola.nextLine();

        System.out.println("\nLista de coches disponibles para llevar:");
        for(Carro mostrar : carros){
            System.out.println(mostrar.toString());
            System.out.println("---------------------------");
        }
        System.out.print("Escriba la matricua del coche que desea llevar:");
        String matricula = consola.nextLine();

        for(Carro buscar_coche : carros){
            if(buscar_coche.getMatricula().equals(matricula)){

                llevar_coche = new ArrayList<>();
                llevar_coche.add(buscar_coche);
                cliente = new Cliente(name,DNI,llevar_coche);
                clientes.add(cliente);
                try{
                    FileWriter fileWriter = new FileWriter(file_clientes);

                    fileWriter.write(String.valueOf(cliente));
                    fileWriter.close();
                }catch (IOException ex){
                    System.out.println("\nError, el archivo no existe." + ex);
                }
                break;
            }else{
                buscar = false;
            }
        }
        if(buscar){

            System.out.println("\nSe encontró el coche y se agregó a la lista de coches del cliente.\n");

        }else{
            System.out.println("\nNo se encontro el coche.");
        }
    }
    public static void registrarCoche(){
        String name,marca,matricula;
        int modelo;
        float precio;

        System.out.print("Nombre del coche:");
        name = consola.nextLine();
        System.out.print("Marca del coche:");
        marca = consola.nextLine();
        System.out.print("Matricula del coche:");
        matricula = consola.nextLine();
        System.out.print("Modelo del coche:");
        modelo = consola.nextInt();
        System.out.print("Precio del coche:");
        precio = consola.nextInt();

        coche = new Carro(name,marca,matricula,modelo,precio);
        carros.add(coche);
        try{
            FileWriter fileWriter = new FileWriter(file_coches);
            fileWriter.write(String.valueOf(carros));
        }catch (IOException ex){
            System.out.println("No se encontro el archivo " + ex);
        }
    }
    public static void verClientes(){
        try{
            Scanner consola = new Scanner(file_clientes);
            while (consola.hasNextLine()){
                System.out.println(consola.nextLine());
            }
        }catch (FileNotFoundException ex){
            System.out.println("\nNo se encontro el archivo " + ex);
        }
    }
    public static void verCoches(){
        try{
            Scanner consola = new Scanner(file_coches);
            while (consola.hasNextLine()){
                System.out.println(consola.nextLine());
            }
        }catch (FileNotFoundException ex){
            System.out.println("\nNo se encontro el archivo " + ex);
        }
    }
}
