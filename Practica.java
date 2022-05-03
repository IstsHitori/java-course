import javax.xml.namespace.QName;
import java.util.*;

//@Creado By Francisco

public class Practica {
    public static Scanner consola = new Scanner(System.in);
    public static ArrayList<String> juegos = new ArrayList<>();
    public static HashMap<String, ArrayList<String>> usuarios_con_videojuegos_alquilados = new HashMap<>();
    public static ArrayList <String> usuarios_membresias = new ArrayList();
    public static ArrayList <String> videojuegos_alquilados = new ArrayList();
    public static ArrayList <String> videojuegos_creados = new ArrayList();

    public static void main(String[] args) {
        int menu = 0;

        while(true){
            System.out.println("\nBIENVENIDO\nPor favor elija una opción\n");
            System.out.print(
                            "1. Ingreso de clientes para obtener membresía del club\n" +
                            "2. Crear o eliminar un video juego.\n" +
                            "3. Eliminar una membresía.\n" +
                            "4. Ingresar el alquiler de un juego a un miembro del club.\n" +
                            "5. Ingresar la devolución de un video juego alquilado.\n" +
                            "6. Mostrar los video juegos alquilados y que miembros los tienen.\n" +
                            "7. Mostrar los video juegos que se pueden alquilar.\n" +
                            "8. Mostrar los video juegos alquilados por un cliente especifico.\n" +
                            "9. Mostrar los clientes con membresia del club.\n" +
                            "10.Salir.\n:"
            );
            menu = consola.nextInt();
            if(menu == 10){
                break;
            }
            switch (menu){
                case 1:
                    registrar_usuario();
                    break;

                case 2:
                    crear_eliminar_videojuego();
                    break;

                case 3:
                    eliminar_membresia();
                    break;

                case 4:
                    registrar_videojuego_miembro();
                    break;

                case 5:
                    devolucion_videojuego();
                    break;

                case 6:
                    mostrar_videojuegos_alquilados();
                    break;

                case 7:
                    mostrar_videojuegos_disponibles();
                    break;

                case 8:
                    videojuegoalquilado_porcliente();
                    break;

                case 9:
                    verusuarios_conmembresia();
                    break;

                default:
                    System.out.println("Esta opción no existe.");

            }
        }
    }
    //Primera función
    public static void registrar_usuario(){
        String nombre;
        int edad;

        System.out.print("Cuál es su nombre: ");
        nombre = consola.next();

        System.out.print("Cuál es su dedad: ");
        edad = consola.nextInt();

        if(edad < 13 ){
            System.out.println("Usted no cumple con los requisitos.\n");
        }

        usuarios_membresias.add(nombre);
        System.out.println("");
    }

    //Segunda funcion
    public static void crear_eliminar_videojuego(){
        int opcion = 0;
        int posicion;
        String crear;
        String eliminar;
        while(true){
            boolean verf = false;
            System.out.print("1.Crear Videojuego\n2.Eliminar Videojuego\n:");
            opcion = consola.nextInt();

            if(opcion == 1){
                consola.nextLine();
                System.out.print("Dame el nombre del videojuego que deseas crear: ");
                crear = consola.nextLine();
                videojuegos_creados.add(crear);
                break;
            }
            else if(opcion == 2){
                consola.nextLine();
                System.out.print("Dame el nombre del videojuego que deseas eliminar: ");
                eliminar = consola.nextLine();

                posicion = videojuegos_creados.indexOf(eliminar);

                if(posicion >= 0){
                    for(int i = 0; i < videojuegos_creados.size(); i++){
                        videojuegos_creados.remove(posicion);
                        verf = true;
                    }
                }

                if(verf == true){
                    System.out.println("El videojuego se ha eliminado.");
                    System.out.print(videojuegos_creados);
                }

                else if (verf == false){
                    System.out.println("Este videojuego no ha sido encontrado.");
                }
                break;
            }

            else{
                System.out.println("Esta opción no existe.");
            }
        }
    }

    //Tercera funcion
    public static void eliminar_membresia(){
        String nombre;
        int posicion = 0;
        consola.nextLine();
        System.out.print("Digite el nombre del usuario al que desea eliminar la membresia: ");
        nombre = consola.nextLine();
        posicion = usuarios_membresias.indexOf(nombre);

        if(posicion >= 0){
            usuarios_membresias.remove(posicion);
            System.out.println("Usuario eliminado correctamente.");
        }

        else{
            System.out.println("Este usuario no existe.");
        }
    }

    //Cuarta funcion
    public static void registrar_videojuego_miembro(){
        videojuegos_alquilados.clear();
        int posicion,posicion2;
        String nombre,juego;
        int dias;
        System.out.print("Dame tu nombre: ");
        nombre = consola.next();

        posicion = usuarios_membresias.indexOf(nombre);


        if(posicion >= 0){
            consola.nextLine();
            System.out.print("Qué juego deseas registrar: ");
            juego = consola.nextLine();

            posicion2 = videojuegos_creados.indexOf(juego);
            if(posicion2 < 0){
                System.out.println("Este juego no está en la lista de juegos disponibles.");
            }

            else{
                System.out.print("Cuántos días te llevarás el juego: ");
                dias = consola.nextInt();

                videojuegos_alquilados.add(juego);
                usuarios_con_videojuegos_alquilados.put(nombre,videojuegos_alquilados);
            }
        }

        else{
            System.out.println("Este usuario no está registrado en la lista de miembros.");
        }
    }

    //Quinta funcion

    public static void devolucion_videojuego() {
        String videojuego;
        String nombre;
        int posicion;

        System.out.print("Dame tu nombre: ");
        nombre = consola.next();
        posicion = usuarios_membresias.indexOf(nombre);

        if(posicion >= 0){
            if(usuarios_con_videojuegos_alquilados.get(nombre) == null){
                System.out.println("No tienes juegos alquilados.");
            }
            else{
                System.out.println("Estos son tus videojuegos alquilado:");
                System.out.println(usuarios_con_videojuegos_alquilados.get(nombre));
                juegos = usuarios_con_videojuegos_alquilados.get(nombre);
                consola.nextLine();
                System.out.print("Cual desea regresar: ");
                videojuego = consola.nextLine();
                posicion = juegos.indexOf(videojuego);
            }

            if(posicion >= 0){
                usuarios_con_videojuegos_alquilados.remove(nombre,posicion);
                juegos.clear();
            }

            else{
                System.out.println("El juego que deseas eliminar no existe.");
            }
        }

        else{
            System.out.println("No estás en la lista de miembros del club.");
        }
    }

    //Sexta funcion

    public static void mostrar_videojuegos_alquilados(){
        System.out.print("Estos son los videojuegos alquilados: ");
    }

    //Septima funcion

    public static void mostrar_videojuegos_disponibles(){
        System.out.print("Estos son los videojuegos disponibles para alquilar: ");
    }

    //Octava funcion

    public static void videojuegoalquilado_porcliente(){
        String name;

        System.out.print("Dame tu nombre: ");
        name = consola.next();
    }

    //Novena funcion

    public static void verusuarios_conmembresia(){
        consola.nextLine();
        System.out.println("\nEstos son la lista de clientes que tienen membresia:");

        for(int i = 0; i < usuarios_membresias.size(); i++){
            System.out.print(usuarios_membresias.get(i));
        }
        System.out.println("");

        System.out.print(usuarios_con_videojuegos_alquilados);

        System.out.println("");

    }
}
