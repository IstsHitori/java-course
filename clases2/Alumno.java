package clases2;
public class Alumno extends Universidad {

    Asignatura materias[];

    public Alumno(String nombre, String apellido, int edad, String cedula,Asignatura materias[]){
        super(nombre,apellido,edad,cedula);
        this.materias = materias;
    }

    public Asignatura[] getMaterias() {
        return materias;
    }

    public void setMaterias(Asignatura[] materias) {
        this.materias = materias;
    }

    public void verDato(){
        System.out.println("Materias y profesores: ");

        for(int i = 0; i < materias.length; i++){
            System.out.print(materias[i].getNameAsignatura()+"->" + materias[i].getNameMaestro() + "\n");
        }
    }
}
