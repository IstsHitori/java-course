package clases;

public class Libros2 {
    private String titulo;
    private String autor;
    private int Nejemplares;
    private int NejemplaresPrestados;

    public Libros2(){
    }

    public Libros2(String titulo, String autor, int Nejemplares, int NejemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.Nejemplares = Nejemplares;
        this.NejemplaresPrestados = NejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNejemplares() {
        return Nejemplares;
    }

    public void setNejemplares(int nejemplares) {
        Nejemplares = nejemplares;
    }

    public int getNejemplaresPrestados() {
        return NejemplaresPrestados;
    }

    public void setNejemplaresPrestados(int nejemplaresPrestados) {
        NejemplaresPrestados = nejemplaresPrestados;
    }

    public void prestamo(){
        if((Nejemplares > 0)){
            System.out.println("El libro " + titulo + " se puede prestar");
            NejemplaresPrestados++;
            Nejemplares--;
        }
        else{
            System.out.println("El libro " + titulo + " no se puede prestar.");
        }
    }

    public void devolusion(){
        if(NejemplaresPrestados > 0){
            System.out.println("El libro " + titulo + " se ha devuelto correctamente.");
            NejemplaresPrestados--;
            Nejemplares++;
        }
        else{
            System.out.println("El libro " + titulo + " no se puede devolver.");
        }
    }
    @Override
    public String toString(){
        return "El libro con autor "+ autor+ " con titulo "+ titulo + " tiene " + Nejemplares + " ejemplares y tiene " + NejemplaresPrestados + " prestados.";
    }
}
