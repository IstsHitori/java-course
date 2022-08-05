package com.software.clientes.DAO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOClienteImpl implements DAOCliente{
    private final String NOMBRE_ARCHIVO = "clientes.txt";

    public DAOClienteImpl(){

    }

    @Override
    public List<Cliente> listar() {
        File archivo = new File(NOMBRE_ARCHIVO);

        List<Cliente> clientes = new ArrayList<>();

        try{
            BufferedReader lectura = new BufferedReader(new FileReader(archivo));
            String contenido = null;
            contenido = lectura.readLine();

            while(contenido != null){
                Cliente cliente = new Cliente(contenido);

                clientes.add(cliente);
                contenido = lectura.readLine();
            }
            lectura.close();
        }catch (Exception exception) {
            exception.printStackTrace(System.out);
        }

        return clientes;
    }

    @Override
    public void eliminar() {

        File archivo = new File(NOMBRE_ARCHIVO);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("\nSe ha eliminado el archivo correctamente.");
        }else{
            System.out.println("\nEl archivo ya ha sido eliminado anteriormente.");
        }
    }

    @Override
    public String buscar(String buscar) {
        File archivo = new File(NOMBRE_ARCHIVO);
        String resultado = null;

        if(archivo.exists()){
            try{
                String linea = null;
                BufferedReader lectura = new BufferedReader(new FileReader(archivo));
                linea = lectura.readLine();

                while(linea != null){
                    if(buscar != null && buscar.equalsIgnoreCase(linea)){
                        resultado = "Cliente: " + linea + " encontrada.";
                        break;
                    }else{
                        resultado = "Cliente: " + buscar + " no se ha encontrado.";
                    }
                    linea = lectura.readLine();
                }
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }else{
            System.out.println("\nNO se ha encontrado el archivo");
        }


        return resultado;

    }

    @Override
    public void escribir(Cliente cliente, boolean anexar) {
        File archivo = new File(NOMBRE_ARCHIVO);

        try{
            PrintWriter escribir = new PrintWriter(new FileWriter(archivo,anexar));
            escribir.println(cliente.toString());
            escribir.close();
            System.out.println("\nCliente " + cliente.toString() + " agregado correctamente");
        }catch (Exception exception){
            exception.printStackTrace(System.out);
        }
    }

    @Override
    public void crear() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if(archivo.exists()){
            System.out.println("\nEl archivo ya existe.");
        }else{
            try{
                PrintWriter crear = new PrintWriter(new FileWriter(archivo));
                crear.close();
                System.out.println("Archivo creado correctamente.");
            }catch (Exception exception){
                exception.printStackTrace(System.out);
            }
        }
    }

    @Override
    public String borrarCliente(String cliente, List<Cliente> clientes) {
        File archivo = new File(NOMBRE_ARCHIVO);
        String resultado = null;
        for(Cliente buscar : clientes){
            if(buscar.getNombre().equalsIgnoreCase(cliente)){
                clientes.remove(buscar);
                archivo.delete();

                try{
                    /**
                     * Si hay error en borrar cliente posible solucion:
                     * archivo = new File()
                     */
                    archivo.createNewFile();
                    PrintWriter escribir = new PrintWriter(new FileWriter(archivo,true));

                    for(Cliente ingresar : clientes){
                        escribir.println(ingresar.toString());
                    }
                    escribir.close();

                }catch (Exception exception){
                    exception.printStackTrace(System.out);
                }
                resultado = "Cliente con nombre: " + buscar.getNombre() + " eliminado correctamente";
                break;
            }else{
                resultado = "No se ha encontrado el cliente: " + cliente;
            }
        }

        return resultado;
    }
}
