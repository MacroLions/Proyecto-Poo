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
    static JButton ButtonMas = new JButton("+");
    static JButton ButtonMenos = new JButton("-");
    ;
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

        ButtonMas.setBounds(240, 100, 50, 20);

        lblJugo = new JLabel("Jugo 20 pts");
        lblJugo.setFont(new Font("Arial", Font.BOLD, 16));
        lblJugo.setBounds(50, 120, 400, 20);

        ButtonMenos.setBounds(440, 100, 50, 20);

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

        total= new JLabel("Total de compra ");
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setBounds(350,300, 200, 20);
        
        puntosJugador = new JLabel("Puntos: "+Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD,16));
        puntosJugador.setBounds(100, 375, 125, 75);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
        //BOTONES DE FUNCION
        ButtonConfirmacion.setBounds(400, 375, 125, 75);
        ButtonCancelar.setBounds(540, 375, 125, 75);
        

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblTitulo);
        add(lblGalleta);
        add(ButtonMas);
        add(lblJugo);
        add(total);
        add(lblPupusa);
        add(lblEmpanada);
        add(lblChocolate);
        add(lblSoda);
        add(lblLeche);
        add(lblChurro);

        //agregando botones 
        
        add(ButtonConfirmacion);
        add(ButtonCancelar);
        add(ButtonMenos);
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
