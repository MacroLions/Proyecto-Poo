/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;
import java.util.Random;




/**
 *
 * @author Maishi
 */
public class Monstruo{
    static int lvl=1;
    int vida= 50*lvl;
    int Damage= 10*lvl;
    int DamageMin= (int) (Damage*.15);
    
    public Monstruo(){}
    
    public int Atacar(){
        
        int DamageReal = new Random().nextInt((Damage - DamageMin) + 1) + DamageMin;

        return DamageReal;
    }
    
    public void recibirDamage(int damageRecibido){
        vida= vida-damageRecibido;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getLvl() {
        return lvl;
    }

    public static void setLvl(int lvl) {
        Monstruo.lvl = lvl;
    }
    
    
}
