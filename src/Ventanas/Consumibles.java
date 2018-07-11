/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Personajes.Jugador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diana
 */
public class Consumibles extends JPanel {

    public int WIDTH = 700;
    public int HEIGHT = 500;

    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonConfirmacion = new JButton("CONFIRMAR");
    static JButton ButtonCancelar = new JButton("CANCELAR");
    static JButton ButtonVolver = new JButton("VOLVER");

    JButton Button1 = new JButton("+");
    JButton Button2 = new JButton("+");
    JButton Button3 = new JButton("+");
    JButton Button4 = new JButton("+");
    JButton Button5 = new JButton("+");
    JButton Button6 = new JButton("+");
    JButton Button7 = new JButton("+");
    JButton Button8 = new JButton("+");

    //botones menos
    JButton Button11 = new JButton("-");
    JButton Button22 = new JButton("-");
    JButton Button33 = new JButton("-");
    JButton Button44 = new JButton("-");
    JButton Button55 = new JButton("-");
    JButton Button66 = new JButton("-");
    JButton Button77 = new JButton("-");
    JButton Button88 = new JButton("-");

    JTextField text1 = new JTextField("0");
    JTextField text2 = new JTextField("0");
    JTextField text3 = new JTextField("0");
    JTextField text4 = new JTextField("0");
    JTextField text5 = new JTextField("0");
    JTextField text6 = new JTextField("0");
    JTextField text7 = new JTextField("0");
    JTextField text8 = new JTextField("0");
    JTextField totalCompra = new JTextField("0");
    
    JLabel puntosJugador, total, lblBackground;
    JLabel lblTitulo, lblGalleta, lblJugo, lblPupusa, lblEmpanada, lblChocolate, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblSoda, lblLeche, lblChurro;
    int b1, b2, b3, b4, b5, b6, b7, b8;

    public Consumibles() {
        lblBackground = new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(5));
        lblBackground.setBounds(0, 0, 700, 500);

