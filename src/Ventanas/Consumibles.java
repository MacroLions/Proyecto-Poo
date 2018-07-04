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
 * @author Diana
 */
public class Consumibles extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonConfirmacion = new JButton("CONFIRMAR");
    static JButton ButtonCancelar = new JButton("CANCELAR");
    static JButton ButtonVolver = new JButton("VOLVER");
    static JButton ButtonGalleta = new JButton("10 pts");
    static JButton ButtonJugo = new JButton("20 pts");
    static JButton ButtonPupusa = new JButton("25 pts");
    JLabel lblTitulo, lblGalleta, lblJugo, lblPupusa, lblLista_objetos, lblPuntos_acumulados;

    public Consumibles(){
        
        lblTitulo= new JLabel("¡CONSUMIBLES!");
        lblTitulo.setFont(new Font("Arial",Font.BOLD,20));
        lblTitulo.setBounds(275,10,200,20);
        
        lblGalleta= new JLabel("Galleta");
        lblGalleta.setBounds(50, 100, 390, 20);
        
        ButtonGalleta.setBounds(100,100,75,20);
        
        lblJugo= new JLabel("Jugo");
        lblJugo.setBounds(50, 150, 390, 20);
        
        ButtonJugo.setBounds(100,150,75,20);
        
        lblPupusa= new JLabel("Pupusa");
        lblPupusa.setBounds(50, 200, 390, 20);
        
        ButtonPupusa.setBounds(100,200,75,20);
        
        ButtonConfirmacion.setBounds(400,375,125,75);
        ButtonCancelar.setBounds(540,375,125,75);
        ButtonVolver.setBounds(150,250,100,70);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(lblTitulo);
        add(lblGalleta);
        add(ButtonGalleta);
        add(lblJugo);
        add(ButtonJugo);
        add(lblPupusa);
        add(ButtonPupusa);
        add(ButtonConfirmacion);
        add(ButtonCancelar);

        validate();
    }
}
