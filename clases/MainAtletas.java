package clases;
import java.util.Scanner;
public class MainAtletas {

    public static int recordAtleta(Atletas atletas[]){
        int indice = 0;

        float atleta = atletas[0].getNtiempo();

        for(int i = 0; i < atletas.length; i++){
            if(atletas[i].getNtiempo() > atleta){
                atleta = atletas[i].getNtiempo();
                indice = i;
            }
        }

        return indice;
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String NombreAtleta;
        int Natleta;
        float Ntiempo;
        byte NumeroAtletas;

        System.out.print("Numero de atletas que desea registrar: ");
        NumeroAtletas = consola.nextByte();
        Atletas atletas[] = new Atletas[NumeroAtletas];

        for(int i = 0; i < atletas.length; i++){
            consola.nextLine();
            System.out.println("Datos del " + (i+1) + " atleta\n");

            System.out.print("Nombre del atleta: ");
            NombreAtleta = consola.nextLine();

            System.out.print("Numero de dorsal del atleta: ");
            Natleta = consola.nextInt();

            System.out.print("Tiempo del atleta: ");
            Ntiempo = consola.nextFloat();

            atletas[i] = new Atletas(Natleta,NombreAtleta,Ntiempo);
        }

        System.out.println("El atleta ganador es:\n" + atletas[recordAtleta(atletas)]);
    }
}
