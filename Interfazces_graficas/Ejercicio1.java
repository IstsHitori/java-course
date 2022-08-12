package Interfazces_graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 extends JFrame {
    public JPanel panel;
    public JLabel label;
    public Ejercicio1(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarLabel();
        colocarBoton();
    }

    private void colocarBoton(){
        JButton boton = new JButton();
        boton.setBounds(140,70,100,40);
        boton.setText("click aqui");
        boton.setFont(new Font("arial",2,15));
        panel.add(boton);

        ActionListener actionListener = new ActionListener() {
            int n = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                label.setText("Haz dado " + n + " click's");
            }
        };

        boton.addActionListener(actionListener);
    }

    private void colocarLabel(){
        label = new JLabel();
        label.setText("Pinche el boton");
        label.setBounds(120,20,200,50);
        label.setFont(new Font("cooper black",2,20));
        panel.add(label);
    }
    private void colocarPanel(){

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
}
