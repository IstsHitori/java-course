package proyectos;
import java.util.Scanner;
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected String direccion;
    protected int añosAntiguedad;
    protected int telefono;
    protected double salario;

    public static Scanner consola = new Scanner(System.in);

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String DNI, String direccion, int añosAntiguedad, int telefono, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.añosAntiguedad = añosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void cambiarSupervisor(){

    }

    public void incrementarSalario(double incremento){
        int años = 0;
        double total_incremento = 0;

        //Incrementar el salario mediante años trabajados
        System.out.print("Cuantos años ha trabajado: ");
        años = consola.nextInt();
        total_incremento = años * incremento;
        salario += (salario * total_incremento);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI " + DNI + "\nDireccion: " +direccion+ "\nAños de antiguedad: " + añosAntiguedad + "\nTelefono: " + telefono + "\nSalario " + salario;
    }
}
