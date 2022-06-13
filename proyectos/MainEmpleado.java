package proyectos;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmpleado {
    //Array para los DNI registrados
    static ArrayList<String> DNIS_registrados = new ArrayList<>();
    //Lista de empleados
    static ArrayList<Empleado> empleados = new ArrayList<>();

    //Lista de clientes
    static ArrayList<Cliente> clientes = new ArrayList<>();
    //Lista de clientes

    static ArrayList<Vendedor> vendedores = new ArrayList<>();

    //Lista de secretarios
    static ArrayList<Secretario> secretarios = new ArrayList<>();

    static Scanner consola = new Scanner(System.in);

    public static void registrarSecretario(){
        consola.nextLine();
        boolean verf = true;
        boolean verificar_DNI = true;
        String DNI;
        mostrarEmpleados();
        System.out.print("Por favor escriba el DNI del empleado que desea transferir a secretario:");
        DNI = consola.nextLine();
        for(String i : DNIS_registrados){
            if(i.equals(DNI)){
                verificar_DNI = true;
                break;
            }
            else{
                verificar_DNI = false;
            }
        }

        if(verificar_DNI == true){
            System.out.println("Este DNI ya está registrado en algunas de estas areas : Secretario,Vendedor,Jefe de zona.");
        }
        else{
            for(Empleado buscar : empleados){
                if(buscar.getDNI().equals(DNI)){
                    verf = true;
                    DNIS_registrados.add(DNI);
                    System.out.println("Empleado encontrado.");
                    System.out.print("\nLugar de despacho del nuevo secretario:");
                    String despacho = consola.nextLine();
                    System.out.print("\nNumero de fax del nuevo secretario:");
                    int nFax = consola.nextInt();
                    Secretario secretario1 = new Secretario(buscar.getNombre(), buscar.getApellido(), buscar.getDNI(), buscar.getDireccion(),buscar.getAñosAntiguedad(),buscar.getTelefono(),buscar.getSalario(),despacho,nFax);
                    secretarios.add(secretario1);

                    System.out.print("Desea ver los secretarios registrados? \n1-Si\n2-No\n:");
                    int opcion = consola.nextInt();

                    if(opcion == 1){
                        mostrarSecretarios();
                    }
                    else{
                        break;
                    }
                }
                else{
                    verf = false;
                }
            }
        }


        if(verf == true){
            System.out.println("Se ha registrado el empleado con DNI " + DNI + " a secretario correctamente.");
        }

    }
    public static void registrarEmpleado(){
        consola.nextLine();
        int opcion = 0;
        String nombre,apellido,DNI,direccion;
        int añosAntiguedad,telefono;
        double salario;

        System.out.print("Nombre del empleado: ");
        nombre = consola.nextLine();

        System.out.print("Apellido del empleado:");
        apellido = consola.nextLine();

        System.out.print("DNI del empleado:");
        DNI = consola.nextLine();

        System.out.print("Direccion del empleado:");
        direccion = consola.nextLine();

        System.out.print("Años de antiguedad del empleado: ");
        añosAntiguedad = consola.nextInt();

        System.out.print("Telefono del empleado: ");
        telefono = consola.nextInt();

        System.out.print("Salario del empleado: ");
        salario = consola.nextDouble();

        Empleado empleado = new Empleado(nombre,apellido,DNI,direccion,añosAntiguedad,telefono,salario);
        empleados.add(empleado);

        while(true){
            System.out.print("Desea ver la lista de empleados? 1-SI 2-No\n:");
            opcion = consola.nextInt();

            if(opcion == 1){
                mostrarEmpleados();
            }
            else if(opcion == 2){
                break;
            }
            else{
                System.out.println("Esta opcion no existe.");
            }
        }
    }
    public static void registrarVendedor(){
        consola.nextLine();
        boolean verf = true;
        boolean verificar_DNI = true;
        String DNI;
        mostrarEmpleados();

        System.out.print("Por favor escriba el DNI del empleado que desea transferir a vendedor:");
        DNI = consola.nextLine();

        for(String i : DNIS_registrados){
            if(i.equals(DNI)){
                verificar_DNI = true;
                break;
            }
            else{
                verificar_DNI = false;
            }
        }

        if(verificar_DNI == true){
            System.out.println("Este DNI ya está registrado en algunas de estas areas : Secretario,Vendedor,Jefe de zona.");
        }

        else{
            for(Empleado buscar : empleados){
                if(buscar.getDNI().equals(DNI)){
                    DNIS_registrados.add(DNI);
                    verf = true;
                    System.out.println("Empleado encontrado.\n");
                    System.out.print("Matricula del coche: ");
                    String matricula = consola.nextLine();
                    System.out.print("Marca del coche: ");
                    String marca = consola.nextLine();
                    System.out.print("Modelo del coche:");
                    String modelo = consola.nextLine();

                    System.out.print("Area de venta:");
                    String areaDeventa = consola.nextLine();

                    Coche coche = new Coche(matricula,marca,modelo);
                    Vendedor vendedor1 = new Vendedor(buscar.getNombre(), buscar.getApellido(), buscar.getDNI(), buscar.getDireccion(),buscar.getAñosAntiguedad(),buscar.getTelefono(),buscar.getSalario(),coche,clientes,areaDeventa);
                    vendedores.add(vendedor1);
                    String respuesta;
                    int opcion;
                    do{
                        do{
                            System.out.print("1-Registrar cliente\n2-Eliminar cliente\n:");
                            opcion = consola.nextInt();
                        }
                        while(opcion < 1 || opcion > 2);

                        switch(opcion){
                            case 1:
                                //Registrar cliente
                                break;
                            case 2:
                                //Eliminar cliente
                                break;
                        }

                        System.out.print("Desea agregar o eliminar otro cliente? (S/N):");
                        respuesta = consola.nextLine();
                    }
                    while(respuesta.equals("S") || respuesta.equals("s"));

                    System.out.print("Desea ver los vendedores registrados?\n1-Si\n2-No\n:");
                    opcion = consola.nextInt();

                    if(opcion == 1){
                        mostrarVendedores();
                    }
                    else{
                        break;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int opcion = 0;
        String respuesta;

        do{
            do{
                System.out.print(
                        "1-Registrar Empleado." +
                        "\n2-Asignar empleado a secretario." +
                        "\n3-Asignar empleado a vendedor" +
                        "\n4-Asignar empleado a Jefe De Zona"+
                        "\n5-Salir\n:");
                opcion = consola.nextInt();

                if(opcion < 1 || opcion > 5){
                    System.out.println("Esta opcion no existe.\n");
                }
            }
            while(opcion < 1 || opcion > 5);

            switch(opcion){
                case 1:
                    //Registrar empleado
                    registrarEmpleado();
                    break;
                case 2:
                    //Asignar empleado a secretario
                    registrarSecretario();
                    break;

                case 3:
                    //Asignar empleado a vendedor
                    registrarVendedor();
                    break;
                case 4:
                    //Asignar empleado a Jefe De Zona
                    break;
            }


        }
        while(opcion!=5);
    }

    //metodo para mostrar los empleados

    public static void mostrarEmpleados(){
        System.out.println(">>Estos son los empleados<<:\n");
        for(Empleado empleado1 : empleados ){
            System.out.println(empleado1.toString());
            System.out.println("<<----------------->>");
        }
    }
    public static void mostrarSecretarios(){
        System.out.println("\n>>Estos son los secretarios<<\n");
        for(Secretario secre : secretarios){
            System.out.println(secre.toString());
            System.out.println("<<----------------->>");
        }
    }
    public static void mostrarVendedores(){
        System.out.println("\n>>Estos son los vendedores<<\n");
        for(Vendedor vende : vendedores){
            System.out.println(vende.toString());
            System.out.println("<<----------------->>");
        }
    }
}
