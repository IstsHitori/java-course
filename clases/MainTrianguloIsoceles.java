package clases;
import java.util.Scanner;
import javax.swing.*;
public class MainTrianguloIsoceles {

    public static double areaMayorSuperficie(TrianguloIsoceles triangulos[]){

        double area = triangulos[0].obtenerArea();

        for(int i = 1; i < triangulos.length; i++){
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }

        return area;
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int NumeroTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos triangulos desea guardar: "));
        TrianguloIsoceles triangulo[] = new TrianguloIsoceles[NumeroTriangulos];

        for(int i = 0; i < triangulo.length; i++){
            double LadoTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Valor de los 2 lados del " + (i+1) +" triangulo: "));
            double BaseTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Valor de la base del " + (i+1) + " truangulo: "));

            triangulo[i] = new TrianguloIsoceles(LadoTriangulo,BaseTriangulo);

            JOptionPane.showMessageDialog(null,"\nEl perimetro del triangulo "+ (i+1) + " es: " + triangulo[i].obtenerPerimetro());
            JOptionPane.showMessageDialog(null,"\nEl area del triangulo " + (i+1) + " es: " + triangulo[i].obtenerArea());
        }

        JOptionPane.showMessageDialog(null,"\nEl area del triangulo de mayor superficie es: " + areaMayorSuperficie(triangulo));
    }
}
