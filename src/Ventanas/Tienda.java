/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Personajes.Jugador;
import SFX.Music;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;

/**
 *
 * @author Nuria
 */
public class Tienda extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonConsumibles = new JButton("CONSUMIBLES");
    static JButton ButtonArmas = new JButton("ARMAS");
    static JButton ButtonSalir = new JButton("SALIR");
    static JButton ButtonObjetoFinal = new JButton();
    JLabel lblTitulo, lblEslogan, lblPrecioObjetoFinal, lblBackground, lblPuntos;

    public Tienda(){
        lblBackground= new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(3));
        lblBackground.setBounds(0,0,700,500);
        
        lblTitulo= new JLabel("¡TIENDA GAMAZON!");
        lblTitulo.setFont(new Font("Arial",Font.BOLD,30));
        lblTitulo.setForeground(Color.PINK);
        lblTitulo.setBounds(200,20,300,30);
        
        lblEslogan= new JLabel("Donde puedes comprar todo lo que necesitas para destruir");
        lblEslogan.setFont(new Font("Arial",Font.BOLD,20));
        lblEslogan.setForeground(Color.WHITE);
        lblEslogan.setBounds(70, 50, 650, 20);
        
        lblPrecioObjetoFinal = new JLabel("El precio del objeto final es 1000 pts");
        lblPrecioObjetoFinal.setFont(new Font("Arial",Font.BOLD,20));
        lblPrecioObjetoFinal.setForeground(Color.WHITE);
        lblPrecioObjetoFinal.setBounds(320,150,450,20);
        
        lblPuntos=new JLabel("Puntos: " + Jugador.getPuntos());
        lblPuntos.setFont(new Font("Arial",Font.BOLD,20));
        lblPuntos.setForeground(Color.WHITE);
        lblPuntos.setBounds(450,380,300,20);
        
        ButtonObjetoFinal.setIcon(ObjetoFinalIMG);
        ButtonObjetoFinal.setBounds(400, 200, 226, 139);
        
        ButtonConsumibles.setBounds(100,150,150,70);
        ButtonArmas.setBounds(100,250,100,70);
        ButtonSalir.setBounds(100,350,100,70);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblBackground);
        lblBackground.add(lblTitulo);
        lblBackground.add(lblEslogan);
        lblBackground.add(lblPrecioObjetoFinal);
        lblBackground.add(ButtonConsumibles);
        lblBackground.add(ButtonArmas);
        lblBackground.add(ButtonSalir);
        lblBackground.add(ButtonObjetoFinal);
        lblBackground.add(lblPuntos);

        validate();
        
        AudioPlayer.player.stop(Music.getAudio());
        Music.ShopTheme();
    }

    public static JButton getButtonConsumibles() {
        return ButtonConsumibles;
    }

    public static void setButtonConsumibles(JButton ButtonConsumibles) {
        Tienda.ButtonConsumibles = ButtonConsumibles;
    }

    public static JButton getButtonArmas() {
        return ButtonArmas;
    }

    public static void setButtonArmas(JButton ButtonArmas) {
        Tienda.ButtonArmas = ButtonArmas;
    }

    public static JButton getButtonSalir() {
        return ButtonSalir;
    }

    public static void setButtonSalir(JButton ButtonSalir) {
        Tienda.ButtonSalir = ButtonSalir;
    }

    public static JButton getButtonObjetoFinal() {
        return ButtonObjetoFinal;
    }

    public static void setButtonObjetoFinal(JButton ButtonObjetoFinal) {
        Tienda.ButtonObjetoFinal = ButtonObjetoFinal;
    }
    
}
