package Practica;
import java.util.Scanner;
public class MainElectrodomesticos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Electrodomesticos[] listaElectrodomesticos = new Electrodomesticos[3];
        int opcion;

        for(int i = 0; i < listaElectrodomesticos.length;){
            System.out.println("\nDigite una opción:");
            System.out.println("1-Agregar electrodoméstico");
            System.out.println("2-Agregar lavadora");
            System.out.println("3-Agregar televisor");
            System.out.print("Elija una opción:");
            opcion = consola.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3){
                switch (opcion){
                    case 1:
                        String color;
                        char consumoEnergetico;
                        double precioBase,peso;

                        System.out.print("\nDigite el color:");
                        color = consola.next();

                        System.out.print("Digite el consumo energético:");
                        consumoEnergetico = consola.next().charAt(0);

                        System.out.print("Digite el precio base:");
                        precioBase = consola.nextDouble();

                        System.out.print("Digite el peso:");
                        peso = consola.nextDouble();

                        listaElectrodomesticos[i] = new Electrodomesticos(precioBase,color,consumoEnergetico,peso);
                        System.out.println("\nElectrodomestico agregado");
                        i++;
                        break;
                    case 2:
                        String colorLavadora;
                        char consumoEnergeticoLavadora;
                        double precioBaseLavadora,pesoLavadora;
                        int carga;

                        System.out.print("\nDigite el color:");
                        colorLavadora = consola.next();

                        System.out.print("Digite el consumo energético:");
                        consumoEnergeticoLavadora = consola.next().charAt(0);

                        System.out.print("Digite el precio base:");
                        precioBaseLavadora = consola.nextDouble();

                        System.out.print("Digite el peso:");
                        pesoLavadora = consola.nextDouble();

                        System.out.print("Digite la carga:");
                        carga = consola.nextInt();

                        listaElectrodomesticos[i] = new Lavadora(precioBaseLavadora,colorLavadora,consumoEnergeticoLavadora,pesoLavadora,carga);
                        System.out.println("\nLavadora agregada");
                        i++;

                        break;
                    case 3:
                        String colorTelevisor;
                        char consumoEnergeticoTelevisor;
                        double precioBaseTelevisor,pesoTelevisor;
                        int resolucion = 0;
                        boolean sincronizadorTDT;

                        System.out.print("\nDigite el color:");
                        colorTelevisor = consola.next();

                        System.out.print("Digite el consumo energético:");
                        consumoEnergeticoTelevisor = consola.next().charAt(0);

                        System.out.print("Digite el precio base:");
                        precioBaseTelevisor = consola.nextDouble();

                        System.out.print("Digite el peso:");
                        pesoTelevisor = consola.nextDouble();

                        System.out.print("Digite la resolución:");
                        resolucion = consola.nextInt();

                        System.out.print("Tiene sincronizador TDT?: (true/false)");
                        sincronizadorTDT = consola.nextBoolean();

                        listaElectrodomesticos[i] = new Televisor(precioBaseTelevisor,colorTelevisor,consumoEnergeticoTelevisor,pesoTelevisor,resolucion,sincronizadorTDT);
                        System.out.println("\nTelevisor agregado agregado");
                        i++;
                        break;
                    default:
                        System.out.println("Opcion no disponible");

                }
            }
        }

        //Calculamos la suma de los electrodomesticos

        double sumaElectro = 0;
        double sumaTv = 0;
        double sumaLav = 0;

        //Recorremos la lista de electrodomesticos
        for(int i = 0; i < listaElectrodomesticos.length; i++){
            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectro += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLav += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
                sumaTv += listaElectrodomesticos[i].obtenerPrecioFinal();
            }
        }
        System.out.println("\nLa suma del precio electrodomesticos es de: " + sumaElectro);
        System.out.println("\nLa suma del precio de las lavadoras es de :" + sumaLav);
        System.out.println("\nLa suma del precio de los televisores es de:" + sumaTv);
    }
}
