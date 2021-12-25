/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Jugador;
import modelo.JugadorMulti;
import util.Utiles;
import vista.View;

/**
 *
 * @author Brais
 */
public class Controller {

    static View v = new View();
    static Jugador jugador;
    static ArrayList<JugadorMulti> jugadores;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        v.bienvenida();
        bucleJuego();
    }

    public static void bucleJuego() {
        int casos;
        do {
            casos = seleccionModoJuego();
            switch (casos) {
                case 1:
                    unJugador();
                    break;
                case 2:
                    multijugador();
                    break;
                case 3:
                    v.menuAyuda();
                    break;
                case 0:
                    v.escribir("Saliendo...");
                default:
                    break;
            }
        } while (casos != 0);
    }

    public static int seleccionModoJuego() {
        int modoJuego;
        do {
            modoJuego = v.menuModoJuego();
        } while (!(modoJuego >= 0 && modoJuego <= 3));
        return modoJuego;

    }

    public static void unJugador() {
        String nombre;
        nombre = v.escribirOut("Escribe tu nombre:");
        jugador = new Jugador(nombre);
    }
    

    public static void multijugador() {
        v.escribir("No soportado por ahora");
        String nombre, genero;
        boolean jugadorNoCreado;
        nombre = v.escribirOut("Escribe tu nombre:");
        do {
            genero = Utiles.primeraLetra(v.escribirOut("Cual es tu género(H/M):"));
            switch (genero) {
                case "h":
                    jugadores.add(new JugadorMulti(nombre, JugadorMulti.HOMBRE));
                    jugadorNoCreado = false;
                    break;
                case "m":
                    jugadores.add(new JugadorMulti(nombre, JugadorMulti.HOMBRE));
                    jugadorNoCreado = false;
                    break;
                default:
                    v.escribir("Escribe elige entre H/M");
                    jugadorNoCreado = true;
            }
        } while (jugadorNoCreado);
    }
}
