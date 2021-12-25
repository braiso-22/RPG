/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class View {

    Scanner teclado = new Scanner(System.in);

    public void escribir(String texto) {
        System.out.println(texto);
    }

    public void bienvenida() {
        System.out.println("Bienvenido a: Duelo a muerte con cuchillos!");
    }

    public int menuModoJuego() {
        System.out.println("Elige el modo de juego\n");
        System.out.println("*************************");
        System.out.println("*  1.- Un jugador\t*");
        System.out.println("*  2.- Multijugador\t*");
        System.out.println("*  3.- Ayuda\t*");
        System.out.println("*  0.- Salir\t\t*");
        System.out.println("*************************");

        int salida = -1;
        try {
            salida = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Introduce una de las opciones");
        }
        return salida;
    }
}
