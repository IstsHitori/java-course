package proyectos;
import javax.naming.Name;
import javax.swing.*;

public class CalcularNota {
    private float nota1;
    private float nota2;
    private float nota3;
    private String NombreMateria;

    public CalcularNota(float nota1, float nota2, float nota3, String NombreMateria){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.NombreMateria = NombreMateria;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getNombreNota() {
        return NombreMateria;
    }

    public void setNombreNota(String nombreNota) {
        NombreMateria = NombreMateria;
    }

    public float calcular_nota(){
        float nota;

        nota = (float) ((nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40));

        if(nota < 3.0){
            JOptionPane.showMessageDialog(null,"Has reprobado la materia " + NombreMateria + " con una nota de " + nota);
        }

        else{
            JOptionPane.showMessageDialog(null,"Has aprobado la materia " + NombreMateria + " con una nota de " + nota);

        }

        return nota;
    }


}
