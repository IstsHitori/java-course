package Interfazces_graficas;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(500,500);//Establecemos el tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("HOLA MUNDO");
        setLocation(100,200);
    }
}
