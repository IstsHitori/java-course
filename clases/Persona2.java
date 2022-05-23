package clases;

public class Persona2 {

    private final String name;
    private int edad;

    public Persona2(String name, int edad){
        this.name = name;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + name);
        System.out.println("La edad es: "+edad);
    }

    //metodo set
    //public void setName(String name){
        //this.name = name;
    //}
    public void setEdad(int edad){
        this.edad = edad;
    }
    //metodo get
    public String getName(){
        return name;
    }
    public int getEdad(){
        return edad;
    }
}
