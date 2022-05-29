package clases;

public class Atletas {
    private int Natleta;
    private String NombreAtleta;
    private float Ntiempo;

    public Atletas(){

    }

    public Atletas(int Natleta, String NombreAtleta, float Ntiempo){
        this.Natleta = Natleta;
        this.NombreAtleta = NombreAtleta;
        this.Ntiempo = Ntiempo;
    }

    public void setNatleta(int Natleta){
        this.Natleta = Natleta;
    }
    public void setNombreAtleta(String NombreAtleta){
        this.NombreAtleta = NombreAtleta;
    }
    public void setNtiempo(float Ntiempo){
        this.Ntiempo = Ntiempo;
    }

    public int getNatleta(){
        return Natleta;
    }
    public String getNombreAtleta(){
        return NombreAtleta;
    }
    public float getNtiempo(){
        return Ntiempo;
    }

    public String toString(){
        return "El atleta con nombre '" + NombreAtleta + "' y con numero de dorsal '" + Natleta + "' tuvo un tiempo record de '" + Ntiempo + "' y es el ganador.\n";
    }
}
