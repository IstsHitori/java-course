package clases2;

public class Asignatura extends Universidad{


    public Asignatura(){

    }

    public Asignatura(String nameAsignatura,String nameMaestro){
        super();
        this.nameAsignatura = nameAsignatura;
        this.nameMaestro = nameMaestro;
    }

    public String getNameAsignatura() {
        return nameAsignatura;
    }

    public void setNameAsignatura(String nameAsignatura) {
        this.nameAsignatura = nameAsignatura;
    }

    public String getNameMaestro() {
        return nameMaestro;
    }

    public void setNameMaestro(String nameMaestro) {
        this.nameMaestro = nameMaestro;
    }


    public String verDatos(){
        return "Nombre del alumno:"+getNameAlumno() + "Apellido del alumno:" + getApellidoAlumno();
    }
}
