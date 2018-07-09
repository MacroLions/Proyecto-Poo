/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Objetos.Arma;
import Personajes.Jugador;
import java.awt.Color;
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
    JButton ButtonCancelar = new JButton("CANCELAR");
    static JButton ButtonVolver = new JButton("VOLVER");
    JButton ButtonChancla = new JButton("Chancla 100 pts");
    JButton ButtonCincho = new JButton("Cincho 150 pts");
    JButton ButtonChiliyo = new JButton("Chiliyo 90 pts");
    JButton ButtonZapato = new JButton("Zapato 50 pts");
    JButton ButtonAlmohada = new JButton("Almohada 5 pts");
    JButton ButtonPantunfla = new JButton("Pantunfla 10 pts");
    JButton ButtonCartera = new JButton("Cartera 40 pts");
    JButton ButtonBolson = new JButton("Bolson 100 pts");

    JLabel lblTitulo, lblBackground;
    JLabel puntosJugador, total;

    public Armas() {
        lblBackground= new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(4));
        lblBackground.setBounds(0,0,700,500);

        lblTitulo = new JLabel("¡ARMAS!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setBounds(275, 15, 200, 30);

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
        total.setForeground(Color.WHITE);
        total.setBounds(250, 360, 200, 20);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setForeground(Color.WHITE);
        puntosJugador.setBounds(50, 375, 125, 75);

        //BOTONES DE FUNCION 
        ButtonCancelar.setBounds(540, 400, 125, 75);
        ButtonVolver.setBounds(480, 400, 125, 75);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblBackground);
        lblBackground.add(lblTitulo);
        
        //Funcions de botones....
        ButtonCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Le devuelve los puntos al jugador
                Jugador.setPuntos(Jugador.getPuntos() + Jugador.getCompra());
                //La compra vuelve a ser cero
                Jugador.setCompra(0);
                validate();
                ButtonChancla.setEnabled(true);
                ButtonCincho.setEnabled(true);
                ButtonChiliyo.setEnabled(true);
                ButtonZapato.setEnabled(true);
                ButtonAlmohada.setEnabled(true);
                ButtonPantunfla.setEnabled(true);
                ButtonCartera.setEnabled(true);
                ButtonBolson.setEnabled(true);
            }
        });
        //Chancla
        ButtonChancla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+100);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 100);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 100);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Chancla",200));
                    ButtonChancla.setEnabled(false);
                } else {
                    ButtonChancla.setEnabled(true);
                }
            }
        });
        //Cincho
        ButtonCincho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+100);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 150);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 150);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Cincho",300));
                    ButtonCincho.setEnabled(false);
                } else {
                    ButtonCincho.setEnabled(true);
                }
            }
        });
        //Chiliyo
        ButtonChiliyo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+90);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 90);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 90);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Chiliyo",50));
                    ButtonChiliyo.setEnabled(false);
                } else {
                    ButtonChiliyo.setEnabled(true);
                }
            }
        });
        //Zapato
        ButtonZapato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+50);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 50);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 50);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Zapato",30));
                    ButtonZapato.setEnabled(false);
                } else {
                    ButtonZapato.setEnabled(true);
                }
            }
        });
        //Almohada
        ButtonAlmohada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+5);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 5);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 5);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Almohada",10));
                    ButtonAlmohada.setEnabled(false);
                } else {
                    ButtonAlmohada.setEnabled(true);
                }
            }
        });
        //Pantufla
        ButtonPantunfla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+10);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 10);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 10);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Pantunfla",20));
                    ButtonPantunfla.setEnabled(false);
                } else {
                    ButtonPantunfla.setEnabled(true);
                }
            }
        });
        //Cartera
        ButtonCartera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+40);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 40);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 40);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Cartera",100));
                    ButtonCartera.setEnabled(false);
                } else {
                    ButtonCartera.setEnabled(true);
                }
            }
        });
        //Bolson
        ButtonBolson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(Jugador.getCompra()+100);
                total.setText("Total de compra: " + Jugador.getCompra());
                //verifica que la cantidad de puntos sea la necesaria para poder realizar la compra
                if (Jugador.ValidarComprar()) {
                    //Se cobra al jugador, le restamos puntos
                    Jugador.setPuntos(Jugador.getPuntos() - 100);
                    //Almacenamos la cantidad de puntos que se le cobraran en la compra
                    Jugador.setCompra(Jugador.getCompra() + 100);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Jugador.setArmaActual(new Arma("Bolson",200));
                    ButtonBolson.setEnabled(false);
                } else {
                    ButtonBolson.setEnabled(true);
                }
            }
        });

        //agregando botones 
        //add(ButtonCancelar);
        lblBackground.add(ButtonVolver);
        lblBackground.add(puntosJugador);
        lblBackground.add(total);
        lblBackground.add(ButtonChancla);
        lblBackground.add(ButtonCincho);
        lblBackground.add(ButtonChiliyo);
        lblBackground.add(ButtonZapato);
        lblBackground.add(ButtonPantunfla);
        lblBackground.add(ButtonCartera);
        lblBackground.add(ButtonBolson);
        lblBackground.add(ButtonAlmohada);
        
        validate();
    
    }

    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Armas.ButtonVolver = ButtonVolver;
    }

  
    
}

   