/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Objetos.Arma;
import Objetos.Consumible;
import java.util.ArrayList;

/**
 *
 * @author Mai Perez
 */
public class Jugador{
    static int Puntos;
    ArrayList <Consumible> Consumibles;
    Arma ArmaActual;
    int vida= 200;
    
    
    public int Atacar(){
        return this.ArmaActual.getDamage();
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
     
}
