package edu.fiuba.algo3.modelo.aexcepciones;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.gestiondeturnos.TurnoJugable;

public class JuegoTerminadoException extends RuntimeException {
    private Jugador jugGanador;
    private String colorJugHex;

    public JuegoTerminadoException(Jugador jugador, String colorHex) {
        colorJugHex = colorHex;
        jugGanador = jugador;
    }

    public String obtenerNombreGanador(){
        return jugGanador.getNombre();
    }


    public String obtenerColorGanador(){
        String color = (jugGanador.getColor() + "-" + colorJugHex);
        return color;
    }
}