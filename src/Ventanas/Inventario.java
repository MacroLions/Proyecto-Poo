/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nuria
 */
public class Inventario extends JPanel{
    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    JLabel lblBackground, lblTitulo, lblGalleta, lblJugo, lblPupusa, lblEmpanada, lblSoda, lblLeche, lblChurro, lblChocolate;
    static JButton ButtonVolver;
    JTextField txtGalleta, txtJugo, txtPupusa, txtEmpanada, txtSoda, txtLeche, txtChurro, txtChocolate;

    public Inventario() {
        lblBackground= new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(6));
        lblBackground.setBounds(0,0,700,500);
        
        lblTitulo= new JLabel("¡INVENTARIO!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD,30));
        lblTitulo.setForeground(Color.YELLOW);
        lblTitulo.setBounds(250,15,200,30);
        
        lblGalleta= new JLabel("Galleta (+10HP): ");
        lblGalleta.setFont(new Font("Arial", Font.BOLD,20));
        lblGalleta.setForeground(Color.WHITE);
        lblGalleta.setBounds(100,50,200,20);
        
        lblJugo= new JLabel("Jugo (+20HP): ");
        lblJugo.setFont(new Font("Arial", Font.BOLD,20));
        lblJugo.setForeground(Color.WHITE);
        lblJugo.setBounds(100,100,200,20);
        
        lblPupusa= new JLabel("Pupusa (+30HP): ");
        lblPupusa.setFont(new Font("Arial", Font.BOLD,20));
        lblPupusa.setForeground(Color.WHITE);
        lblPupusa.setBounds(100,150,200,20);
        
        lblEmpanada= new JLabel("Empanada (+25HP): ");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD,20));
        lblEmpanada.setForeground(Color.WHITE);
        lblEmpanada.setBounds(100,200,200,20);
        
        lblSoda= new JLabel("Soda (+30HP): ");
        lblSoda.setFont(new Font("Arial", Font.BOLD,20));
        lblSoda.setForeground(Color.WHITE);
        lblSoda.setBounds(100,250,200,20);
        
        lblLeche= new JLabel("Leche (+50HP): ");
        lblLeche.setFont(new Font("Arial", Font.BOLD,20));
        lblLeche.setForeground(Color.WHITE);
        lblLeche.setBounds(100,300,200,20);
        
        lblChurro= new JLabel("Churro (+05HP): ");
        lblChurro.setFont(new Font("Arial", Font.BOLD,20));
        lblChurro.setForeground(Color.WHITE);
        lblChurro.setBounds(100,350,200,20);
        
        lblChocolate= new JLabel("Chocolate (+15HP): ");
        lblChocolate.setFont(new Font("Arial", Font.BOLD,20));
        lblChocolate.setForeground(Color.WHITE);
        lblChocolate.setBounds(100,400,200,20);
        
        txtGalleta= new JTextField();
        txtGalleta.setBounds(205,50,200,20);
        
        txtJugo= new JTextField();
        txtJugo.setBounds(205,100,200,20);
        
        txtPupusa= new JTextField();
        txtPupusa.setBounds(205,150,200,20);
        
        txtEmpanada= new JTextField();
        txtEmpanada.setBounds(205,200,200,20);
        
        txtSoda= new JTextField();
        txtSoda.setBounds(205,250,200,20);
        
        txtLeche= new JTextField();
        txtLeche.setBounds(205,300,200,20);
        
        txtChurro= new JTextField();
        txtChurro.setBounds(205,350,200,20);
        
        txtChocolate= new JTextField();
        txtChocolate.setBounds(205,400,200,20);
        
        ButtonVolver= new JButton("VOLVER");
        ButtonVolver.setBounds(400,450,200,50);
        
        txtGalleta.setEditable(false);
        txtJugo.setEditable(false);        
        txtPupusa.setEditable(false);
        txtEmpanada.setEditable(false);
        txtSoda.setEditable(false);
        txtLeche.setEditable(false);
        txtChurro.setEditable(false);
        txtChocolate.setEditable(false);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblBackground);
        lblBackground.add(lblTitulo);
        lblBackground.add(lblGalleta);
        lblBackground.add(lblJugo);
        lblBackground.add(lblPupusa);
        lblBackground.add(lblEmpanada);
        lblBackground.add(lblSoda);
        lblBackground.add(lblLeche);
        lblBackground.add(lblChurro);
        lblBackground.add(lblChocolate);
        
        lblBackground.add(txtGalleta);
        lblBackground.add(txtJugo);
        lblBackground.add(txtPupusa);
        lblBackground.add(txtEmpanada);
        lblBackground.add(txtSoda);
        lblBackground.add(txtLeche);
        lblBackground.add(txtChurro);
        lblBackground.add(txtChocolate);
        
        lblBackground.add(ButtonVolver);
        
        validate();
    }

    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Inventario.ButtonVolver = ButtonVolver;
    }
}
