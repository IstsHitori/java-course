package ProyectoParcial;


public class PeliculaTerror extends TiendaPeliculas{
    private float precioAdicional = 0.20F;

    public PeliculaTerror(){

    }


    //Constructor para crear pelicula
    public PeliculaTerror(String nombrePelicula,String iD_pelicula){
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
        return "\nCategoria de Pelicula terror:\n" + super.toString();
    }
}
