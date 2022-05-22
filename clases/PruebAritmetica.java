package clases;

public class PruebAritmetica {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println(aritmetica1.a);
        System.out.println(aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(2,3);
        System.out.println(aritmetica2.a);
        System.out.println(aritmetica2.b);

    }
}
