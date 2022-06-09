package clases2;
public class Maestro extends Persona {

    public String id;
    public String profesion;

    public Maestro(){
        super();
    }
    public Maestro(String name, String apellido, int edad,String phone){
        super(name,apellido,edad,phone);
        this.id = id;
        this.profesion = profesion;
    }
}
