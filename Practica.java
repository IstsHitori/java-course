import java.util.Scanner;
import javax.swing.*;

public class Practica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String name;


        name = JOptionPane.showInputDialog("Tu nombre: ");
        JOptionPane.showMessageDialog(null,"Hola cómo estás" + name);

        System.out.println("Sisa pa");
    }
}
