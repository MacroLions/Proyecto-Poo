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
import javax.swing.JOptionPane;
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
    
    static JButton ButtonChancla,ButtonCincho,ButtonChiliyo,ButtonZapato,
                   ButtonAlmohada,ButtonPantunfla,ButtonCartera,ButtonBolson;
    JLabel lblTitulo, lblBackground;
    JLabel puntosJugador;

    public Armas() {
        ButtonChancla = new JButton("Chancla 100 pts");
        ButtonCincho = new JButton("Cincho 150 pts");
        ButtonChiliyo = new JButton("Chiliyo 90 pts");
        ButtonZapato = new JButton("Zapato 50 pts");
        
        ButtonAlmohada = new JButton("Almohada 5 pts");
        ButtonPantunfla = new JButton("Pantunfla 10 pts");
        ButtonCartera = new JButton("Cartera 40 pts");
        ButtonBolson = new JButton("Bolson 100 pts");
        
        //Comprobador
        Comprobador(ButtonChancla,"Chancla");
        Comprobador(ButtonCincho,"Cincho");
        Comprobador(ButtonChiliyo,"Chiliyo");
        Comprobador(ButtonZapato,"Zapato");
        
        Comprobador(ButtonAlmohada,"Almohada");
        Comprobador(ButtonPantunfla,"Pantufla");
        Comprobador(ButtonCartera,"Cartera");
        Comprobador(ButtonBolson,"Bolson");
        
        //Labels
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
        
        
        //Chancla
        ButtonChancla.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonChancla,"Chancla",200,100);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Cincho
        ButtonCincho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonCincho,"Cincho",300,150);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Chiliyo
        ButtonChiliyo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonChiliyo,"Chiliyo",50,90);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Zapato
        ButtonZapato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonZapato,"Zapato",30,50);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Almohada
        ButtonAlmohada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonAlmohada,"Almohada",10,5);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Pantunfla
        ButtonPantunfla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonPantunfla,"Pantunfla",20,10);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Cartera
        ButtonCartera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonCartera,"Cartera",100,40);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });
        //Bolson
        ButtonBolson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevaArma(ButtonBolson,"Bolson",200,100);
                puntosJugador.setText("Puntos: " + Jugador.getPuntos());
            }
        });

        //agregando botones 
        //add(ButtonCancelar);
        lblBackground.add(ButtonVolver);
        lblBackground.add(puntosJugador);
        
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

    private void NuevaArma(JButton B,String nombreArma,int nuevoAtaque,int precio){
        if(Jugador.ValidarCompra(precio)){
            Jugador.setPuntos(Jugador.getPuntos()-precio);
            Jugador.setArmaActual(new Arma(nombreArma,nuevoAtaque));
            B.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Ahora el nuevo ataque de "+Jugador.getNombre()+" es "+nuevoAtaque);
        }
        else{
            JOptionPane.showMessageDialog(null,"No es posible comprar esa arma.");
        }
    }
    
    private void Comprobador(JButton B,String nombreArma){
        if(Jugador.getArmaActual().getNombre()==nombreArma){
            B.setEnabled(false);
        }
    }
  
    
}

   