package com.software.juegos;

import java.util.List;

public interface DAOJuegos {
    String NOMBRE_ARCHIVO = "Juegos.txt";
    public void agregarJuego(Juego nombreJuego);

    public String eliminarJuego(String nombreJuego, List<Juego> juegos);

    public void eliminar();

    public List<Juego>listarJuegos();

    public String buscarJuego(String nombreJuego);

    public void crear();

}
