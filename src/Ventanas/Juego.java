/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
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
    static ImageIcon SpriteJugador;
    ImageIcon SpriteMonstruo = ImagenFactory.getImagen(6);
    JLabel Jugador = new JLabel(SpriteJugador);
    JLabel Monstruo = new JLabel(SpriteMonstruo);
    
    public Juego(){
        Jugador.setBounds(0,100,300,300);
        Monstruo.setBounds(400,100,300,300);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Jugador);
        add(Monstruo);
        validate();
    }

    public static ImageIcon SpriteJugador() {
        return SpriteJugador;
    }

    public static void setSprite(ImageIcon SpriteJugador) {
        Juego.SpriteJugador = SpriteJugador;
    }
    
    
    
}
