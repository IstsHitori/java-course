import java.util.Scanner;
public class Practica {
    public static Scanner consola = new Scanner(System.in);
    public static String usuarios_registrados[];
    public static String videojuegos_alquilados[];
    public static String videojuegos_creados[];

    public static void main(String[] args) {
        int menu = 0;
        boolean verf = true;
        while(verf = true){
            System.out.println("BIENVENIDO, por favor eliga una opción\n");
            System.out.print(
                            "1. Ingreso de clientes para obtener membresía del club\n" +
                            "2. Crear y eliminar un video juego.\n" +
                            "3. Eliminar una membresía.\n" +
                            "4. Ingresar el alquiler de un juego a un miembro del club.\n" +
                            "5. Ingresar la devolución de un video juego alquilado.\n" +
                            "6. Mostrar los video juegos alquilados y que miembros los tienen.\n" +
                            "7. Mostrar los video juegos que se pueden alquilar.\n" +
                            "8. Mostrar los video juegos alquilados por un cliente especifico.\n" +
                            "9.Salir.\n:"
            );
            menu = consola.nextInt();
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
                    verf = false;
                    break;

                default:
                    System.out.println("Esta opción no existe.");
            }
        }
    }
    //Primera función
    public static void registrar_usuario(){
        int i = 0;
        String nombre;
        int edad;

        System.out.print("Cuál es su nombre: ");
        nombre = consola.next();

        System.out.print("Cuál es su dedad: ");
        edad = consola.nextInt();

        if(edad < 13 ){
            System.out.println("Usted no cumple con los requisitos.\n");
        }
        usuarios_registrados[i] = nombre;
        i++;

        for(int a = 0; a < usuarios_registrados.length; a++){
            System.out.print(usuarios_registrados[a]);
        }

        System.out.println("");
    }

    //Segunda funcion
    public static void crear_eliminar_videojuego(){
        int i = 0;
        boolean verificar = false;
        String crear_videojuego, eliminar_videojuego;

        System.out.print("Qué juego desea crear: ");
        crear_videojuego = consola.next();

        videojuegos_creados[i] = crear_videojuego;

        System.out.println("Qué juego desea eliminar: ");
        eliminar_videojuego = consola.next();

        for(int j = 0; j < videojuegos_creados.length; j++){
            if(eliminar_videojuego == videojuegos_creados[j]){
                videojuegos_creados[i] = null;
                System.out.println("Se encontró el videojuego y ha sido eliminado.");
                verificar = true;
            }

            else if(j == videojuegos_creados.length && verificar == false){
                System.out.println("No se encontró el videojuego.");
            }
        }

        i++;
    }

    //Tercera funcion
    public static void eliminar_membresia(){
        String nombre;
        System.out.print("Digite el nombre del usuario: ");
        nombre = consola.next();
    }

    //Cuarta funcion
    public static void registrar_videojuego_miembro(){
        String nombre,juego;
        int dias;

        System.out.print("Dame tu nombre: ");
        nombre = consola.next();
        System.out.print("Qué juego deseas registrar: ");
        juego = consola.next();
        System.out.print("Cuántos días te llevarás el juego: ");
        dias = consola.nextInt();

    }

    //Quinta funcion

    public static void devolucion_videojuego(){
        String videojuego;
        String nombre;

        System.out.print("Dame tu nombre: ");
        nombre = consola.next();

        System.out.print("Qué videojuego deseas regresar: ");
        videojuego = consola.next();
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
}
