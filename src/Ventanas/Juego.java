/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Personajes.Jugador;
import Personajes.Monstruo;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maishi
 */
public class Juego extends JPanel{
    Jugador jugador;
    Monstruo monstruo;
    public int WIDTH = 700;
    public int HEIGHT = 500;
    static ImageIcon SpriteJugador;
    ImageIcon SpriteMonstruo = ImagenFactory.getImagen(6);
    JLabel Jugador = new JLabel(SpriteJugador);
    JLabel Monstruo = new JLabel(SpriteMonstruo);
    JButton Atacar = new JButton("Atacar");
    JButton Inventario = new JButton("Inventario");
    JLabel CajaDeTexto = new JLabel("Lobo salvaje ha aparecido!");
    
    
    public Juego(){
        Jugador.setBounds(0,50,300,300);
        Monstruo.setBounds(400,50,300,300);
        Inventario.setBounds(600,400,100,50);
        Atacar.setBounds(500,400,100,50);
        CajaDeTexto.setBounds(0,400,500,100);
        CajaDeTexto.setFont(new Font("Berlin Sans FB",Font.PLAIN,40));
        CajaDeTexto.setHorizontalTextPosition(JLabel.CENTER);
        CajaDeTexto.setIcon(ImagenFactory.getImagen(7));
        Atacar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               CajaDeTexto.setText(jugador.getNombre()+ " Ha hecho "+jugador.Atacar());
            }
        });
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Jugador);
        add(Monstruo);
        add(Atacar);
        add(Inventario);
        add(CajaDeTexto);
        validate();
    }

    public static ImageIcon SpriteJugador() {
        return SpriteJugador;
    }

    public static void setSprite(ImageIcon SpriteJugador) {
        Juego.SpriteJugador = SpriteJugador;
    }
    
    
    
}
