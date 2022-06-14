package proyectos;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmpleado {
    static Secretario secretario = null;

    //Array para los DNI registrados en las areas
    static ArrayList<String> DNIS_registrados = new ArrayList<>();
    //Aarray para los DNI registrados en empleados
    static ArrayList<String> DNIS_registrados_empleados = new ArrayList<>();

    //Lista de empleados
    static ArrayList<Empleado> empleados = new ArrayList<>();

    //Lista de clientes
    static ArrayList<Cliente> clientes = new ArrayList<>();

    //Lista de vendedores
    static ArrayList<Vendedor> vendedores = new ArrayList<>();

    //Lista del jefe de zona
    static ArrayList<JefeDeZona> jefe = new ArrayList<>();

    //Lista de secretarios
    static ArrayList<Secretario> secretarios = new ArrayList<>();

    static Scanner consola = new Scanner(System.in);


    public static void registrarEmpleado(){
        consola.nextLine();
        int opcion = 0;
        String nombre,apellido,DNI = "",direccion;
        int añosAntiguedad,telefono;
        double salario;

        System.out.print("Nombre del empleado: ");
        nombre = consola.nextLine();

        System.out.print("Apellido del empleado:");
        apellido = consola.nextLine();

        while(true){
            System.out.print("DNI del empleado:");
            DNI = consola.nextLine();

            if(DNIS_registrados_empleados.contains(DNI)){
                System.out.println("Este DNI ya esta registrado, intente con otro.");
            }
            else{
                break;
            }
        }
        DNIS_registrados_empleados.add(DNI);


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
    public static void registrarSecretario(){
        consola.nextLine();
        boolean verf = false;
        int opcion;
        boolean verificar_DNI = true;
        boolean buscar_salario = false;
        String DNI;
        mostrarEmpleados();
        while(true){
            System.out.print("1-Ver secretarios registrados\n2-Incrementar salario\n3-Registrar secretario\n4-Salir\n:");
            opcion = consola.nextInt();

            if(opcion == 1){
                mostrarSecretarios();
            }
            else if(opcion == 2){
                consola.nextLine();
                System.out.print("Escriba el DNI del empleado que desea subir salario:");
                DNI = consola.nextLine();
                for(Secretario buscar: secretarios){
                    if(buscar.getDNI().equals(DNI)){
                        buscar.incrementarSalario();
                        buscar_salario = true;
                        break;
                    }
                    else{
                        buscar_salario = false;
                    }
                }

                if(buscar_salario == false){
                    System.out.println("No se encontró el empleado.");
                }
                else{
                    System.out.println("Se ha aumentado correctamente el salario.");
                }
            }
            else if(opcion == 3){
                consola.nextLine();
                System.out.print("Por favor escriba el DNI del empleado que desea transferir a secretario:");
                DNI = consola.nextLine();
                if(DNIS_registrados.contains(DNI)){
                    verificar_DNI = true;
                }
                else{
                    verificar_DNI = false;
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
                            break;

                        }
                        else{
                            verf = false;
                        }
                    }

                    if(verf == false ){
                        System.out.println("No se encontro el empleado con DNI " + DNI + " en la lista de empleados");
                    }
                }
            }

            else if(opcion == 4){
                break;
            }
            else{
                System.out.println("Esta opcion no existe.");
            }
        }
    }
    public static void registrarVendedor(){
        consola.nextLine();
        String respuesta;
        boolean verf = false;
        boolean verificar_DNI = true;
        boolean buscar_vendedor = false;
        int opcion;
        String DNI;
        mostrarEmpleados();

        while(true){
            System.out.print("1-Ver vendedores\n2-Incrementar salario vendedores\n3-Registrar vendedor\n4-Registrar o eliminar clientes\n5-Cambiar de coche\n6-Salir\n:");
            opcion = consola.nextInt();

            if(opcion == 1){
                //Mostramos vendedores
                mostrarVendedores();
            }

            else if(opcion == 2){
                consola.nextLine();
                //Incrementamos salario del vendedor
                System.out.print("Digite el DNI del vendedor que desea incrementar salario:");
                DNI = consola.nextLine();

                for(Vendedor buscar : vendedores){
                    if(buscar.getDNI().equals(DNI)){
                        buscar_vendedor = true;
                        do{
                            System.out.println("1-Incrementar salario por año\n2-Incrementar salario por ventas y comisiones\n:");
                            opcion = consola.nextInt();

                            if(opcion < 1 || opcion > 2){
                                System.out.println("Esta opcion no existe.");
                            }
                        }
                        while(opcion < 1 || opcion > 2);

                        switch (opcion){
                            case 1:
                                buscar.incrementarSalarioAnual();
                                break;

                            case 2:
                                buscar.incrementarSalarioComision();
                                break;
                        }

                        break;
                    }
                    else{
                        buscar_vendedor = false;
                    }
                }
                if(buscar_vendedor == false){
                    System.out.println("No se encontró el vendedor en la lista de vendedores.");
                }
                else{
                    System.out.println("Vendedor encontrado y el salario se ha aumentado correctamente.");
                }
            }

            else if(opcion == 3){
                consola.nextLine();
                System.out.print("Por favor escriba el DNI del empleado que desea transferir a vendedor:");
                DNI = consola.nextLine();

                if(DNIS_registrados.contains(DNI)){
                    verificar_DNI = true;
                }
                else{
                    verificar_DNI = false;
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
                            break;
                        }

                        else{
                            verf = false;
                        }
                    }

                    if(verf == false){
                        System.out.println("No se encontró el empleado con DNI " + DNI + " en la lista de empleados.\n");
                    }
                    else{
                        System.out.println("Se ha registrado el empleado con DNI " + DNI + " a vendedor correctamente.");

                    }
                }
            }

            else if(opcion == 4){
                do{
                    do{
                        System.out.print("1-Registrar cliente\n2-Eliminar cliente\n:");
                        opcion = consola.nextInt();

                        if(opcion < 1 || opcion > 2){
                            System.out.println("Esta opcion no existe");
                        }
                    }
                    while(opcion < 1 || opcion > 2);

                    switch(opcion){
                        case 1:
                            consola.nextLine();
                            boolean verf_client1 = false;
                            //Registrar cliente
                            System.out.print("Escriba el DNI del vendedor al que desea registrar el cliente:");
                            DNI = consola.nextLine();
                            for(Vendedor buscar : vendedores){
                                if(buscar.getDNI().equals(DNI)){
                                    verf_client1 = true;
                                    buscar.darAltaCliente(clientes);
                                    break;
                                }
                                else{
                                    verf_client1 = false;
                                }
                            }
                            if(verf_client1 == false){
                                System.out.println("No se encontro el vendedor");
                            }
                            else{
                                System.out.println("Cliente registrado correctamente.");
                            }
                            break;
                        case 2:
                            consola.nextLine();
                            //Eliminar cliente
                            boolean verf_client2 = false;
                            System.out.print("Escriba el DNI del vendedor al que desea eliminar el cliente:");
                            DNI = consola.nextLine();
                            for(Vendedor buscar : vendedores){
                                if(buscar.getDNI().equals(DNI)){
                                    verf_client2 = true;
                                    buscar.darBajaCliente(clientes);
                                    break;
                                }
                                else{
                                    verf_client2 = false;
                                }
                            }
                            if(verf_client2 == false){
                                System.out.println("No se encontro el vendedor");
                            }

                            break;

                    }
                    System.out.print("Desea agregar o eliminar otro cliente? (S/N):");
                    respuesta = consola.nextLine();
                }
                while(respuesta.equals("S") || respuesta.equals("s"));
            }
            else if(opcion == 5){
                consola.nextLine();
                //Cambiar de coche
                boolean verf_coche = false;
                System.out.print("Escriba el DNI del vendedor al que desea cambiar de coche:");
                DNI = consola.nextLine();
                for(Vendedor buscar : vendedores){
                    if(buscar.getDNI().equals(DNI)){
                        verf_coche = true;
                        buscar.cambiarCoche();
                        break;
                    }
                    else{
                        verf_coche = false;
                    }
                }

                if(verf_coche = false){
                    System.out.println("No se encontro el DNI del vendedor.");
                }
                else{
                    System.out.println("Coche cambiado correctamente.\n");
                }
            }
            else if(opcion == 6){
                break;
            }
            else{
                System.out.println("Esta opcion no existe");
            }
        }
    }
    public static void registrarJefeZona(){
        consola.nextLine();
        boolean verf = false;
        int opcion;
        boolean verificar_DNI = true;
        String DNI;
        mostrarEmpleados();
        while(true){
            System.out.print("1-Ver Jefe De Zona" +
                    "\n2-Incrementar salario del Jefe De Zona" +
                    "\n3-Registrar Jefe De Zona" +
                    "\n4-Agregar o eliminar vendedores al Jefe De Zona" +
                    "\n5-Cambiar coche del jefe de zona\n" +
                    "6-Cambiar secretario a jefe de zona\n" +
                    "7-Salir\n:");

            opcion = consola.nextInt();

            if(opcion < 1 || opcion > 7){
                System.out.println("Esta opcion no existe.");
            }
            else if(opcion == 7){
                break;
            }
            else{
                switch (opcion){
                    case 1:
                        //Mostramos jefe de zona
                        mostrarJefeZona();
                        break;

                    case 2:
                        //Incrementar salario del jefe de zona
                        consola.nextLine();
                        boolean verficiar_Salario = false;
                        if(jefe.size() == 0){
                            System.out.println("No hay jefes de zona registrados.");
                        }
                        else{
                            mostrarJefeZona();
                            System.out.print("DNI del jefe de zona que desea incrementar salario:");
                            DNI = consola.nextLine();
                            for(JefeDeZona buscar_jefe : jefe){
                                if(buscar_jefe.getDNI().equals(DNI)){
                                    verficiar_Salario = true;
                                    buscar_jefe.incrementarSalario();
                                }
                                else{
                                    verficiar_Salario = false;
                                }
                            }

                            if(verficiar_Salario == false){
                                System.out.println("No se incrementó el salario del jefe\n");
                            }
                            else{
                                System.out.println("Se incrementó el salario del jefe correctamente.\n");
                            }
                        }

                        break;

                    case 3:
                        //Registrar jefe de zona
                        consola.nextLine();
                        String despacho;
                        if(secretarios.size() == 0){
                            System.out.println("No se puede registrar un Jefe de zona sin haber almenos un secretario.");
                        }
                        else{
                            System.out.print("Dame el DNI del empleado que desea pasar a Jefe De Zona:");
                            DNI = consola.nextLine();
                            if(DNIS_registrados.contains(DNI)){
                                verificar_DNI = true;
                            }
                            else{
                                verificar_DNI = false;
                            }

                            if(verificar_DNI == true){
                                System.out.println("Este DNI ya está registrado en algunas de estas areas : Secretario,Vendedor,Jefe de zona.");
                            }

                            else{
                                for(Empleado buscar_empleado: empleados){
                                    if(buscar_empleado.getDNI().equals(DNI)){
                                        verf = true;
                                        DNIS_registrados.add(DNI);
                                        System.out.println("Se encontro el empleado.");
                                        System.out.print("Nombre del despacho para el Jefe:");
                                        despacho = consola.nextLine();
                                        System.out.print("Matricula del coche para el jefe:");
                                        String matricula = consola.nextLine();
                                        System.out.print("Marca del coche para el jefe:");
                                        String marca = consola.nextLine();
                                        System.out.print("Modelo del coche para el jefe:");
                                        String modelo = consola.nextLine();
                                        Coche coche = new Coche(matricula,marca,modelo);
                                        mostrarSecretarios();
                                        System.out.print("Esta es la lista de secretarios, elija el DNI de cual desea para el jefe de zona:");
                                        DNI = consola.nextLine();
                                        boolean verficiar_secretario = false;
                                        for(Secretario buscar_secre : secretarios){
                                            if(buscar_secre.getDNI().equals(DNI)){
                                                verficiar_secretario = true;
                                                secretario = new Secretario(buscar_secre.getNombre(), buscar_secre.getApellido(), buscar_secre.getDNI(), buscar_secre.getDireccion(), buscar_secre.getAñosAntiguedad(), buscar_secre.getTelefono(), buscar_secre.getSalario(), buscar_secre.getDespacho(), buscar_secre.getNumeroFax());
                                            }
                                            else{
                                                verficiar_secretario = false;
                                            }
                                        }
                                        if (verficiar_secretario == false) {
                                            System.out.println("No se encontro el secretario");
                                        }

                                        else{
                                            JefeDeZona jefezona = new JefeDeZona(buscar_empleado.getNombre(), buscar_empleado.getApellido(), buscar_empleado.getDNI(), buscar_empleado.direccion, buscar_empleado.añosAntiguedad, buscar_empleado.telefono, buscar_empleado.salario, despacho, secretario, coche, vendedores);
                                            jefe.add(jefezona);
                                            System.out.println("Jefe de zona ha sido añadido correctamente\n");
                                        }
                                        break;
                                    }

                                    else{
                                        verf = false;
                                    }
                                }
                                if(verf == false){
                                    System.out.println("No se encontro el empleado con DNI " + DNI);
                                }
                                else{
                                    ;
                                }
                            }
                        }

                        break;

                    case 4:
                        consola.nextLine();
                        boolean verificar_vendedor = false;
                        //Agregamos o eliminamos vendedores al jefe de zona

                        if(jefe.size() == 0){
                            System.out.println("No hay jefes de zona registrados.\n");
                        }
                        else{
                            mostrarJefeZona();
                            System.out.print("Dame el DNI del jefe de zona al que deseas agregar o eliminar vendedores:");
                            DNI = consola.nextLine();

                            for(JefeDeZona buscar : jefe){
                                if(buscar.getDNI().equals(DNI)){
                                    verificar_DNI = true;
                                    while(true){
                                        System.out.print("1-Agregar vendedor\n2-Eliminar vendedor\n3-Salir");
                                        opcion = consola.nextInt();
                                        if(opcion == 1){
                                            //Agregar vendedor
                                            if(vendedores.size() == 0){
                                                System.out.println("No hay vendedores registrados.\n");
                                            }
                                            else{
                                                buscar.darDeAltaVendedor(vendedores);
                                            }
                                        }
                                        else if(opcion == 2){
                                            //Eliminar vendedor
                                            if(vendedores.size() == 0){
                                                System.out.println("No hay vendedores registrados.\n");
                                            }
                                            else{
                                                buscar.darDeBajaVendedor(vendedores);
                                            }
                                        }
                                        else if(opcion == 3){
                                            break;
                                        }
                                        else{
                                            System.out.println("Esta opcion no existe.");
                                        }
                                    }
                                    break;
                                }
                                else{
                                    verificar_DNI = false;
                                }
                                break;
                            }
                            if(verificar_DNI == false){
                                System.out.println("No se encontró el DN1 " + DNI + " del jefe de zona.\n");
                            }
                        }

                        break;

                    case 5:
                        consola.nextLine();
                        break;

                    case 6:
                        consola.nextLine();
                        System.out.print("Dame el DNI del jefe de zona al que deseas cambiar secretario");
                        DNI = consola.nextLine();

                        for(JefeDeZona buscar : jefe){
                            if(buscar.getDNI().equals(DNI)){
                                verificar_DNI = true;
                                buscar.cambiarSecretario();
                                break;
                            }
                            else{
                                verificar_DNI = false;
                            }
                        }
                        if(verificar_DNI == false){
                            System.out.println("No se encontro el Jefe De Zona.");
                        }
                        else{
                            System.out.println("Secretario cambiado correctamente\n");
                        }
                        break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int opcion = 0;
        int contador_jefe = 0;
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
                    registrarJefeZona();
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

    public static void mostrarJefeZona(){
        System.out.println("Este es el jefe de zona\n");

        for(JefeDeZona ver_jefe : jefe){
            System.out.println(ver_jefe.toString());
            System.out.println("<<------------------------->>");
        }
    }
}
