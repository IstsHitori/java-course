package proyectos;

import java.util.ArrayList;

public class Vendedor extends Empleado{
    //Creamos un valor independiente encapsulado private que almacena los datos del coche.
    private Coche cocheEmpresa;
    private String areaDeventa;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private double incrementoSalario = 0.10;

    public Vendedor(){

    }

    public Vendedor(String nombre, String apellido, String DNI, String direccion, int añosAntiguedad, int telefono, double salario, Coche cocheEmpresa,ArrayList<Cliente> clientes,String areaDeventa){
        super(nombre, apellido, DNI, direccion, añosAntiguedad, telefono, salario);
        this.cocheEmpresa = cocheEmpresa;
        this.areaDeventa = areaDeventa;
        this.clientes = clientes;
    }

    public Coche getCocheEmpresa() {
        return cocheEmpresa;
    }

    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public String getAreaDeventa() {
        return areaDeventa;
    }

    public void setAreaDeventa(String areaDeventa) {
        this.areaDeventa = areaDeventa;
    }

    public double getIncrementoSalario() {
        return incrementoSalario;
    }

    public void setIncrementoSalario(double incrementoSalario) {
        this.incrementoSalario = incrementoSalario;
    }


    //Regitrar un cliente a la lista de clientes
    public void darAltaCliente(ArrayList<Cliente> clientes){
        consola.nextLine();
        boolean verificar = true;
        System.out.println("\n<<Registrar cliente>>\n");

        String nombre_cliente,apellido_cliente,ID;
        long telefono_cliente;

        System.out.print("ID del cliente:");
        ID = consola.nextLine();

        System.out.print("Nombre del cliente:");
        nombre_cliente = consola.nextLine();

        System.out.print("Apellido del cliente:");
        apellido_cliente =  consola.nextLine();

        System.out.print("Numero telefonico del cliente:");
        telefono_cliente = consola.nextLong();

        Cliente cliente1 = new Cliente(nombre_cliente,apellido_cliente,telefono_cliente,ID);

        clientes.add(cliente1);

    }

    //Eliminar un cliente de la lista de clientes
    public void darBajaCliente(ArrayList<Cliente> clientes){
        consola.nextLine();
        String ID;
        boolean verificar = false;
        System.out.println("\n<<Eliminar cliente>>\n");
        if(clientes.size() == 0){
            System.out.println("LA LISTA DE CLIENTES ESTA VACIA");
        }
        else{
            //Imprimimos la lista de clientes del arraylist "Clientes"
            System.out.println("\nLista de clientes:\n");
            for(Cliente ncliente : clientes){
                System.out.println(ncliente.toString());
                System.out.println("<<----------------->>");
            }
            System.out.print("Dame el DNI del cliente que desea eliminar:");
            ID = consola.nextLine();

            for(Cliente ncliente : clientes){
                //Si esta condicional se cumple eliminaremos el cliente del arraylist "clientes"
                if(ncliente.getID().equals(ID)){
                    verificar = true;
                    System.out.println("Se ha eliminado el cliente " + ncliente.getNombre_cliente() + " correctamente.");
                    clientes.remove(ncliente);
                    break;
                }
                else{
                    verificar = false;
                }
            }
            if(verificar == true){
                System.out.println("Proceso de eliminacion de cliente finalizado correctamente.");
            }
            else{
                System.out.println("No se encontro este cliente en la lista de clientes, proceso errado.");
            }
        }
    }

    public void incrementarSalarioComision(){
        double valor_venta = 0;
        double total_incremento = 0;
        double comision = 0;

        //Incrementar el salario mediante las ventas
        System.out.print("Cuantas ventas hizo:");
        int n_ventas = consola.nextInt();

        for(int i = 0; i < n_ventas; i++){
            System.out.print("Cuanto fue el valor del " + (i+1) + " objeto vendido:");
            valor_venta = consola.nextDouble();
            System.out.print("De cuanto es el porcentaje de la comision del " + (i+1) + " valor del objeto:");
            comision = consola.nextDouble();
            total_incremento = total_incremento + (valor_venta * comision);
        }

        salario += total_incremento;
    }

    public void incrementarSalarioAnual(){
        int años;
        System.out.println("Cuantos años nuevos a vuelto a trabajar: ");
        años = consola.nextInt();

        salario = salario + ( salario * (años * incrementoSalario));
    }

    public void cambiarCoche(){
        String matricula,marca,modelo;
        System.out.print("Matricula del nuevo coche: ");
        matricula = consola.nextLine();

        System.out.print("Marca del nuevo coche:");
        marca = consola.nextLine();

        System.out.print("Modelo del nuevo coche:");
        modelo = consola.nextLine();

        cocheEmpresa.setMatricula(matricula);
        cocheEmpresa.setMarca(marca);
        cocheEmpresa.setModelo(modelo);
    }
    @Override
    public String toString(){
        return "Datos del vendedor:\n" + super.toString() + "\nDatos del coche del vendedor:" + cocheEmpresa.toString() + "\nDatos de los clientes del vendedor:" + clientes.toString();
    }
}
