/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Brais
 */
public class Enemigo {

    private String nombre;
    private int nivel, vida, vidaMaxima, ataque, defensa, dinero;

    Enemigo(Jugador jugador, String nombre) {
        this.nombre = nombre;
        
    }

}
