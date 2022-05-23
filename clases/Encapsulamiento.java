package clases;

public class Encapsulamiento {
    private int edad;
    private String name;

    //Metodo set
    public void setEdad(int edad){
        this.edad = edad;

    }

    public void setName(String name){
        this.name = name;
    }

    //Metodo get
    public int getEdad(){
        return edad;
    }
    public String getName(){
        return name;
    }
}
