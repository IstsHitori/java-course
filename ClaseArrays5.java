
import java.util.Scanner;
import java.util.*;

public class ClaseArrays5 {
    public static ArrayList<String> Compras = new ArrayList<>();
    public static ArrayList<Float> total = new ArrayList<>();
    public static ArrayList<String> C = new ArrayList<>();
    public static ArrayList<Float> P = new ArrayList<>();
    public static ArrayList<Integer> D = new ArrayList<>();
    public static ArrayList<String> S = new ArrayList<>();

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean verf = true;

        int contador_productoNiños = 0,contador_productosJuguetes = 0,contador_productos_Hombres = 0;
        int opcion;
        String codigos;
        //Secciones de los productos
        String secciones[] = {"Ropa para niños","Juguetes","Hombres"};
        //Productos
        String productosNiños[] ={"Pantalon","Camisa","Zapatos"};
        String productosJuguetes[] = {"Carro a control remoto","Lego","UNO"};
        String productosHombre[] = {"Mesa de billar","Set de destornilladores","Estuche"};
        //Codigo de los productos
        String codigoNiños[] = {"CTR-2424","CTR-2425","CTR-2426"};
        String codigoJuguetes[] = {"XR-000","XR-001","XR-002"};
        String codigoHombre[] = {"PSU-4542","PSU-4543","PSU-4544"};
        //Precio y descuentos de los productos
        int descuentoNiños[] = {0,55,53};
        int descuentoJuguetes[] = {30,70,10};
        int descuentoHombres[] = {20,30,55};

        float precioNiños[] = {22.22F, 56.65F, 32.00F};
        float precioJuguetes[] = {30,00F,20,00F,12.00F};
        float precioHombre[] = {120.00F,30.00F,9.00F};


        while(true){
            System.out.print("\n\tEscriba\n\t1-CALCULAR DATOS\n\t2-FIN\n\t:");
            opcion = consola.nextInt();

            if(opcion == 1){
                System.out.println("Estos son los productos con mas del 50% de descuento: ");
                for(int i = 0; i < descuentoNiños.length; i++){
                    if(descuentoNiños[i] > 50){
                        System.out.print(productosNiños[i]+",");
                    }
                }
                for(int i = 0; i < descuentoJuguetes.length; i++){
                    if(descuentoJuguetes[i] > 50){
                        System.out.print(productosJuguetes[i]+",");
                    }
                }
                for(int i = 0; i < descuentoHombres.length; i++){
                    if(descuentoHombres[i] > 50){
                        System.out.print(productosHombre[i]+",");
                    }
                }
                System.out.println("\n");
                System.out.print("\nEstos son los productos para niños:\n");
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
                codigos = consola.next();

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
                        break;
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
                            contador_productosJuguetes++;
                        }
                        break;
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
                            contador_productos_Hombres++;
                        }
                        break;
                    }
                    else {
                        verf = false;
                    }
                }

                if(verf == true){
                    calcularPrecio(codigos,C,P,D);
                }

                else if(verf == false){
                    System.out.println("No se encontró el código.");
                }
            }

            else if(opcion == 2){
                calculuarTotal(Compras,C,P,D,total);
                hallarSecciones(Compras,C,S);
                descuentoPorseccion(D,S);
                break;
            }

            else {
                System.out.println("Esta opción no existe.");
            }
        }
    }
    //Primera función
    public static void calcularPrecio(String codigo, ArrayList<String> C, ArrayList<Float> P, ArrayList<Integer> D){
        System.out.println("\n");
        int posicion = 0;
        boolean verf = false;
        float precio = 0,preciofinal_producto = 0,descuento = 0;

        for(int i = 0; i < C.size(); i++){
            if(C.get(i).equals(codigo)){
                posicion = i;
                verf = true;
                break;
            }
            else{
                verf = false;
            }
        }

        if(verf = true){
            precio = P.get(posicion);

            descuento = D.get(posicion);

            preciofinal_producto = precio - precio/(100 / descuento);
            total.add(preciofinal_producto);
        }

        System.out.print("El precio final del producto " + C.get(posicion) + " sera de: " + preciofinal_producto);

        Compras.add(codigo);
    }
    //Segunda funcion

    public static void calculuarTotal(ArrayList<String> compras,ArrayList<String> C, ArrayList<Float> P, ArrayList<Integer> D,ArrayList<Float>total){
        System.out.println("\n");
        int suma = 0;
        int total_pagar;
        for(int i = 0; i < C.size(); i++){
            suma = (int) (suma + total.get(i));
        }
        total_pagar = suma;
        System.out.print("El total a pagar es: " + total_pagar);
    }

    //Tercera funcion

    public static void hallarSecciones(ArrayList<String> compras,ArrayList<String> C, ArrayList<String> S){

        System.out.println("\n");
        System.out.print("Para comprar sus productos tendra que ir a estas secciones: " + S);
        System.out.println("\n");
    }
    //Cuarta funcion

    public static void descuentoPorseccion(ArrayList<Integer> D,ArrayList<String> S){
        System.out.println("\n");
        int mas_del_50 = 0;
        System.out.println("Secciones: \n"+S);

        for(int j = 0; j < D.size(); j++){
            if(D.get(j) > 50){
                mas_del_50++;
            }
        }
        System.out.print("Productos con mas del 50% de descuento que compraste: " + mas_del_50);
    }
}
