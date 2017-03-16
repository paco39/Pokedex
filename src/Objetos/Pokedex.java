/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Paco Miranda
 */
public class Pokedex {
    
    private final ArrayList<Pokemon> pokedex;
    private String entrenador;
    
    public Pokedex(){
        this.pokedex = new ArrayList<>();
    }

    /**
     * @return the entrenador
     */
    public String getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the pokedex
     */
    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }
    
    public void añadirPokemon(Pokemon pokemon){
        pokedex.add(pokemon);
    }
    
}
