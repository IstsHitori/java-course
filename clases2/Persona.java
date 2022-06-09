package clases2;

public class Persona {
    public String name;
    public String apellido;
    public int edad;

    public String phone;

    public Persona(){

    }

    public Persona(String name, String apellido, int edad,String phone){
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.phone = phone;
    }

    public void caoturaDatos(){

    }

    public void mostrarDatos(){
        System.out.println("El nombre de la persona es " + name + "\nEl apellido de la persona es " + apellido + "\nLa edad de la persona es " + edad);
    }
}
