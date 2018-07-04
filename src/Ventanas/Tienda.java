/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

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
public class Tienda extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonConsumibles = new JButton("CONSUMIBLES");
    static JButton ButtonArmas = new JButton("ARMAS");
    static JButton ButtonSalir = new JButton("SALIR");
    static JButton ButtonObjetoFinal = new JButton();
    JLabel lblTitulo, lblEslogan, lblPrecioObjetoFinal;

    public Tienda(){
        
        lblTitulo= new JLabel("¡TIENDA GAMAZON!");
        lblTitulo.setFont(new Font("Arial",Font.BOLD,20));
        lblTitulo.setBounds(275,10,200,20);
        
        lblEslogan= new JLabel("Donde puedes comprar todo lo que necesitas para destruir");
        lblEslogan.setBounds(200, 25, 390, 20);
        
        lblPrecioObjetoFinal = new JLabel("El precio del objeto es: $1000");
        lblPrecioObjetoFinal.setBounds(450,150,200,20);
        
        ButtonObjetoFinal.setIcon(ObjetoFinalIMG);
        ButtonObjetoFinal.setBounds(425, 200, 226, 139);
        
        ButtonConsumibles.setBounds(50,100,150,70);
        ButtonArmas.setBounds(250,100,100,70);
        ButtonSalir.setBounds(150,250,100,70);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblTitulo);
        add(lblEslogan);
        add(lblPrecioObjetoFinal);
        add(ButtonConsumibles);
        add(ButtonArmas);
        add(ButtonSalir);
        add(ButtonObjetoFinal);

        validate();
    }
}
