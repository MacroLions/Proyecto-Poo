/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Mai Perez
 */
public class Consumible {
    private String nombre;
    private int vidaRecuperada;

    public Consumible(String nombre, int vidaRecuperada) {
        this.nombre = nombre;
        this.vidaRecuperada = vidaRecuperada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaRecuperada() {
        return vidaRecuperada;
    }

    public void setVidaRecuperada(int vidaRecuperada) {
        this.vidaRecuperada = vidaRecuperada;
    }
    
}
