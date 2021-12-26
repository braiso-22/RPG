/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;
import vista.View;

/**
 *
 * @author Brais
 */
public class Objeto {

    private final View v;
    private String nombre, descripcion;
    private boolean usable;

    public Objeto(String nombre, String descripcion) {
        this.v = new View();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usable = false;
    }

    public Objeto(String nombre, String descripcion, boolean usable) {
        this.v = new View();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usable = usable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUsable() {
        return usable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Objeto other = (Objeto) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean usar(Jugador jugador) {
        String objetoActual = this.nombre;
        switch (objetoActual) {
            case "Pocion":
                if (jugador.getVida() < jugador.getVidaMaxima()) {
                    jugador.setVida(jugador.getVidaMaxima());
                    return true;
                } else {
                    v.escribir("Ya tienes la vida al máximo");
                    return false;
                }
            default:
                return false;
        }
    }

}
