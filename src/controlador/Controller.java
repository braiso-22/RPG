/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.View;

/**
 *
 * @author Brais
 */
public class Controller {

    static View v = new View();

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
        } while (!(modoJuego >= 0 && modoJuego <= 2));
        return modoJuego;

    }

    public static void unJugador() {

    }

    public static void multijugador() {
        v.escribir("No soportado por ahora");
    }
}
