package Interfazces_graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana3 extends JFrame {
    public JPanel panel;
    public JTextField texto;

    private JTextArea texto2;
    private JScrollPane deslizar;
    public Ventana3(){
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicarComponentes();
    }

    private void inicarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarTexto();
        colocarBoton();
        colocarTexto2();

    }
    private void colocarBoton() {
        JButton boton = new JButton();
        boton.setBounds(69, 210, 100, 30);
        boton.setText("!Click Aqui¡");
        panel.add(boton);

        JLabel saludo = new JLabel();
        saludo.setBounds(69,100,200,50);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
        //Para hacer la accion cuando precione el boton
        //eventoOyenteAccion(boton,saludo);
        //eventoOyenRaton(boton);

    }

    private void eventoOyenRaton(JButton boton){
        MouseListener oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isAltDown()){
                    texto2.append("Alt\n");
                }else if(e.isControlDown()){
                    texto2.append("Control\n");
                }else if(e.isShiftDown()){
                    texto2.append("Shift\n");
                }else if(e.isMetaDown()){
                    texto2.append("Click derecho\n");
                }else{
                    texto2.append("Click izquierdo\n");
                }

                if(e.getClickCount() == 2){
                    texto2.append("Doble click\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //texto2.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //texto2.append("mosueReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //texto2.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //texto2.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteRaton);
    }

    private void eventoOyenteAccion(JButton boton,JLabel saludo){
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola " + texto.getText());
            }
        };
        boton.addActionListener(oyenteAccion);
    }

    private void colocarTexto(){
        texto = new JTextField();
        texto.setBounds(270,90,200,30);
        panel.add(texto);

        eventoTeclado();

    }

    private void colocarTexto2(){
        texto2 = new JTextArea();
        texto2.setBounds(28,90,200,110);
        panel.add(texto2);

        deslizar = new JScrollPane(texto2,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        deslizar.setBounds(28,90,200,110);
        panel.add(deslizar);

    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        //eventoMovimientoRaton();
        //eventoRuedaRaton();
    }

    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Escriba su nombre:");
        etiqueta.setBounds(20,40,300,60);
        etiqueta.setFont(new Font("cooper black",2,20));
        panel.add(etiqueta);
    }

    private void eventoMovimientoRaton(){
        MouseMotionListener oyenteMovimiento = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                texto2.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                texto2.append("mouseMoved\n");
            }
        };
        panel.addMouseMotionListener(oyenteMovimiento);
    }

    private void eventoRuedaRaton(){
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getPreciseWheelRotation() == -1){
                    texto2.append("Se mueve hacia arriba\n");
                }else{
                    texto2.append("Se mueve hacia abajo\n");
                }
            }
        };


        panel.addMouseWheelListener(ruedaRaton);
    }

    private void eventoTeclado(){
        KeyListener eventoT = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //texto2.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //texto2.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //texto2.append("keyReleased\n");
                if(e.getKeyChar() == 'p'){
                    texto2.append("Es la letra p\n");
                }
                if(e.getKeyChar() == '\n'){
                    texto2.append("Es enter\n");
                }
                if(e.getKeyChar() == ' '){
                    texto2.append("Es un espacio\n");
                }
            }
        };
        texto.addKeyListener(eventoT);
    }
}
