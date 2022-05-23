package clases;

public class MainEncapsulamiento {
    public static void main(String[] args) {
        Encapsulamiento objeto1 = new Encapsulamiento();
        objeto1.setEdad(3);
        System.out.println(objeto1.getEdad());
        objeto1.setName("Fran");
        System.out.println(objeto1.getName());

    }
}
