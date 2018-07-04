/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
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
    
    ImageIcon MamaIMG = new ImageIcon("src\\Imagenes\\mamacreepy.jpg");
    ImageIcon PapaIMG = new ImageIcon("src\\Imagenes\\papacreepy.jpg");
    ImageIcon HermanaIMG = new ImageIcon("src\\Imagenes\\hijacreepy.png");
    ImageIcon HermanoIMG = new ImageIcon("src\\Imagenes\\hijocreepy.png");
    static JButton ButtonMama = new JButton();
    static JButton ButtonPapa = new JButton();
    static JButton ButtonHermana = new JButton();
    static JButton ButtonHermano = new JButton();
    JLabel lblTitulo, lblMama,lblPapa, lblHermano, lblHermana;

    public Seleccion(){
        File imageCheck = new File("src\\Imagenes\\mamacreepy.jpg");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        
        lblTitulo= new JLabel("SELECCION DE PERSONAJE");
        lblTitulo.setBounds(285,10,200,10);
        
        lblMama = new JLabel("CREEPY MAMA");
        lblMama.setBounds(100,300,150,10);
        
        lblPapa = new JLabel("CREEPY DADDY");
        lblPapa.setBounds(100,50,150,10);
        
        lblHermana = new JLabel("CREEPY SIS");
        lblHermana.setBounds(430,50,150,10);
        
        lblHermano = new JLabel("CREEPY BRO");
        lblHermano.setBounds(430,300,150,10);
        
        ButtonMama.setIcon(MamaIMG);
        ButtonMama.setBounds(50, 320, 226, 139);
        
        ButtonPapa.setIcon(PapaIMG);
        ButtonPapa.setBounds(50, 70, 226, 139);
        
        ButtonHermana.setIcon(HermanaIMG);
        ButtonHermana.setBounds(375, 70, 226, 139);
        
        ButtonHermano.setIcon(HermanoIMG);
        ButtonHermano.setBounds(375, 320, 226, 139);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblTitulo);
        add(ButtonMama);
        add(ButtonPapa);
        add(lblPapa);
        add(lblMama);
        add(lblHermana);
        add(lblHermano);
        add(ButtonHermana);
        add(ButtonHermano);

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
