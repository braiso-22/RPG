/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import modelo.Jugador;
import modelo.JugadorMulti;
import modelo.Objeto;
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
                    partidaUnJugador();
                    break;
                case 2:
                    crearJugadores();
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

    public static void partidaUnJugador() {
        crearUnJugador();
        int opcion = -1;
        while (jugador.getVida() > 0 && opcion != 0) {
            opcion = v.menuUnJugador();
            switch (opcion) {
                case 1:
                    v.escribir(jugador.toString());
                    break;
                case 2:
                    //TODO
                    break;
                case 3:
                    //TODO
                    break;
                case 4:
                    while (opcion != 0) {
                        opcion = v.mostrarInventarioUnJugador(jugador);
                        opcionesInventario(opcion);
                    }
                    opcion = -1;

                    break;
                case 5:
                    //TODO
                    break;
                case 6:
                    v.menuAyudaPartidaUnJugador();
                    break;
                //TODO dungeon
                case 0:
                    v.escribir("Saliendo...");
                    break;
                default:
                    break;
            }
        }
        v.escribir("Estadisticas finales");
        v.escribir(jugador.toString());
    }

    public static void crearUnJugador() {
        String nombre;
        nombre = v.escribirOut("Escribe tu nombre:");
        jugador = new Jugador(nombre);
    }

    public static void crearJugadores() {
        v.escribir("No soportado por ahora");/*
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
        } while (jugadorNoCreado);*/
    }

    public static void opcionesInventario(int opcion) {
        switch (opcion) {
            case 1:
                usarObjeto();
                break;

            case 2:
                infoObjeto();
                break;
            case 0:
                v.escribir("volviendo al menú");
                break;
            default:
                break;
        }
    }

    public static void usarObjeto() {
        boolean encontrado = false;
        String objeto = v.escribirOut("Elige el objeto que vas a usar:");
        for (ArrayList<Objeto> objetos : jugador.getInventario()) {
            Objeto actual = objetos.get(0);
            if (actual.toString().equalsIgnoreCase(objeto)) {
                encontrado = true;
                if (actual.isUsable()) {
                    actual.usar(jugador);
                    objetos.remove(actual);
                } else {
                    v.escribir("Ese objeto no se puede usar");
                }
                break;
            }
        }
        if (!encontrado) {
            v.escribir("No tienes ese objeto o lo has escrito mal");
        }
    }

    public static void infoObjeto() {
        boolean encontrado = false;
        String objeto = v.escribirOut("Elige el objeto del que quieres ver la info:");
        for (ArrayList<Objeto> objetos : jugador.getInventario()) {
            Objeto actual = objetos.get(0);
            if (actual.toString().equalsIgnoreCase(objeto)) {
                encontrado = true;
                if (actual.isUsable()) {
                    v.escribir(actual.getDescripcion());
                } else {
                    v.escribir("Ese objeto no se puede usar");
                }
                break;
            }
        }
        if (!encontrado) {
            v.escribir("No tienes ese objeto o lo has escrito mal");
        }
    }
}
