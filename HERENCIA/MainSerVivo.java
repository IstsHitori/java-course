package HERENCIA;

public class MainSerVivo {
    public static void main(String[] args) {
        Planta planta = new Planta();
        planta.alimentarse();

        AnimalCarnivoro animalC = new AnimalCarnivoro();

        animalC.alimentarse();
    }
}
