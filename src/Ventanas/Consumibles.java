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
    static JButton ButtonGalleta = new JButton("10 pts");
    static JButton ButtonJugo = new JButton("20 pts");
    static JButton ButtonPupusa = new JButton("30 pts");
    static JButton ButtonEmpanada = new JButton("25 pts");
    static JButton ButtonChocolate = new JButton("15 pts");
    static JButton ButtonSoda = new JButton("40 pts");
    static JButton ButtonLeche = new JButton("40 pts");
    static JButton ButtonChurro = new JButton("10 pts");
    //No es necesario que los objetos en ventan sean estaticos, solamente confirmacion y cancelar para regresara a la pantalla anterior
    //Los otros no son necesarios porque la lista de consumbiles de ljugador ES LA QUE DEBE SER STATIC para ser modificada.
    //ALGUNOS BOTONES NO HAN SIDO AGREGADOS, POR FAVOR GUARDE LA PACIENCIA PARA HACER ADD LUEGO NOS VA A PASAR LO MISMO QUE EL MODPACKS();
    //Fakiu
    JLabel puntosJugador;
    JLabel lblTitulo, lblGalleta, lblJugo, lblPupusa, lblEmpanada, lblChocolate, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblSoda, lblLeche, lblChurro;

    public Consumibles() {

        lblTitulo = new JLabel("¡CONSUMIBLES!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(275, 10, 200, 20);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblGalleta = new JLabel("Galleta");
        lblGalleta.setFont(new Font("Arial", Font.BOLD, 25));
        lblGalleta.setBounds(50, 98, 400, 30);

        ButtonGalleta.setBounds(180, 100, 75, 30);

        lblJugo = new JLabel("Jugo");
        lblJugo.setFont(new Font("Arial", Font.BOLD, 25));
        lblJugo.setBounds(50, 150, 400, 30);

        ButtonJugo.setBounds(180, 148, 75, 30);

        lblPupusa = new JLabel("Pupusa");
        lblPupusa.setFont(new Font("Arial", Font.BOLD, 25));
        lblPupusa.setBounds(50, 200, 400, 30);

        ButtonPupusa.setBounds(180, 198, 75, 30);

        lblEmpanada = new JLabel("Empanada");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD, 25));
        lblEmpanada.setBounds(50, 250, 400, 30);

        ButtonEmpanada.setBounds(180, 248, 75, 30);

        //consumibles ubicados a la derecha
        lblSoda = new JLabel("Soda");
        lblSoda.setFont(new Font("Arial", Font.BOLD, 25));
        lblSoda.setBounds(375, 98, 400, 30);

        ButtonSoda.setBounds(500, 100, 75, 30);

        lblLeche = new JLabel("Leche");
        lblLeche.setFont(new Font("Arial", Font.BOLD, 25));
        lblLeche.setBounds(375, 150, 400, 30);

        ButtonLeche.setBounds(500, 148, 75, 30);
        
        lblChurro = new JLabel("Churro");
        lblChurro.setFont(new Font("Arial", Font.BOLD, 25));
        lblChurro.setBounds(375, 200, 400, 30);

        ButtonChurro.setBounds(500, 198, 75, 30);
        
        lblChocolate = new JLabel("Chocolate");
        lblChocolate.setFont(new Font("Arial", Font.BOLD, 25));
        lblChocolate.setBounds(375, 250, 400, 30);

        ButtonChocolate.setBounds(500, 248, 75, 30);
        
        puntosJugador = new JLabel("Puntos: "+Jugador.getPuntos());
        puntosJugador.setBounds(200, 375, 125, 75);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
        //BOTONES DE FUNCION
        ButtonConfirmacion.setBounds(400, 375, 125, 75);
        ButtonCancelar.setBounds(540, 375, 125, 75);
        ButtonVolver.setBounds(150, 250, 100, 70);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblTitulo);
        add(lblGalleta);
        add(ButtonGalleta);
        add(lblJugo);
        add(ButtonJugo);
        add(lblPupusa);
        add(lblEmpanada);
        add(lblChocolate);
        add(lblSoda);
        add(lblLeche);
        add(lblChurro);

        //agregando botones 
        add(ButtonPupusa);
        add(ButtonChocolate);
        add(ButtonEmpanada);
        add(ButtonConfirmacion);
        add(ButtonCancelar);
        add(ButtonSoda);
        add(ButtonLeche);
        add(ButtonChurro);
        add(puntosJugador);

        validate();
    }
}
