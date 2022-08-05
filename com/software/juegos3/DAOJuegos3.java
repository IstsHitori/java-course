package com.software.juegos3;

import java.util.List;

public interface DAOJuegos3 {
    String CARPETA_JUEGO = "C:\\Users\\franc\\Desktop\\Juegos3";
    String ARCHIVO_JUEGO = "C:\\Users\\franc\\Desktop\\Juegos3\\Juegos3.txt";


    public void iniciarProyecto();

    public String crearJuego(String nombreJuego);

    public String eliminarJuego(String nombreJuego, List<Juegos3> juegos);

    public String buscarJuego(String nombreJuego,List<Juegos3> juegos);

    public List<Juegos3> listarJuegos();
}
