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
    static JButton ContinueButton = new JButton();
    JButton ButtonSalir = new JButton();
    JLabel Wins = new JLabel();

    public Win(){
        File imageCheck = new File("src\\Imagenes\\YouWin.png");
        if(imageCheck.exists()){
            System.out.println("Image file found!");
        }else{
            System.out.println("Image file not found!");
        }
        
        Wins.setIcon(WinIMG);
        Wins.setBounds(0,0,700,500);
        
        ContinueButton.setText("Continuar");
        ContinueButton.setBounds(400, 420, 100, 50);
        
        ButtonSalir.setText("Salir");
        ButtonSalir.setBounds(200, 420, 100, 50);      
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Wins);
        add(ContinueButton);
        add(ButtonSalir);
  
        validate();
        AudioPlayer.player.stop(Music.getAudio());
        Music.ShopTheme();
        
        ButtonSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }            
        });
        
    }

    public static JButton getContinueButton() {
        return ContinueButton;
    }

    public static void setContinueButton(JButton ContinueButton) {
        Win.ContinueButton = ContinueButton;
    }
}
