package proyectos;

public class Secretario extends Empleado{
    private String despacho;
    private int numeroFax;
    private double incremento = 0.05;

    public Secretario(String nombre, String apellido, String DNI, String dirececion, int añosAntiguedad, int telefono, double salario, String despacho, int numeroFax){
        super(nombre,apellido,DNI,dirececion,añosAntiguedad,telefono,salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(int numeroFax) {
        this.numeroFax = numeroFax;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public void incrementarSalario(){
        int años;
        System.out.print("Cuantos años nuevos a vuelto a trabajar: ");
        años = consola.nextInt();

        salario = salario + ( salario * (años * incremento));
    }

    @Override
    public String toString(){
        return "Datos del secretario:\n"+ super.toString() +"\nDespacho: " +despacho + "\nNumero de fax:" + numeroFax;
    }
}
