package proyectos;

import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private Coche coche_empresa;
    private double incremento = 0.20;

    public JefeDeZona(){

    }
    public JefeDeZona(String nombre,String apellido,String DNI,String direccion, int añosAntiguedad, int telefono, double salario, String despacho, Secretario secretario,Coche coche_empresa){
        super(nombre, apellido, DNI, direccion, añosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche_empresa = coche_empresa;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Coche getCoche_empresa() {
        return coche_empresa;
    }

    public void setCoche_empresa(Coche coche_empresa) {
        this.coche_empresa = coche_empresa;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public void cambiarSecretario(){
        String despacho,nombre,apellido,DNI,direccion;
        int añosAntiguedad,telefono;
        double salario;
        int nFax;

        System.out.print("Nombre del nuevo secretario:");
        nombre = consola.nextLine();

        System.out.print("Apellido del nuevo secretario:");
        apellido = consola.nextLine();

        System.out.print("DNI del nuevo secretario:");
        DNI = consola.nextLine();

        System.out.print("Direccion del nuevo secretario:");
        direccion = consola.nextLine();

        System.out.print("Años de antiguedad del nuevo secretario:");
        añosAntiguedad = consola.nextInt();

        System.out.print("Telefono del nuevo secretario:");
        telefono = consola.nextInt();

        System.out.print("Salario del nuevo secretario:");
        salario = consola.nextDouble();

        System.out.print("Despacho del nuevo secretario");
        despacho = consola.nextLine();

        System.out.print("Numero de fax del nuevo secretario:");
        nFax = consola.nextInt();

        secretario.setNombre(nombre);
        secretario.setApellido(apellido);
        secretario.setDNI(DNI);
        secretario.setDireccion(direccion);
        secretario.setAñosAntiguedad(añosAntiguedad);
        secretario.setTelefono(telefono);
        secretario.setSalario(salario);
        secretario.setDespacho(despacho);
        secretario.setNumeroFax(nFax);

    }

    public void cambiarCoche(){
        String matricula,marca,modelo;
        System.out.print("Matricula del nuevo coche: ");
        matricula = consola.nextLine();

        System.out.print("Marca del nuevo coche: ");
        marca = consola.nextLine();

        System.out.print("Modelo del nuevo coche: ");
        modelo = consola.nextLine();

        coche_empresa.setMatricula(matricula);
        coche_empresa.setMarca(marca);
        coche_empresa.setModelo(modelo);
    }


    public void darDeAltaVendedor(ArrayList<Vendedor> vendedores,ArrayList<Cliente> clientes){
        String nombre,apellido,DNI,direccion,areaDeventa;
        String matricula,marca,modelo;
        int añosAntiguedad,telefono;
        double salario;
        Coche coche_empresa2;
        Vendedor vendedor;

        System.out.print("Nombre del vendedor: ");
        nombre = consola.nextLine();

        System.out.print("Apellido del vendedor: ");
        apellido = consola.nextLine();

        System.out.print("DNI del vendedor: ");
        DNI = consola.nextLine();

        System.out.print("Direccion del vendedor: ");
        direccion = consola.nextLine();

        System.out.print("Años de antiguedad del vendedor:");
        añosAntiguedad = consola.nextInt();

        System.out.print("Telefono del vendedor: ");
        telefono = consola.nextInt();

        System.out.print("Salario del vendedor: ");
        salario = consola.nextDouble();

        System.out.print("Matricula del coche del vendedor: ");
        matricula = consola.nextLine();

        System.out.print("Marca del coche del vendedor: ");
        marca = consola.nextLine();

        System.out.print("Modelo del coche del vendedor: ");
        modelo = consola.nextLine();

        System.out.print("Area de venta del vendedor: ");
        areaDeventa = consola.nextLine();

        coche_empresa2 = new Coche(matricula,marca,modelo);

        vendedor = new Vendedor(nombre,apellido,DNI,direccion,añosAntiguedad,telefono,salario,coche_empresa2,clientes,areaDeventa);

        vendedores.add(vendedor);

    }

    public void darDeBajaVendedor(ArrayList<Vendedor> vendedores){
        String DNI;
        boolean verificar = true;

        //IMprimir la lista de vendedores del arraylist "vendedores"
        System.out.println("<<Eliminar Vendedor>>\n");

        if(vendedores.size() == 0){
            System.out.println("----NO HAY VENDEDORES REGISTRADOS----");
        }
        else{
            System.out.println("Lista de vendedores:\n");
            for(Vendedor vende : vendedores){
                System.out.println(vende.toString());
            }
            System.out.print("Dame el DNI del vendedor que deseas eliminar:");
            DNI = consola.nextLine();
            for(Vendedor vende : vendedores){
                if(vende.getDNI() == DNI){
                    verificar = true;
                    vendedores.remove(vende);
                    break;
                }
                else{
                    verificar = false;
                }
            }

            if(verificar == true){
                System.out.println("PROCESO DE ELIMINACION DE VENDEDOR CONCLUIDO\n");
            }
            else{
                System.out.println("PROCESO DE ELIMINACION DE VENDEDOR FALLIDO.");
            }
        }
    }

    @Override
    public String toString(){
        return  "Datos del Jefe De Zona:\n" + super.toString() + "\nDatos del coche: " + coche_empresa.toString();
    }
}

