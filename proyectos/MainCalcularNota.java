package proyectos;
import javax.swing.*;
public class MainCalcularNota {
    public static void verNotas(CalcularNota notas[]){
        for(int i = 0; i < notas.length; i++){
            JOptionPane.showMessageDialog(null, "Notas: " + notas[i].calcular_nota());

        }
    }
    public static void main(String[] args) {

        float nota1,nota2,nota3;
        String nombreNota;
        int Nnotas = Integer.parseInt(JOptionPane.showInputDialog("Cuántas materias desea saber la nota: "));
        CalcularNota notas[] = new CalcularNota[Nnotas];

        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Calcular notas\n2-Ver notas actuales\n3-Ver notas por materia\n4-Salir"));
            if(opcion == 1){
                for(int i = 0; i < notas.length; i++){
                   nombreNota = JOptionPane.showInputDialog("Nombre da la materia: ");

                   while(true){
                       nota1 = Float.parseFloat(JOptionPane.showInputDialog("Valor de la nota1 de " + nombreNota + ":"));
                       if(nota1 < 0 || nota1 > 5.0 ){
                           JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 ni mayor que 5.0");
                       }

                       else{
                           break;
                       }
                   }
                   while(true){
                       nota2 = Float.parseFloat(JOptionPane.showInputDialog("Valor de la nota2 de " + nombreNota + ":"));
                       if(nota2 < 0 || nota2 > 5.0 ){
                           JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 ni mayor que 5.0");
                       }

                       else{
                           break;
                       }
                   }
                   while(true){
                       nota3 = Float.parseFloat(JOptionPane.showInputDialog("Valor de la nota3 de " + nombreNota + ":"));
                       if(nota3 < 0 || nota3 > 5.0 ){
                           JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 ni mayor que 5.0");
                       }

                       else{
                           break;
                       }
                   }

                   notas[i] = new CalcularNota(nota1,nota2,nota3,nombreNota);
               }
           }
            else if(opcion == 2){
               //Llamar el metodo toString para ver las notas actuales

               if(notas[0] == null){
                   JOptionPane.showMessageDialog(null,"No hay notas registradas actualmente.");
               }

               else{
                   verNotas(notas);
               }
           }
            else if(opcion == 3){
               //ver notas por materia
            }
            else if(opcion == 4){
               JOptionPane.showMessageDialog(null,"\tBYE!");
               break;
           }
            else{
               JOptionPane.showMessageDialog(null,"Esta opcion no existe.");
            }
        }
        while(true);
    }
}
