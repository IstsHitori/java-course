package clases2;

public class Universidad {
    private String nameAlumno;
    private String apellidoAlumno;
    private int edad;
    private String cedula;
    protected String nameAsignatura;
    protected String nameMaestro;

    public Universidad(){

    }

    public Universidad(String nameAlumno, String apellidoAlumno, int edad, String cedula){
        this.nameAlumno = nameAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNameAlumno() {
        return nameAlumno;
    }

    public void setNameAlumno(String nameAlumno) {
        this.nameAlumno = nameAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
