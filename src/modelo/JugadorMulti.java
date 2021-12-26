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
public class JugadorMulti {

    public final static boolean HOMBRE = true;
    public final static boolean MUJER = false;

    private String nombre;
    private int nivel, vida, ataque, defensa;

    public JugadorMulti(String nombre, boolean genero) {
        this.nombre = nombre;
        this.nivel = 1;
        this.vida = 100;
        this.ataque = 20;
        this.defensa = 20;
    }
}
