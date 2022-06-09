package clases2;
import java.util.ArrayList;
import java.util.Scanner;
public class MainUniversidad {
    static Asignatura materias_registradas[];
    static Scanner consola = new Scanner(System.in);

    static Alumno alumno1;

    static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    public static void registrarAlumno() {

        consola.nextLine();
        String nombre;
        String apellido;
        int edad;
        int n_materias;
        String cedula = "";

        System.out.println("<<Registrar Aalumno>>\t");

        System.out.print("Nombre del alumno:");
        nombre = consola.nextLine();

        System.out.print("Apellido del alumno:");
        apellido = consola.nextLine();

        System.out.print("Edad del alumno:");
        edad = consola.nextInt();
        consola.nextLine();

        while(true){
            System.out.print("Cedula o T.I del alumno:");
            cedula = consola.nextLine();

            if(cedula.length() < 10 || cedula.length() > 10){
                System.out.println("La cedula o T.I debe tener 10 caracteres.");
            }
            else{
                break;
            }
        }
        System.out.print("Cuantas materias desea registrar: ");
        n_materias = consola.nextInt();
        materias_registradas = new Asignatura[n_materias];
        consola.nextLine();
        for(int i = 0; i < materias_registradas.length; i++){

            System.out.print((i+1) + "-Nombre de la materia:");
            String name_materia = consola.nextLine();

            System.out.print("Nombre del maestro de la " + (i+1) + " Materia:");
            String name_maestro = consola.nextLine();

            materias_registradas[i] = new Asignatura(name_materia,name_maestro);
        }
        Alumno alumno1 = new Alumno(nombre,apellido,edad,cedula,materias_registradas);

        alumnos.add(alumno1);
    }

    public static void verAlumno(){
        int indice = 0;
        consola.nextLine();
        String cedula;
        boolean verf = true;

        while(true){
            System.out.print("Cedula o T.I del alumno:");
            cedula = consola.nextLine();

            if(cedula.length() < 10 || cedula.length() > 10){
                System.out.println("La cedula o T.I debe tener 10 caracteres.");
            }
            else{
                break;
            }
        }


        for(Alumno alum : alumnos){
            if(alum.getCedula().contains(cedula)){
                //indice =
                verf = true;
                break;
            }

            else{
                verf = false;
            }
        }

        if(verf == true){
            System.out.println("Alumno encontrado\n");
            System.out.println(">>Datos del alumno con cedula " + cedula  + "<<\n");
            System.out.println();
            for(Alumno alum : alumnos){
                if(alum.getCedula().contains(cedula)){
                    System.out.println("Nombre: " + alum.getNameAlumno() + " Apellido: " + alum.getApellidoAlumno() + " Edad: " + alum.getEdad());
                    alum.verDato();
                }
            }
        }

        else{
            System.out.println("alumno no encontrado.");
        }
    }

    public static void main(String[] args) {
        int opcion;
        do{
            System.out.print("1-Ver datos de alumno\n2-Registrar datos de alumno\n3-Salir\n:");
            opcion = consola.nextInt();

            if(opcion == 1){
                verAlumno();
            }
            else if(opcion == 2){
                registrarAlumno();
            }

            else if(opcion == 3){
                break;
            }
            else{
                System.out.println("Esta opcion no existe.\n");
            }
        }
        while(true);
    }
}