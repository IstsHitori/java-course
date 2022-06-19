package ProyectoParcial;

public class PeliculaComedia extends TiendaPeliculas {
    private float precioAdicional = 0.02F;

    public PeliculaComedia(){

    }

    //Constructor para arrendar la pelicula
    public PeliculaComedia(String nombrePelicula, String iD_pelicula,int dias){
        super(nombrePelicula,iD_pelicula,5,dias);

    }

    //Constructor para crear pelicula
    public PeliculaComedia(String nombrePelicula,String iD_pelicula){
        super(nombrePelicula,iD_pelicula,5);
    }

    @Override
    public float precioTotal() {
        float precio = 0;
        precio += super.getPrecioPelicula() + (super.getPrecioPelicula() * precioAdicional);
        return precio;
    }

    @Override
    public String toString(){
        return "\nCategoria de Pelicula comedia:\n" + super.toString();
    }
}
