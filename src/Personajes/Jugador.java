/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Objetos.Arma;
import Objetos.Consumible;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mai Perez
 */
public class Jugador{
    String nombre = "Juanito Scarlet";
    static int Puntos;
    ArrayList <Consumible> Consumibles;
    Arma ArmaActual = new Arma("Mani",30);
    int vida= 200;
    
    public Jugador(){}
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public int Atacar(){
        
        int DamageReal = new Random().nextInt((ArmaActual.getDamage() 
                - ArmaActual.getDamageMin()) + 1) + ArmaActual.getDamageMin();
        
        return DamageReal;
    }
    
    public void recibirDamage(int damageRecibido){
        vida= vida-damageRecibido;
    }

    public static int getPuntos() {
        return Puntos;
    }

    public static void setPuntos(int Puntos) {
        Jugador.Puntos = Puntos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
     
}
