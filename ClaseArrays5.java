import java.util.Scanner;
import java.util.*;

public class ClaseArrays5 {
    public static ArrayList<String> C = new ArrayList<>();
    public static ArrayList<Float> P = new ArrayList<>();
    public static ArrayList<Integer> D = new ArrayList<>();
    public static ArrayList<String> S = new ArrayList<>();
    //--------------------------------------------
    //Secciones de los productos
    public static String secciones[] = {"Ropa para niños","Juguetes","Hombres"};
    //Productos
    public static String productosNiños[] ={"Pantalon","Camisa","Zapatos"};
    public static String productosJuguetes[] = {"Carro a control remoto","Lego","UNO"};
    public static String productosHombre[] = {"Mesa de billar","Set de destornilladores","Estuche"};
    //Codigo de los productos
    public static String codigoNiños[] = {"CTR-2424","CTR-2425","CTR-2426"};
    public static String codigoJuguetes[] = {"XR-000","XR-001","XR-002"};
    public static String codigoHombre[] = {"PSU-4542","PSU-4543","PSU-4544"};
    //Precio y descuentos de los productos
    public static int descuentoNiños[] = {0,50,50};
    public static int descuentoJuguetes[] = {30,20,10};
    public static int descuentoHombres[] = {20,30,40};

    public static float precioNiños[] = {22.22F, 56.65F, 32.00F};
    public static float precioJuguetes[] = {30,00F,20,00F,12.00F};
    public static float precioHombre[] = {120.00F,30.00F,9.00F};

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        String codigos;

        while(true){
            System.out.print("\tEscriba\n\t1-CALCULAR DATOS\n\t2-FIN\n\t:");
            opcion = consola.nextInt();

            if(opcion == 1){
                System.out.print("Estos son los productos para niños:\n");
                for(int i = 0; i < productosNiños.length;i++){
                    System.out.print(productosNiños[i]+" - ");
                    System.out.print(codigoNiños[i] + "|");
                }

                System.out.println("\nEstos son los productos de juguetes:");
                for(int i = 0; i < productosJuguetes.length; i++){
                    System.out.print(productosJuguetes[i]+" - ");
                    System.out.print(codigoJuguetes[i] + "|");
                }

                System.out.println("\nEstos son los productos para hombres:");
                for(int i = 0; i < productosHombre.length; i++){
                    System.out.print(productosHombre[i]+" - ");
                    System.out.print(codigoHombre[i] + "|");
                }

                consola.nextLine();
                System.out.print("\nEscriba el codigo del producto que desea: ");
                codigos = consola.nextLine();

                boolean verf = false;

                int contador_productoNiños = 0,contador_productosJuguetes = 0,contador_productos_Hombres = 0;
                String seccion = null;
                for(int i = 0; i < 3; i++){
                    if(codigoNiños[i].contains(codigos)){
                        verf = true;
                        codigos = codigoNiños[i];
                        seccion = secciones[0];
                        C.add(codigos);
                        P.add(precioNiños[i]);
                        D.add(descuentoNiños[i]);
                        if (contador_productoNiños < 1){
                            S.add(seccion);
                            contador_productoNiños++;
                        }
                    }
                    else if(codigoJuguetes[i].contains(codigos)){
                        verf = true;
                        codigos = codigoJuguetes[i];
                        seccion = secciones[1];
                        C.add(codigos);
                        P.add(precioNiños[i]);
                        D.add(descuentoNiños[i]);
                        if(contador_productosJuguetes < 1){
                            S.add(seccion);

                        }
                    }
                    else if(codigoHombre[i].contains(codigos)){
                        verf = true;
                        codigos = codigoHombre[i];
                        seccion = secciones[2];
                        C.add(codigos);
                        P.add(precioNiños[i]);
                        D.add(descuentoNiños[i]);
                        if(contador_productos_Hombres < 1){
                            S.add(seccion);
                        }
                    }
                    else {
                        verf = false;
                    }
                }

                if(verf = true){
;
                    calcularPrecio(codigos,C,P,D);
                }
            }

            else if(opcion == 2){
                break;
            }

            else {
                System.out.println("Esta opción no existe.");
            }
        }
    }
    //Primera función
    public static void calcularPrecio(String codigo, ArrayList<String> C, ArrayList<Float> P, ArrayList<Integer> D){
        float precio = 0,preciofinal_producto,descuento = 0;


    }
}
