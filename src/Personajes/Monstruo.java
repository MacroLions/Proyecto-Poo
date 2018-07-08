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
    int vida= 200;
    int Damage= 20;
    int DamageMin= (int) (Damage*.15);
    
    public Monstruo(){}
    
    public int Atacar(){
        
        int DamageReal = new Random().nextInt((Damage - DamageMin) + 1) + DamageMin;

        return DamageReal;
    }
    
    public void recibirDamage(int damageRecibido){
        vida= vida-damageRecibido;
    }
}
