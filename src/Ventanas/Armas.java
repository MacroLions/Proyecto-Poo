/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diana
 */
public class Armas extends JPanel{

    public int WIDTH = 700;
    public int HEIGHT = 500;

    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonConfirmacion = new JButton("CONFIRMAR");
    static JButton ButtonCancelar = new JButton("CANCELAR");
    static JButton ButtonVolver = new JButton("VOLVER");
    static JButton ButtonChancla = new JButton("10 pts");
    static JButton ButtonCincho = new JButton("20 pts");
    static JButton ButtonZapato = new JButton("40 pts");
    static JButton ButtonChiliyo = new JButton("10 pts");
    static JButton ButtonAlmohada = new JButton("3 pts");
    static JButton ButtonPantunfla = new JButton("8 pts");
    static JButton ButtonBolson = new JButton("13 pts");
    static JButton ButtonCartera = new JButton("20 pts");

    JLabel lblTitulo, lblChancla, lblCincho, lblZapato, lblChiliyo, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblAlmohada, lblPantunfla, lblCartera, lblBolson;

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

    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();
    JTextField text8 = new JTextField();

    public Armas() {

        lblTitulo = new JLabel("¡ARMAS!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(275, 10, 200, 20);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblChancla = new JLabel("Chancla 10 pts");
        lblChancla.setFont(new Font("Arial", Font.BOLD, 15));
        lblChancla.setBounds(50, 90, 400, 30);

        lblCincho = new JLabel("Cincho 20 pts");
        lblCincho.setFont(new Font("Arial", Font.BOLD, 15));
        lblCincho.setBounds(50, 120, 400, 30);

        lblChiliyo = new JLabel("Chiliyo 40 pts");
        lblChiliyo.setFont(new Font("Arial", Font.BOLD, 15));
        lblChiliyo.setBounds(50, 155, 400, 30);

        lblZapato = new JLabel("Zapato 50 pts");
        lblZapato.setFont(new Font("Arial", Font.BOLD, 15));
        lblZapato.setBounds(50, 185, 400, 30);

        //consumibles ubicados a la derecha
        lblAlmohada = new JLabel("Almohada 5 pts");
        lblAlmohada.setFont(new Font("Arial", Font.BOLD, 15));
        lblAlmohada.setBounds(50, 215, 400, 30);

        lblPantunfla = new JLabel("Pantunfla 15 pts");
        lblPantunfla.setFont(new Font("Arial", Font.BOLD, 15));
        lblPantunfla.setBounds(50, 245, 400, 30);

        lblCartera = new JLabel("Cartera 35 pts");
        lblCartera.setFont(new Font("Arial", Font.BOLD, 15));
        lblCartera.setBounds(50, 275, 400, 30);

        lblBolson = new JLabel("Bolson 35 pts");
        lblBolson.setFont(new Font("Arial", Font.BOLD, 15));
        lblBolson.setBounds(50, 306, 400, 30);
        
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

        Button11.setBounds(440, 100, 100, 20);
        Button22.setBounds(440, 130, 100, 20);
        Button33.setBounds(440, 160, 100, 20);
        Button44.setBounds(440, 190, 100, 20);
        Button55.setBounds(440, 220, 100, 20);
        Button66.setBounds(440, 250, 100, 20);
        Button77.setBounds(440, 280, 100, 20);
        Button88.setBounds(440, 310, 100, 20);

        //TERMINAN LOS BOTONES DE ARMAS
        //BOTONES DE FUNCION 
        ButtonConfirmacion.setBounds(400, 375, 125, 75);
        ButtonCancelar.setBounds(540, 375, 125, 75);
        ButtonVolver.setBounds(150, 250, 100, 70);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblTitulo);
        add(lblChancla);
        add(lblZapato);
        add(lblChiliyo);
        add(lblCincho);
        add(lblAlmohada);
        add(lblPantunfla);
        add(lblCartera);
        add(lblBolson);

        //agregando botones 
        add(ButtonConfirmacion);
        add(ButtonCancelar);
        add(Button1);
        add(Button2);
        add(Button3);
        add(Button4);
        add(Button5);
        add(Button6);
        add(Button7);
        add(Button8);

        add(Button11);
        add(Button22);
        add(Button33);
        add(Button44);
        add(Button55);
        add(Button66);
        add(Button77);
        add(Button88);

        add(text1);
        text1.setEditable(false);
        add(text2);
        text2.setEditable(false);
        add(text3);
        text3.setEditable(false);
        add(text4);
        text4.setEditable(false);
        add(text5);
        text5.setEditable(false);
        add(text6);
        text6.setEditable(false);
        add(text7);
        text7.setEditable(false);
        add(text8);
        text8.setEditable(false);
        
        ButtonCincho.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCincho.setEnabled(false);
            }
        });
        
        ButtonAlmohada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonAlmohada.setEnabled(false);
            }
        });
        
        ButtonChancla.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonChancla.setEnabled(false);
            }
        });
        
        ButtonZapato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonZapato.setEnabled(false);
            }
        });
        
        ButtonChiliyo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonChiliyo.setEnabled(false);
            }
        });
        
        ButtonConfirmacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //se debe agregar aqui que se pague y que se guarden las armas compradas en el inventario.
                
            }
        });
        
        ButtonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Total = 0
                
                ButtonCincho.setEnabled(true);
                ButtonAlmohada.setEnabled(true);
                ButtonChancla.setEnabled(true);
                ButtonZapato.setEnabled(true);
                ButtonChiliyo.setEnabled(true);
                ButtonVolver.setEnabled(true);
                ButtonCartera.setEnabled(true);
                ButtonBolson.setEnabled(true);
                ButtonPantunfla.setEnabled(true);                                
            }
        });
 
        ButtonCartera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCartera.setEnabled(false);
            }
        });
        
        ButtonBolson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonBolson.setEnabled(false);
            }
        });
        
        ButtonPantunfla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPantunfla.setEnabled(false);
            }
        });
  
        validate();
        
    }

    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Consumibles.ButtonVolver = ButtonVolver;
    }
        
}
