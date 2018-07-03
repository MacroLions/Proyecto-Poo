/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    static JButton Start = new JButton("Start!");
    JLabel Label1,Label2;

    
    public Inicio(){
        File imageCheck = new File("src\\Imagenes\\Controls.png");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        Label1 = new JLabel("Awesome background");
        Label1.setBounds(new Rectangle(285,90,400,200));
        
        Label2 = new JLabel("Name");
        Label2.setBounds(new Rectangle(330,0,50,50));
        
        Credits.setIcon(CreditsIMG);
        Credits.setBounds(475, 360, 226, 139);
        Controls.setIcon(ControlsIMG);
        Controls.setBounds(0, 360, 226, 139);
        
        Start.setBounds(new Rectangle(250, 350,200, 100));
        
        //Events//
        /**
        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        */
                
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Credits);
        add(Controls);
        add(Start);
        add(Label1);
        add(Label2);
        validate();
    }

    public static JButton getStart() {
        return Start;
    }

    public static void setStart(JButton Start) {
        Inicio.Start = Start;
    }
    
}
