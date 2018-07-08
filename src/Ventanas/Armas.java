/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Personajes.Jugador;
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
import poo.project.Auxiliar;

/**
 *
 * @author Diana
 */
public class Armas extends JPanel {

    public int WIDTH = 700;
    public int HEIGHT = 500;

    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    static JButton ButtonCancelar = new JButton("CANCELAR");
    static JButton ButtonVolver = new JButton("VOLVER");
    static JButton ButtonChancla = new JButton("Chancla 10 pts");
    static JButton ButtonCincho = new JButton("Cincho 20 pts");
    static JButton ButtonChiliyo = new JButton("Chiliyo 40 pts");
    static JButton ButtonZapato = new JButton("Zapato 50 pts");
    static JButton ButtonAlmohada = new JButton("Almohada 5 pts");
    static JButton ButtonPantunfla = new JButton("Pantunfla 15 pts");
    static JButton ButtonCartera = new JButton("Cartera 35 pts");
    static JButton ButtonBolson = new JButton("Bolson 35 pts");

    JLabel lblTitulo;
    JLabel puntosJugador, total;

    public Armas() {

        lblTitulo = new JLabel("¡ARMAS!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(275, 10, 200, 20);

        //EMPIEZAN LOS BOTONES PARA OBTENER ARMAS
        ButtonChancla.setBounds(120, 100, 150, 50);
        ButtonCincho.setBounds(120, 160, 150, 50);
        ButtonChiliyo.setBounds(120, 220, 150, 50);
        ButtonZapato.setBounds(120, 280, 150, 50);
        ButtonAlmohada.setBounds(420, 100, 150, 50);
        ButtonPantunfla.setBounds(420, 160, 150, 50);
        ButtonCartera.setBounds(420, 220, 150, 50);
        ButtonBolson.setBounds(420, 280, 150, 50);
        //TERMINAN LOS BOTONES DE ARMAS

        total = new JLabel("Total de compra: " + Jugador.getCompra());
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setBounds(350, 340, 200, 20);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setBounds(30, 375, 125, 75);

        //BOTONES DE FUNCION 
        ButtonCancelar.setBounds(540, 400, 125, 75);
        ButtonVolver.setBounds(380, 400, 125, 75);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblTitulo);

        //agregando botones 
        add(ButtonCancelar);
        add(ButtonVolver);
        add(puntosJugador);
        add(total);
        add(ButtonChancla);
        add(ButtonCincho);
        add(ButtonChiliyo);
        add(ButtonZapato);
        add(ButtonPantunfla);
        add(ButtonCartera);
        add(ButtonBolson);
        add(ButtonAlmohada);
        
        validate();

    }

    public static JButton getButtonChancla() {
        return ButtonChancla;
    }

    public static void setButtonChancla(JButton ButtonChancla) {
        Armas.ButtonChancla = ButtonChancla;
    }

    public static JButton getButtonCancelar() {
        return ButtonCancelar;
    }

    public static void setButtonCancelar(JButton ButtonCancelar) {
        Armas.ButtonCancelar = ButtonCancelar;
    }
    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Consumibles.ButtonVolver = ButtonVolver;
    }

    public static JButton getButtonCincho() {
        return ButtonCincho;
    }

    public static void setButtonCincho(JButton ButtonCincho) {
        Armas.ButtonCincho = ButtonCincho;
    }

    public static JButton getButtonChiliyo() {
        return ButtonChiliyo;
    }

    public static void setButtonChiliyo(JButton ButtonChiliyo) {
        Armas.ButtonChiliyo = ButtonChiliyo;
    }

    public static JButton getButtonZapato() {
        return ButtonZapato;
    }

    public static void setButtonZapato(JButton ButtonZapato) {
        Armas.ButtonZapato = ButtonZapato;
    }

    public static JButton getButtonAlmohada() {
        return ButtonAlmohada;
    }

    public static void setButtonAlmohada(JButton ButtonAlmohada) {
        Armas.ButtonAlmohada = ButtonAlmohada;
    }

    public static JButton getButtonPantunfla() {
        return ButtonPantunfla;
    }

    public static void setButtonPantunfla(JButton ButtonPantunfla) {
        Armas.ButtonPantunfla = ButtonPantunfla;
    }

    public static JButton getButtonCartera() {
        return ButtonCartera;
    }

    public static void setButtonCartera(JButton ButtonCartera) {
        Armas.ButtonCartera = ButtonCartera;
    }

    public static JButton getButtonBolson() {
        return ButtonBolson;
    }

    public static void setButtonBolson(JButton ButtonBolson) {
        Armas.ButtonBolson = ButtonBolson;
    }
    
    

}
