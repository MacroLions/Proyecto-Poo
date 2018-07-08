/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nuria
 */
public class Seleccion extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon MamaIMG = new ImageIcon("src\\Imagenes\\SelMama.png");
    ImageIcon PapaIMG = new ImageIcon("src\\Imagenes\\SelPapa.png");
    ImageIcon HermanaIMG = new ImageIcon("src\\Imagenes\\SelHija.png");
    ImageIcon HermanoIMG = new ImageIcon("src\\Imagenes\\SelHijo.png");
    static JButton ButtonMama = new JButton();
    static JButton ButtonPapa = new JButton();
    static JButton ButtonHermana = new JButton();
    static JButton ButtonHermano = new JButton();
    JLabel lblTitulo, lblMama,lblPapa, lblHermano, lblHermana;
    JLabel Background;

    public Seleccion(){
        Background = new JLabel();
        Background.setIcon(ImagenFactory.getBackground(2));
        Background.setBounds(0, 0, 800, 500);
        lblTitulo= new JLabel("SELECCION DE PERSONAJE");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.ORANGE);
        lblTitulo.setBounds(220,5,300,20);
        
        lblMama = new JLabel("CREEPY MAMA");
        lblMama.setForeground(Color.yellow);
        lblMama.setBounds(120,300,150,10);
        
        lblPapa = new JLabel("CREEPY DADDY");
        lblPapa.setForeground(Color.red);
        lblPapa.setBounds(120,50,150,10);
        
        lblHermana = new JLabel("CREEPY SIS");
        lblHermana.setForeground(Color.pink);
        lblHermana.setBounds(490,50,150,10);
        
        lblHermano = new JLabel("CREEPY BRO");
        lblHermano.setForeground(Color.blue);
        lblHermano.setBounds(490,300,150,10);
        
        ButtonMama.setIcon(MamaIMG);
        ButtonMama.setBounds(50, 320, 226, 139);
        
        ButtonPapa.setIcon(PapaIMG);
        ButtonPapa.setBounds(50, 70, 226, 139);
        
        ButtonHermana.setIcon(HermanaIMG);
        ButtonHermana.setBounds(420, 70, 226, 139);
        
        ButtonHermano.setIcon(HermanoIMG);
        ButtonHermano.setBounds(420, 320, 226, 139);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Background);
        Background.add(lblTitulo);
        Background.add(ButtonMama);
        Background.add(ButtonPapa);
        Background.add(lblPapa);
        Background.add(lblMama);
        Background.add(lblHermana);
        Background.add(lblHermano);
        Background.add(ButtonHermana);
        Background.add(ButtonHermano);

        validate();
    }

    public static JButton getButtonMama() {
        return ButtonMama;
    }

    public static void setButtonMama(JButton ButtonMama) {
        Seleccion.ButtonMama = ButtonMama;
    }

    public static JButton getButtonPapa() {
        return ButtonPapa;
    }

    public static void setButtonPapa(JButton ButtonPapa) {
        Seleccion.ButtonPapa = ButtonPapa;
    }

    public static JButton getButtonHermana() {
        return ButtonHermana;
    }

    public static void setButtonHermana(JButton ButtonHermana) {
        Seleccion.ButtonHermana = ButtonHermana;
    }

    public static JButton getButtonHermano() {
        return ButtonHermano;
    }

    public static void setButtonHermano(JButton ButtonHermano) {
        Seleccion.ButtonHermano = ButtonHermano;
    }
    
}
