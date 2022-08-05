package com.software.juegos2;

import java.util.List;

public interface DAOJuegos2 {
    public int registrarJuego(Juego juego,int opcion);
    public void iniciarRegistro();
    public String eliminarJuego(String nombreJuego,List<Juego> juegos);
    public String buscarJuego(String nombreJuego,List<Juego> juegos);
    public List<Juego> juegos();
}
