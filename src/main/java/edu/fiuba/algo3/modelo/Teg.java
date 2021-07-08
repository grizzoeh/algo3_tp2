package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Teg {
    private int cantidadJugadores;
    private Mapa mapa;
    private ArrayList<Jugador> jugadores;

    public Teg(ArrayList<String> nombresJugadores) {
        this.cantidadJugadores = nombresJugadores.size();
        this.mapa = new Mapa();
        this.jugadores = new ArrayList<Jugador>();

        String[] colores = {"rojo", "azul", "verde", "amarillo", "rosa", "negro"};

        for (int i = 0; i < this.cantidadJugadores; i++) {
            this.jugadores.add(new Jugador(nombresJugadores.get(i), colores[i]));
        }
    }
}
