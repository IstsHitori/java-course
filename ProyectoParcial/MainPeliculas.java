package ProyectoParcial;

import java.util.ArrayList;
import javax.swing.*;

public class MainPeliculas {
    //Creamos un arraylist con la lista de clientes
    static ArrayList<Cliente> clientes = new ArrayList<>();

    //Creamos el array de lista de peliculas
    static ArrayList<TiendaPeliculas> peliculas = new ArrayList<>();

    //Polimorfismo para crear una pelicula
    //TiendaPeliculas peliculas = new PeliculaTerror("Santa ana","1000",20.0F);
    //Polimorfismo para arrendar una pelicula
    //TiendaPeliculas peliculas1= new PeliculaTerror("Santa ana","1000",20.0F,3);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Añadir Pelicula\n" +
                    "2-Eliminar Pelicula\n" +
                    "3-Ver lista de peliculas\n" +
                    "4-Eliminar cliente\n" +
                    "5-Añadir cliente\n" +
                    "6-Eliminar pelicula de un cliente\n" +
                    "7-Mostrar clientes\n" +
                    "8-Agregar pelicula a cliente\n" +
                    "9-Salir\n" +
                    "Elija una opción"));

            if (opcion < 1 || opcion > 9) {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe.");
            }
            if (opcion == 9) {
                JOptionPane.showMessageDialog(null, "BYE!");
                break;
            } else {
                switch (opcion) {
                    case 1:
                        //Llamar la funcion de añadir pelicula
                        opcion1();
                        break;
                    case 2:
                        //Llamar la funcion de Eliminar pelicula
                        if(peliculas.size() == 0){
                            JOptionPane.showMessageDialog(null,"LA LISTA DE PELICULAS ESTA VACIA");
                        }
                        else{
                            opcion2();
                        }
                        break;
                    case 3:
                        //Llamar la funcion de ver lista pelicula
                        mostrarPeliculas();
                        break;
                    case 4:
                        //Llamar la funcion de eliminar cliente
                        if(clientes.size() == 0){
                            JOptionPane.showMessageDialog(null,"LA LISTA DE CLIENTES ESTA VACIA");
                        }
                        else{
                            opcion4();
                        }
                        break;
                    case 5:
                        //Llamar la funcion de añadir cliente
                        if(peliculas.size() == 0){
                            JOptionPane.showMessageDialog(null,"No hay peliculas registradas, no puede añadir cliente.");
                        }
                        else{
                            opcion5();
                        }
                        break;
                    case 6:
                        //Llamar la funcion de eliminar pelicula de un cliente
                        if(clientes.size() == 0){
                            JOptionPane.showMessageDialog(null,"No hay clientes registrados.");
                        }
                        else{
                            opcion6();
                        }
                        break;
                    case 7:
                        //Llamar la funcion de mostrar clientes
                        if(clientes.size() == 0){
                            JOptionPane.showMessageDialog(null,"No hay clientes registrados.");
                        }
                        else{
                            mostrarClientes();
                        }
                        break;
                    case 8:
                        if(clientes.size() == 0 && peliculas.size() == 0){
                            JOptionPane.showMessageDialog(null,"LA LISTA CLIENTES O LA LISTA PELICULAS ESTÁN VACÍAS");
                        }
                        else if(clientes.size() >= 1 && peliculas.size() >= 1){
                            opcion8();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"LA LISTA CLIENTES O LA LISTA PELICULAS ESTÁN VACÍAS");

                        }
                        break;
                }
            }

        } while (true);
    }

    //Metodos de opciones
    public static void opcion1() {
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Pelicula Accion\n" +
                    "2-Pelicula Comedia\n" +
                    "3-Pelicula Drama\n" +
                    "4-Pelicula Terror\n" +
                    "5-Salir\n" +
                    "Elija una opcion:"));

            if (opcion < 1 || opcion > 5) {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe.");
            }
            if (opcion == 5) {
                break;
            }

            switch (opcion) {
                case 1:
                    //Agregamos pelicula de accion
                    agregarAccion();
                    break;
                case 2:
                    //Agregamos pelicula de Comedia
                    agregarComedia();
                    break;
                case 3:
                    //Agregamos pelicula de Drama
                    agregarDrama();
                    break;
                case 4:
                    //Agregamos pelicula de Terror
                    agregarTerror();
                    break;
            }
        } while (true);
    }

    public static void opcion2() {
        String id;
        String name_pelicula = null;
        boolean verf = false;
        id = JOptionPane.showInputDialog("Dame el ID de la pelicula que deseas eliminar:");
        for(TiendaPeliculas buscar_pelicula : peliculas){
            if(buscar_pelicula.getiD_pelicula().equals(id)){
                verf = true;
                name_pelicula = buscar_pelicula.getNombrePelicula();
                peliculas.remove(buscar_pelicula);
                break;
            }
            else{
                verf = false;
            }
        }
        if(verf == true){
            JOptionPane.showMessageDialog(null,"Pelicula: " + name_pelicula + " con ID: " + id + " eliminada correctamente.");
        }
        else{
            JOptionPane.showMessageDialog(null,"No se encontró la pelicula:");
        }
    }


    public static void opcion4() {
        boolean verf = false;
        String id = null;
        String name_cliente = null;

        id = JOptionPane.showInputDialog("Dame el ID del cliente que deseas eliminar:");

        for(Cliente buscar_cliente : clientes){
            if(buscar_cliente.getID().equals(id)){
                verf = true;
                name_cliente = buscar_cliente.getNombre();
                clientes.remove(buscar_cliente);
                break;
            }
            else{
                verf = false;
            }
        }
        if(verf == true){
            JOptionPane.showMessageDialog(null,"Cliente: " + name_cliente + " con ID: " + id + " eliminado correctamente.");
        }
        else{
            JOptionPane.showMessageDialog(null,"No se encontró el cliente.");
        }
    }

    public static void opcion5() {
        ArrayList<TiendaPeliculas> peliculas_clientes = new ArrayList<>();
        String name_cliente;
        String apellido_cliente;
        String id_cliente;
        String id_pelicula;
        String name_pelicula = null;
        boolean verf = false;

        name_cliente = JOptionPane.showInputDialog("Nombre del cliente:");
        apellido_cliente = JOptionPane.showInputDialog("Apellido del cliente:");
        id_cliente = JOptionPane.showInputDialog("ID del cliente:");

        mostrarPeliculas();

        id_pelicula = JOptionPane.showInputDialog("Elija el ID de la pelicula que desea llevar:");

        for(TiendaPeliculas buscar_pelicula : peliculas){
            if(buscar_pelicula.getiD_pelicula().equals(id_pelicula)){
                verf = true;
                name_pelicula = buscar_pelicula.getNombrePelicula();
                peliculas.remove(buscar_pelicula);
                peliculas_clientes.add(buscar_pelicula);
                break;
            }
            else{
                verf = false;
            }
        }


        if(verf == true){
            Cliente cliente = new Cliente(name_cliente,apellido_cliente,id_cliente,peliculas_clientes);
            clientes.add(cliente);
            JOptionPane.showMessageDialog(null,"Cliente añadido con pelicula :" + name_pelicula + " correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null,"No se econtró la pelicula.");
        }
    }

    public static void opcion6() {
        boolean verf = false;
        boolean verf_pelicula = false;
        String id_cliente = null;
        String nombre_pelicula = null;
        String nombre_cliente = null;
        id_cliente = JOptionPane.showInputDialog("ID del cliente al que desea eliminar peliculas");
        for(Cliente buscar_cliente : clientes){
            if(buscar_cliente.getID().equals(id_cliente)){
                verf = true;
                String id_pelicula = JOptionPane.showInputDialog("ID de la pelicula que desea eliminar:");
                for(TiendaPeliculas buscar_pelicula : buscar_cliente.getPeliculas()){
                    if(buscar_pelicula.getiD_pelicula().equals(id_pelicula)){
                        verf_pelicula = true;
                        nombre_pelicula = buscar_pelicula.getNombrePelicula();
                        nombre_cliente = buscar_cliente.getNombre();
                        buscar_cliente.getPeliculas().remove(buscar_pelicula);
                        break;
                    }
                    else{
                        verf_pelicula = false;
                    }
                }
                break;
            }
            else{
                verf = false;
            }
        }

        if(verf_pelicula == true && verf == true){
            JOptionPane.showMessageDialog(null,"Se ha eliminado la pelicula " + nombre_pelicula + " Del cliente " + nombre_cliente + " Con ID: " + id_cliente);
        }
        else if(verf_pelicula == false && verf == false){
            JOptionPane.showMessageDialog(null,"No se encontró el cliente ni la pelicula.");
        }
        else if(verf == true && verf_pelicula == false){
            JOptionPane.showMessageDialog(null,"Se encontro el cliente pero no la pelicula");
        }
        else if(verf == false){
            JOptionPane.showMessageDialog(null,"No se encontró el cliente");
        }
    }

    public static void opcion8(){
        boolean buscarCliente = false;
        boolean buscarPeli = false;
        String name_pelicula = null;
        String id_Cliente = JOptionPane.showInputDialog("Dame el ID del cliente al que deseas añadir pelicula:");

        for(Cliente buscar_cliente : clientes){
            if (buscar_cliente.getID().equals(id_Cliente)){
                buscarCliente = true;
                mostrarPeliculas();
                String id_pelicula = JOptionPane.showInputDialog("Dame el ID de la pelicula que deseas registrar: ");
                for(TiendaPeliculas buscar_pelicula : peliculas){
                    if(buscar_pelicula.getiD_pelicula().equals(id_pelicula)){
                        buscarPeli = true;
                        name_pelicula = buscar_pelicula.getNombrePelicula();
                        buscar_cliente.getPeliculas().add(buscar_pelicula);
                        peliculas.remove(buscar_pelicula);
                        break;
                    }

                    else{
                        buscarPeli = false;
                    }
                }
                break;
            }
            else{
                buscarCliente = false;
            }
        }

        if(buscarCliente == true && buscarPeli == true){
            JOptionPane.showMessageDialog(null,"Pelicula: " + name_pelicula + " añadida correctamente.");
        }
        else{
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRÓ EL CLIENTE O LA PELICULA");
        }
    }

    //Metodos para mostrar las peliculas y clientes
    public static void mostrarClientes() {
        float precio = 0;
        if (clientes.size() == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados ");
        } else {

            for (Cliente mostrar_clientes : clientes) {
                for(TiendaPeliculas buscar_precio : mostrar_clientes.getPeliculas()){
                    precio += buscar_precio.precioTotal();
                }
                System.out.println(mostrar_clientes);
                System.out.println("Total a pagar: " + precio );
                System.out.println("<----------------------------->");
            }
        }
    }

    public static void mostrarPeliculas() {
        if (peliculas.size() == 0) {
            JOptionPane.showMessageDialog(null, "No hay peliculas disponibles.");
        } else {
            for (TiendaPeliculas mostrar_peliculas : peliculas) {
                System.out.println(mostrar_peliculas);
                System.out.println("<----------------------------->");
            }
        }
    }


    //Metodos para agregar peliculas
    public static void agregarAccion(){
        String nombre_pelicula = JOptionPane.showInputDialog("Nombre de la pelicula:");
        String id_pelicula = JOptionPane.showInputDialog("Id de la pelicula:");

        TiendaPeliculas peliculaAccion = new PeliculaAccion(nombre_pelicula,id_pelicula);

        peliculas.add(peliculaAccion);

    }

    public static void agregarComedia(){
        String nombre_pelicula = JOptionPane.showInputDialog("Nombre de la pelicula:");
        String id_pelicula = JOptionPane.showInputDialog("Id de la pelicula:");

        TiendaPeliculas peliculaComedia = new PeliculaComedia(nombre_pelicula,id_pelicula);

        peliculas.add(peliculaComedia);

    }

    public static void agregarDrama(){
        String nombre_pelicula = JOptionPane.showInputDialog("Nombre de la pelicula:");
        String id_pelicula = JOptionPane.showInputDialog("Id de la pelicula:");

        TiendaPeliculas peliculaDrama = new PeliculaDrama(nombre_pelicula,id_pelicula);

        peliculas.add(peliculaDrama);
    }

    public static void agregarTerror(){
        String nombre_pelicula = JOptionPane.showInputDialog("Nombre de la pelicula:");
        String id_pelicula = JOptionPane.showInputDialog("Id de la pelicula:");

        TiendaPeliculas peliculaTerror = new PeliculaTerror(nombre_pelicula,id_pelicula);

        peliculas.add(peliculaTerror);
    }
}
