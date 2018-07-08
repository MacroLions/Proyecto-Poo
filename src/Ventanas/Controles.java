/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Melissa
 */
public class Controles extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    JLabel lblTitulo, lblSeleccion, lblAtaque, lblInventario, lblObjeto, lblInstruccion;
    static JButton buttonRegresar= new JButton("REGRESAR");
    ImageIcon instruccionIMG= new ImageIcon("src\\Imagenes\\instrucciones.jpg");
    
    public Controles(){
        lblTitulo= new JLabel("CONTROLES DE JUEGO");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setBounds(250,10,300,20);
        
        lblSeleccion= new JLabel("1. Escoge uno de los personajes de la familia para jugar");
        lblSeleccion.setBounds(50,40,400,20);
        
        lblAtaque= new JLabel("2. Presiona el boton Atacar");
        lblAtaque.setBounds(50,60,300,20);
        
        lblInventario= new JLabel("3. Presiona el boton Inventario para ir a la tienda a adquirir armas o suministros");
        lblInventario.setBounds(50,80,550,20);
        
        lblObjeto= new JLabel("4. Gana los puntos suficinetes para comprar el objeto final y derrotar al monstruo");
        lblObjeto.setBounds(50,100,550,20);
        
        lblInstruccion= new JLabel();
        lblInstruccion.setIcon(instruccionIMG);
        lblInstruccion.setBounds(170,130,375,415);
        
        buttonRegresar.setBounds(600,450,100,50);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblTitulo);
        add(lblSeleccion);
        add(lblAtaque);
        add(lblInventario);
        add(lblObjeto);
        add(lblInstruccion);
        add(buttonRegresar);
        
        validate();
    }

    public static JButton getButtonRegresar() {
        return buttonRegresar;
    }

    public static void setButtonRegresar(JButton buttonRegresar) {
        Controles.buttonRegresar = buttonRegresar;
    }
    
}
