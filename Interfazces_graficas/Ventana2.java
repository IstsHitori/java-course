package Interfazces_graficas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;

public class Ventana2 extends JFrame {
    public JPanel panel;
    public Ventana2() {
        this.setSize(500, 500);//Establecemos el tamaño de la ventana
        this.setTitle("Que pasa tio");//Para establecer un titulo para la ventana
        this.setLocationRelativeTo(null);//Para que la ventana se centre
        //this.setLocation(100,200);//Para establecer la locacion de la ventana
        //this.setBounds(100,200,500,500);//Para establecer el tamaño y la locación de la ventana
        //this.setResizable(false);//Para no poder redimensionar la ventana
        this.setMinimumSize(new Dimension(200, 200));//Para poner chika la pantalla en unos pixeles limitados
        //this.getContentPane().setBackground(Color.BLUE);//Para establecer el color a la ventana
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar la ventana al dar click en la X

    }

    private void iniciarComponentes(){
        colocarPanel();
        //colocarEtiqueta();
        //colocarBoton();
        //colocarRadioBoton();
        //colocarBotonesAcctivacion();
        //colocarCajasTexto();
        //colocarAreaTexto();
        //casillaVerificacion();
        //colocarListaDesplegable();
        //colocarCampoContraseña();
        //colocarTablas();
        colocarListas();

    }
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new Persona("Fran",18,"Colombiano"));
        modelo.addElement(new Persona("Javier",17,"Colombia"));

        JList lista = new JList(modelo);
        lista.setBounds(20,20,200,300);
        panel.add(lista);
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20,20,200,300);
        panel.add(scroll);
    }

    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");

        String[] persona1 = {"Fran","18","Colombiano"};
        modelo.addRow(persona1);

        String[] persona2 = {"Merel","18","Dominicano"};
        modelo.addRow(persona2);

        JTable tabla = new JTable(modelo);
        tabla.setBounds(20,20,300,200);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20,20,300,200);
        panel.add(scroll);
    }

    private void colocarCampoContraseña(){
        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(20,20,150,30);
        contraseña.setText("el diablo");
        String pw  = "";

        for(int i = 0; i < contraseña.getPassword().length; i++){
            pw += contraseña.getPassword()[i];
        }
        System.out.println("La contraseña es:" + pw);
        panel.add(contraseña);
    }

    private void colocarListaDesplegable(){
        /*String[] paises = {"Colombia","Perú","Paraguay","Ecuador"};
        JComboBox listaDesple = new JComboBox(paises);
        listaDesple.setBounds(20,20,100,30);
        listaDesple.addItem("Argentina");//Añadir otro objeto al final de la lista
        listaDesple.setSelectedItem("Perú");//Muestra por defecto en la lsita el pais que enviemos
        panel.add(listaDesple);*/

        Persona persona1 = new Persona("Fran",18,"Colombiano");
        Persona persona2 = new Persona("Tania",20,"Argentina");

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(persona1);
        modelo.addElement(persona2);

        JComboBox listaDesplegable = new JComboBox(modelo);
        listaDesplegable.setBounds(20,20,100,30);
        panel.add(listaDesplegable);

    }

    private void casillaVerificacion(){
        JCheckBox casilla = new JCheckBox("Opcion1");
        casilla.setBounds(20,20,100,40);
        panel.add(casilla);

        JCheckBox casilla2 = new JCheckBox("Opcion2");
        casilla2.setBounds(20,50,100,40);
        panel.add(casilla2);

        JCheckBox casilla3 = new JCheckBox("Opcion3");
        casilla3.setBounds(20,80,100,40);
        panel.add(casilla3);
    }

    private void colocarAreaTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba el texto aqui");
        areaTexto.append("\nQue pasa shavaleeee");//Para añadir más texto
        areaTexto.setEditable(true);//´Para permitir o no permitir que se edite el texto dentro del area
        System.out.println("El texto es: " + areaTexto.getText());
        panel.add(areaTexto);

        //Barras de desplazamiento
        JScrollPane barra = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(20,20,300,200);
        //barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barra);
    }

    private void colocarCajasTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);
        cajaTexto.setText("Hola");
        System.out.println("El texto que hay en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }

    private void colocarBotonesAcctivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opcion1 " , true);
        botonActivacion1.setBounds(50,100,100,40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion2 " , false);
        botonActivacion2.setBounds(50,150,100,40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion3 " , false);
        botonActivacion3.setBounds(50,200,100,40);
        panel.add(botonActivacion3);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(botonActivacion1);
        grupo.add(botonActivacion2);
        grupo.add(botonActivacion3);
    }

    private void colocarBoton(){
        JButton boton1 = new JButton();

        boton1.setBounds(100,100,100,40);
        boton1.setText("CLICK");
        boton1.setEnabled(true);//Para acticar o desactivar la interaccion con el boton
        boton1.setMnemonic('a');//Establecemos alt + mas la letra que le mandemos y funciona como click
        boton1.setForeground(Color.blue);//Establecemos el color de la letra del boton
        boton1.setFont(new Font("cooper black", Font.BOLD,15));
        panel.add(boton1);

        //boton con imagen

        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        ImageIcon click = new ImageIcon("click.jpg");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
       //boton2.setBackground(Color.BLUE);
        panel.add(boton2);

        //Boton con borders
        JButton boton3 = new JButton();
        boton3.setBounds(100,300,110,50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.red, 3,true));
        panel.add(boton3);
    }

    private void colocarRadioBoton(){
        JRadioButton radioButton1 = new JRadioButton("Opcion1",false);
        radioButton1.setBounds(50,100,200,50);
        radioButton1.setText("Programacion");
        radioButton1.setFont(new Font("cooper black",0,20));
        radioButton1.setEnabled(true);
        panel.add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("Opcion2",false);
        radioButton2.setBounds(50,150,100,50);
        panel.add(radioButton2);

        JRadioButton radioButton3 = new JRadioButton("Opcion3",true);
        radioButton3.setBounds(50,200,100,50);
        panel.add(radioButton3);

        ButtonGroup radioBotones = new ButtonGroup();
        radioBotones.add(radioButton1);
        radioBotones.add(radioButton2);
        radioBotones.add(radioButton3);
    }
    private void colocarPanel(){
        panel = new JPanel();
        //panel.setBackground(Color.BLUE);//Cambiamos el color del panel
        panel.setLayout(null);
        this.getContentPane().add(panel);//Añadimos el panel al contenido de la ventana
    }

    private void colocarEtiqueta(){
        //JLabel etiqueta = new JLabel("Hola");//Creamos la etiqueta con el texto
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Mundial 2018");//Añadimos texto a la etiqueta de otra forma
        etiqueta.setBounds(85,10,300,80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecemos la alineacion horizontal del texti
        etiqueta.setForeground(Color.black );//Establecemos el color de la letra
        //etiqueta.setBackground(Color.BLACK);//Establecemos el color del fondo de la etiqueta
        //etiqueta.setOpaque(true);//En True para permitir hacer cambios como el color de fondo a la etiqueta
        etiqueta.setFont(new Font("cooper black",0,40));
        panel.add(etiqueta);//Añadimos la etiqueta al panel

        //Etiqueta para colocar una imagen
        ImageIcon imagen = new ImageIcon("balonMundial.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10,80,400,400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

}
