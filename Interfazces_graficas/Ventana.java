package Interfazces_graficas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(500,500);//Establecemos el tamaño de la ventana
        this.setTitle("HOLA MUNDO");
        setLocationRelativeTo(null);
        //setLocation(100,200);
        //setBounds(100,200,500,500);
        //setResizable(false);//Para establecer si se puede redimensionar la ventana o no

        setMinimumSize(new Dimension(200,200));//Para establecer el tamaño mínimo
        iniciarComponentes();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creacion de panel
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel("Mundial 2018");
        etiqueta.setFont( new Font("cooper black",0,40));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta.setOpaque(true);//Hacemos que se pueda cambiar el fondo de la etiqueta
        etiqueta.setBounds(85,10,300,80);
        etiqueta.setForeground(Color.black);
        //etiqueta.setBackground(Color.white);
        panel.add(etiqueta);

        //Etiqueta tipo imagen

        JLabel etiqueta2 = new JLabel( new ImageIcon("balonMundial.jpg"));
        etiqueta2.setBounds(10,80,500,500);
        panel.add(etiqueta2);
    }
}
