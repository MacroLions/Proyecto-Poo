/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Personajes.Jugador;
import java.awt.Dimension;
import java.awt.Font;
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

    //No es necesario que los objetos en ventan sean estaticos, solamente confirmacion y cancelar para regresara a la pantalla anterior
    //Los otros no son necesarios porque la lista de consumbiles de ljugador ES LA QUE DEBE SER STATIC para ser modificada.
    //ALGUNOS BOTONES NO HAN SIDO AGREGADOS, POR FAVOR GUARDE LA PACIENCIA PARA HACER ADD LUEGO NOS VA A PASAR LO MISMO QUE EL MODPACKS();
    //Fakiu
    JLabel puntosJugador, total;
    JLabel lblTitulo, lblGalleta, lblJugo, lblPupusa, lblEmpanada, lblChocolate, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblSoda, lblLeche, lblChurro;

    public Consumibles() {

        lblTitulo = new JLabel("¡CONSUMIBLES!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(275, 10, 200, 20);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblGalleta = new JLabel("Galleta 10 pts");
        lblGalleta.setFont(new Font("Arial", Font.BOLD, 16));
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

        lblJugo = new JLabel("Jugo 20 pts");
        lblJugo.setFont(new Font("Arial", Font.BOLD, 16));
        lblJugo.setBounds(50, 120, 400, 20);

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
        lblPupusa.setBounds(50, 140, 400, 20);

        lblEmpanada = new JLabel("Empanada 25");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD, 16));
        lblEmpanada.setBounds(50, 160, 400, 20);

        //consumibles ubicados a la derecha
        lblSoda = new JLabel("Soda 40 pts");
        lblSoda.setFont(new Font("Arial", Font.BOLD, 16));
        lblSoda.setBounds(50, 180, 400, 20);

        lblLeche = new JLabel("Leche 40 pts");
        lblLeche.setFont(new Font("Arial", Font.BOLD, 16));
        lblLeche.setBounds(50, 200, 400, 20);

        lblChurro = new JLabel("Churro 10 pts");
        lblChurro.setFont(new Font("Arial", Font.BOLD, 16));
        lblChurro.setBounds(50, 220, 400, 20);

        lblChocolate = new JLabel("Chocolate 15 pts");
        lblChocolate.setFont(new Font("Arial", Font.BOLD, 16));
        lblChocolate.setBounds(50, 240, 400, 20);

        total = new JLabel("Total de compra ");
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setBounds(350, 340, 200, 20);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setBounds(100, 375, 125, 75);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
        //BOTONES DE FUNCION
        ButtonConfirmacion.setBounds(400, 375, 125, 75);
        ButtonCancelar.setBounds(540, 375, 125, 75);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblTitulo);
        add(lblGalleta);
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

        add(lblJugo);
        add(total);
        add(lblPupusa);
        add(lblEmpanada);
        add(lblChocolate);
        add(lblSoda);
        add(lblLeche);
        add(lblChurro);

        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(text6);
        add(text7);
        add(text8);

        //agregando botones 
        add(ButtonConfirmacion);
        add(ButtonCancelar);
        add(puntosJugador);

        validate();
    }

    public static JButton getButtonCancelar() {
        return ButtonCancelar;
    }

    public static void setButtonCancelar(JButton ButtonCancelar) {
        Consumibles.ButtonCancelar = ButtonCancelar;
    }

}
