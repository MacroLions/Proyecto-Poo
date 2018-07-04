/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Objetos.Arma;
import Objetos.Consumible;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mai Perez
 */
public class Jugador extends JFrame{
    ArrayList <Consumible> Consumibles;
    Arma ArmaActual;
    int vida= 200;
    JLabel ImagenBase = new JLabel(new ImageIcon("path_to_image.png"));
    
    public int Atacar(){
        return this.ArmaActual.getDamage();
    }
    
    public void recibirDamage(int damageRecibido){
        vida= vida-damageRecibido;
    }
}
