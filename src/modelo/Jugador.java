/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Brais
 */
public class Jugador {

    private String nombre;
    private int nivel, vida, vidaMaxima, ataque, defensa, dinero;
    private ArrayList<ArrayList<Objeto>> inventario;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.vidaMaxima = 100;
        this.vida = 100;
        this.ataque = 20;
        this.defensa = 20;
        this.dinero = 1000;
        inventario = new ArrayList<>();
        inventario.add(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            inventario.get(0).add(new Objeto("Pocion"));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public ArrayList<ArrayList<Objeto>> getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "Estadisticas:"
                + "\nnombre:" + nombre
                + "\nnivel:" + nivel
                + "\nvida:" + vida + "/" + vidaMaxima
                + "\nataque:" + ataque
                + "\ndefensa:" + defensa
                + "\ndinero:" + dinero;
    }

}
