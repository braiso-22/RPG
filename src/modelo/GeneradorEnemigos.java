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
public class GeneradorEnemigos {

    String[] presas, enemigos, jefes;

    public GeneradorEnemigos() {
        this.presas = new String[]{"Ciervo", "Zorro", "Jabalí",
            "Lobo", "Oso", "Jaguar",
            "Piraña", "Cocodrilo", "Hipopotamo",
            "Lagarto Gigante", "Sapo Gigante", "Boa Gigante",
            "Leon plateado", "Avestruz metalica", "Mamut de bronce"};
        this.enemigos = new String[]{"Ladrón", "Goblin", "Ogro",
            "Hombre Lobo", "Esqueleto", "Zombie",
            "Ciclope", "Hechicero", "Gigante",
            "Dragón Joven", "Guerrero Caido", "Vampiro",
            "Mago oscuro", "Parca", "Dragón Milenario"};

        this.jefes = new String[]{"Gobernante Goblin",
            "Rey Corrupto",
            "Reina Bruja",
            "Demonio Caido",
            "La Abominación"};

    }

    public void generarPresa(Jugador jugador) {
        Enemigo presa = new Enemigo(jugador, "");
    }

    public void generarRival(Jugador jugador) {

    }
}