        lblTitulo = new JLabel("¡CONSUMIBLES!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.CYAN);
        lblTitulo.setBounds(250, 15, 300, 30);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblGalleta = new JLabel("Galleta 10 pts");
        lblGalleta.setFont(new Font("Arial", Font.BOLD, 16));
        lblGalleta.setForeground(Color.WHITE);
        lblGalleta.setBounds(50, 100, 400, 20);

        Button1.setBounds(240, 100, 100, 20);
        Button2.setBounds(240, 130, 100, 20);
        Button3.setBounds(240, 160, 100, 20);
        Button4.setBounds(240, 190, 100, 20);
        Button5.setBounds(240, 220, 100, 20);
        Button6.setBounds(240, 250, 100, 20);
        Button7.setBounds(240, 280, 100, 20);
        Button8.setBounds(240, 310, 100, 20);

        text1.setBounds(362, 100, 60, 20);
        text2.setBounds(362, 130, 60, 20);
        text3.setBounds(362, 160, 60, 20);
        text4.setBounds(362, 190, 60, 20);
        text5.setBounds(362, 220, 60, 20);
        text6.setBounds(362, 250, 60, 20);
        text7.setBounds(362, 280, 60, 20);
        text8.setBounds(362, 310, 60, 20);

        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        text6.setEditable(false);
        text7.setEditable(false);
        text8.setEditable(false);
        
        lblJugo = new JLabel("Jugo 20 pts");
        lblJugo.setFont(new Font("Arial", Font.BOLD, 16));
        lblJugo.setForeground(Color.WHITE);
        lblJugo.setBounds(50, 130, 400, 20);

        Button11.setBounds(440, 100, 100, 20);
        Button22.setBounds(440, 130, 100, 20);
        Button33.setBounds(440, 160, 100, 20);
        Button44.setBounds(440, 190, 100, 20);
        Button55.setBounds(440, 220, 100, 20);
        Button66.setBounds(440, 250, 100, 20);
        Button77.setBounds(440, 280, 100, 20);
        Button88.setBounds(440, 310, 100, 20);

        lblPupusa = new JLabel("Pupusa 30 pts");
        lblPupusa.setFont(new Font("Arial", Font.BOLD, 16));
        lblPupusa.setForeground(Color.WHITE);
        lblPupusa.setBounds(50, 160, 400, 20);

        lblEmpanada = new JLabel("Empanada 25 pts");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD, 16));
        lblEmpanada.setForeground(Color.WHITE);
        lblEmpanada.setBounds(50, 190, 400, 20);

        //consumibles ubicados a la derecha
        lblSoda = new JLabel("Soda 40 pts");
        lblSoda.setFont(new Font("Arial", Font.BOLD, 16));
        lblSoda.setForeground(Color.WHITE);
        lblSoda.setBounds(50, 220, 400, 20);

        lblLeche = new JLabel("Leche 40 pts");
        lblLeche.setFont(new Font("Arial", Font.BOLD, 16));
        lblLeche.setForeground(Color.WHITE);
        lblLeche.setBounds(50, 250, 400, 20);

        lblChurro = new JLabel("Churro 10 pts");
        lblChurro.setFont(new Font("Arial", Font.BOLD, 16));
        lblChurro.setForeground(Color.WHITE);
        lblChurro.setBounds(50, 280, 400, 20);

        lblChocolate = new JLabel("Chocolate 15 pts");
        lblChocolate.setFont(new Font("Arial", Font.BOLD, 16));
        lblChocolate.setForeground(Color.WHITE);
        lblChocolate.setBounds(50, 310, 400, 20);

        total = new JLabel("Total de compra:");
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setForeground(Color.WHITE);
        total.setBounds(350, 340, 200, 20);
        
        totalCompra.setBounds(485, 340, 70, 20);
        totalCompra.setEditable(false);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setForeground(Color.WHITE);
        puntosJugador.setBounds(50, 375, 125, 75);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
        
        //+ Y -
        //+
        SumaoResta(Button1,text1,true,10);
        SumaoResta(Button2,text2,true,20);
        SumaoResta(Button3,text3,true,30);
        SumaoResta(Button4,text4,true,25);
        SumaoResta(Button5,text5,true,40);
        SumaoResta(Button6,text6,true,40);
        SumaoResta(Button7,text7,true,10);
        SumaoResta(Button8,text8,true,15);
        //-
        SumaoResta(Button11,text1,false,10);
        SumaoResta(Button22,text2,false,20);
        SumaoResta(Button33,text3,false,30);
        SumaoResta(Button44,text4,false,25);
        SumaoResta(Button55,text5,false,40);
        SumaoResta(Button66,text6,false,40);
        SumaoResta(Button77,text7,false,10);
        SumaoResta(Button88,text8,false,15);

        //BOTONES DE FUNCION
        ButtonConfirmacion.setBounds(400, 390, 125, 75);
        ButtonCancelar.setBounds(540, 390, 125, 75);
        ButtonVolver.setBounds(290, 390, 100, 75);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblBackground);
        lblBackground.add(lblTitulo);
        lblBackground.add(lblGalleta);
        lblBackground.add(Button1);
        lblBackground.add(Button2);
        lblBackground.add(Button3);
        lblBackground.add(Button4);
        lblBackground.add(Button5);
        lblBackground.add(Button6);
        lblBackground.add(Button7);
        lblBackground.add(Button8);

        lblBackground.add(Button11);
        lblBackground.add(Button22);
        lblBackground.add(Button33);
        lblBackground.add(Button44);
        lblBackground.add(Button55);
        lblBackground.add(Button66);
        lblBackground.add(Button77);
        lblBackground.add(Button88);

        lblBackground.add(lblJugo);
        lblBackground.add(total);
        lblBackground.add(totalCompra);
        lblBackground.add(lblPupusa);
        lblBackground.add(lblEmpanada);
        lblBackground.add(lblChocolate);
        lblBackground.add(lblSoda);
        lblBackground.add(lblLeche);
        lblBackground.add(lblChurro);

        //agregando botones 
        lblBackground.add(ButtonConfirmacion);
        lblBackground.add(ButtonCancelar);
        lblBackground.add(puntosJugador);
        lblBackground.add(ButtonVolver);
        lblBackground.add(text1);
        lblBackground.add(text2);
        lblBackground.add(text3);
        lblBackground.add(text4);
        lblBackground.add(text5);
        lblBackground.add(text6);
        lblBackground.add(text7);
        lblBackground.add(text8);
        

        validate();
    }

    public static JButton getButtonCancelar() {
        return ButtonCancelar;
    }

    public static void setButtonCancelar(JButton ButtonCancelar) {
        Consumibles.ButtonCancelar = ButtonCancelar;
    }

    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Consumibles.ButtonVolver = ButtonVolver;
    }
    
    private void SumaoResta(JButton B, JTextField TF,boolean flag,int precio){
        if(flag){
            B.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    TF.setText(Integer.toString(Integer.parseInt(TF.getText())+1));
                    totalCompra.setText(Integer.toString(Integer.parseInt(totalCompra.getText())+Integer.parseInt(TF.getText())*precio));
                }
            });
        }else{
            B.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(Integer.parseInt(TF.getText())!=0){
                        totalCompra.setText(Integer.toString(Integer.parseInt(totalCompra.getText())-Integer.parseInt(TF.getText())*precio));
                        TF.setText(Integer.toString(Integer.parseInt(TF.getText())-1));
                    }
                }
            });
        }
    }
}
