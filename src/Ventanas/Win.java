/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import SFX.Music;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;

/**
 *
 * @author ricky
 */
public class Win extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon WinIMG = new ImageIcon("src\\Imagenes\\YouWin.png");
    JButton WinButton = new JButton();
    JLabel Win = new JLabel();

    public Win(){
        File imageCheck = new File("src\\Imagenes\\YouWin.png");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        
        Win.setIcon(WinIMG);
        Win.setBounds(0,0,700,500);
        
        WinButton.setText("Reintentar");
        WinButton.setBounds(300, 420, 100, 50);
      
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Win);
        add(WinButton);
  
        validate();
        //AudioPlayer.player.stop(Music.getAudio());
        //Music.GameOverTheme();
    }    
}
