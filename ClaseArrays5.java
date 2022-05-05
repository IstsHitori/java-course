import java.util.Scanner;
import java.util.*;

public class ClaseArrays5 {
    public static ArrayList<String> C = new ArrayList<>();
    public static ArrayList<Float> P = new ArrayList<>();
    public static ArrayList<Integer> D = new ArrayList<>();
    public static ArrayList<String> S = new ArrayList<>();

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        String codigos;
        //Productos
        String productosNiños[] ={"Pantalon","Camisa","Zapatos"};
        String productosJuguetes[] = {"Carro a control remoto","Lego","UNO"};
        String productosHombre[] = {"Mesa de billar","Set de destornilladores","Estuche"};
        //Codigo de los productos
        String codigoNiños[] = {"CTR-2424","CTR-2425","CTR-2426"};
        String codigoJuguetes[] = {"XR-000","XR-001","XR-002"};
        String codigoHombre[] = {"PSU-4542","PSU-4543","PSU-4544"};

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
                System.out.println("\nEscriba el codigo del producto que desea: ");
                codigos = consola.nextLine();

                boolean verf = false;
                int posicion = 0;
                for(int i = 0; i < codigoNiños.length; i++){
                    if(codigoNiños[i].contains(codigos)){
                        verf = true;
                        posicion = i;
                        codigos = codigoNiños[i];
                        System.out.println(codigos);

                    }
                    else{
                        verf = false;
                    }
                }

                for(int i = 0; i < codigoJuguetes.length; i++){
                    if(codigoJuguetes[i].contains(codigos)){
                        verf = true;
                        posicion = i;
                    }

                    else{
                        verf = false;
                    }
                }

                for(int i = 0; i < codigoHombre.length; i++){
                    if(codigoHombre[i].contains(codigos)){
                        verf = true;
                        posicion = i;
                    }

                    else{
                        verf = false;
                    }
                }

                if(verf = true){

                }
            }
        }
    }
    //Primera función
    public static void calcularPrecio(int codigo,String C,Float P,int D){
        System.out.println();
    }
}
