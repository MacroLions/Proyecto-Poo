/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maishi
 */
public class Juego extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    static ImageIcon Sprite;
    JLabel Jugador = new JLabel(Sprite);
    
    public Juego(){
        Jugador.setBounds(0,100,300,300);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Jugador);
        validate();
    }

    public static ImageIcon getSprite() {
        return Sprite;
    }

    public static void setSprite(ImageIcon Sprite) {
        Juego.Sprite = Sprite;
    }
    
    
    
}
