package clases2;

public abstract class Poligono {
    protected int nLados;
    public Poligono(int nLados){
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public abstract double area();

    @Override
    public String toString(){
        return "numero de lados: " + nLados;
    }
}
