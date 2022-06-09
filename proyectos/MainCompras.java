package proyectos;

import javax.swing.*;
import java.util.ArrayList;

public class MainCompras {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    public static boolean inicarSesion(Cliente cliente,String user){
        boolean verificar = true;
        if(cliente.verifyLogin(clientes,user) == true){
            verificar = true;
        }

        else{
            verificar = false;
        }


        return verificar;
    }
    public static void main(String args[]){
        Cliente cliente = new Cliente();
        int opcion = 0;
        String respuesta = null;
        do{
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Inciar sesion\n2-Registrarse\n3-Salir\n4-Ver usuarios" +
                        "Elija una opción: "));

                if(opcion < 1 || opcion > 4){
                    JOptionPane.showMessageDialog(null,"Esta opción no existe.");
                }
            }
            while(opcion < 1 || opcion > 4);

            switch(opcion){
                case 1:
                    String user = JOptionPane.showInputDialog("UserID: ");
                    if(inicarSesion(cliente,user) == false){
                        JOptionPane.showMessageDialog(null,"Usted no se encuentra registrado");
                    }
                    else{
                        String password = JOptionPane.showInputDialog("Contraseña: ");
                        JOptionPane.showMessageDialog(null,"Incio de sesión exitosamente.");
                    }
                    break;
                case 2:

                case 3:
                    JOptionPane.showMessageDialog(null,"Bye");
                    break;
            }
        }
        while(opcion!=3);
    }
}
