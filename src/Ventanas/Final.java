/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nuria
 */
public class Final extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    static JButton ButtonMenu = new JButton("MENU");
    static JButton ButtonSalir = new JButton("SALIR");
    JLabel lblTitulo, lblDianita, lblRichard, lblMai, lblNuria, lblFin;

    public Final(){
        
        lblTitulo= new JLabel("CREDITOS A: ");
        lblTitulo.setFont(new Font("Arial",Font.BOLD,20));
        lblTitulo.setBounds(550,50,200,20);
        
        lblDianita= new JLabel("DIANA ALFARO");
        lblDianita.setBounds(550, 100, 390, 20);
        
        lblRichard = new JLabel("RICARDO PEREZ");
        lblRichard.setBounds(550,150,200,20);
        
        lblMai = new JLabel("MAITREYI PEREZ");
        lblMai.setBounds(550,200,200,20);
        
        lblNuria = new JLabel("NURIA RIVAS");
        lblNuria.setBounds(550,250,200,20);
        
        lblFin = new JLabel(ImagenFactory.getImagen(5));
        lblFin.setBounds(10,150,400,400);
        
        ButtonMenu.setBounds(550,400,100,40);
        ButtonSalir.setBounds(550,450,100,40);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblTitulo);
        add(lblDianita);
        add(lblRichard);
        add(ButtonMenu);
        add(lblMai);
        add(ButtonSalir);
        add(lblNuria);
        add(lblFin);

        validate();
    }

    public static JButton getButtonMenu() {
        return ButtonMenu;
    }

    public static void setButtonMenu(JButton ButtonMenu) {
        Final.ButtonMenu = ButtonMenu;
    }

    public static JButton getButtonSalir() {
        return ButtonSalir;
    }

    public static void setButtonSalir(JButton ButtonSalir) {
        Final.ButtonSalir = ButtonSalir;
    }
    
}
