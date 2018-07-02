/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Maishi
 */
public class Inicio extends JPanel {
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon CreditsIMG = new ImageIcon("src\\Imagenes\\Credits.png");
    JButton Credits = new JButton();
    ImageIcon ControlsIMG = new ImageIcon("src\\Imagenes\\Controls.png");
    JButton Controls = new JButton();

    
    public Inicio(){
        File imageCheck = new File("src\\Imagenes\\Controls.png");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        
        Credits.setIcon(CreditsIMG);
        Controls.setIcon(ControlsIMG);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Credits);
        add(Controls);
        validate();
    }
    
}
