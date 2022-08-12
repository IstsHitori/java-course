package Interfazces_graficas;

import javax.swing.*;
import java.awt.*;

public class PracticaInterfaz extends JFrame {
    public PracticaInterfaz() {
        this.setSize(500,500);
        this.setTitle("INTERFAZ JOSUE");
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel();
        etiqueta.setOpaque(true);
        etiqueta.setText("APARIENCIA DE DIOS SEGÚN LA BÍBLIA");
        etiqueta.setBounds(100,2,350,100);
        etiqueta.setFont(new Font("cooper black",0,15));
        panel.add(etiqueta);

        //Para la imagen
        ImageIcon imagen = new ImageIcon("josue.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(100,100, 300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
}
