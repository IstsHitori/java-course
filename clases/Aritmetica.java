package clases;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Contructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos.");
    }

    public void sumar(){
        int suma = this.a + this.b;
        System.out.println("El resultado de la suma es: " + suma);
    }

    public int sumarConRetorno(){
        return this.a + this.b;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;

        return this.sumarConRetorno();
    }
}
