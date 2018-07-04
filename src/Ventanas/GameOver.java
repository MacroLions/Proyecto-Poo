/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author UCA
 */
public class GameOver extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon GOIMG = new ImageIcon("src\\Imagenes\\GameOver.png");
    JButton GOButton = new JButton();
    JLabel GO = new JLabel();

    public GameOver(){
        File imageCheck = new File("src\\Imagenes\\GameOver.png");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        
        GO.setIcon(GOIMG);
        GO.setBounds(50,10,590,400);
        
        GOButton.setText("Reintentar");
        GOButton.setBounds(300, 420, 100, 50);
      
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(GO);
        add(GOButton);


        validate();
    }
    
}

