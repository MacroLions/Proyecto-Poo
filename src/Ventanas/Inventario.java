/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Objetos.Consumible;
import Personajes.Jugador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Nuria
 */
public class Inventario extends JPanel{
    public int WIDTH = 500;
    public int HEIGHT = 400;
    
    JLabel lblBackground, lblTitulo;
    static JButton CerrarInventario;
    JButton BGalleta = new JButton("Galleta"), 
            BJugo = new JButton("Jugo"), 
            BPupusa = new JButton("Pupusa"),
            BEmpanada = new JButton("Empanada"),
            BSoda = new JButton("Soda"),
            BLeche = new JButton("Leche"),
            BChurro = new JButton("Churro"),
            BChocolate = new JButton("Chocolate");

    public Inventario() {
        //Botones
        BGalleta.setBounds(60, 80, 150, 50);
        BJugo.setBounds(60, 140, 150, 50);
        BEmpanada.setBounds(60, 200, 150, 50);
        BPupusa.setBounds(60, 260, 150, 50);
        
        BSoda.setBounds(290, 80, 150, 50);
        BLeche.setBounds(290, 140, 150, 50);
        BChurro.setBounds(290, 200, 150, 50);
        BChocolate.setBounds(290, 260, 150, 50);
        
        lblBackground= new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(6));
        lblBackground.setBounds(0,0,600,500);
        
        lblTitulo= new JLabel("¡INVENTARIO!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD,30));
        lblTitulo.setForeground(Color.YELLOW);
        lblTitulo.setBounds(150,15,300,30);
        
        CerrarInventario= new JButton("Cerrar Inventario");
        CerrarInventario.setBounds(350,350,150,50);
        
        //Comprobador
        ComprobarInventario(BGalleta, "Galleta");
        
        //Eventos
        ActionRecuperarVida(BGalleta,10);
        ActionRecuperarVida(BJugo,20);
        ActionRecuperarVida(BEmpanada,30);
        ActionRecuperarVida(BPupusa,25);
        
        ActionRecuperarVida(BSoda,30);
        ActionRecuperarVida(BLeche,50);
        ActionRecuperarVida(BChurro,5);
        ActionRecuperarVida(BChocolate,15);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(lblBackground);
        lblBackground.add(lblTitulo);
        lblBackground.add(BGalleta);
        lblBackground.add(BJugo);
        lblBackground.add(BPupusa);
        lblBackground.add(BEmpanada);
        lblBackground.add(BSoda);
        lblBackground.add(BLeche);
        lblBackground.add(BChurro);
        lblBackground.add(BChocolate);
        
        
        lblBackground.add(CerrarInventario);
        
        validate();
    }

    public static JButton getCerrarInventario() {
        return CerrarInventario;
    }

    public static void setCerrarInventario(JButton ButtonCerrarInventario) {
        Inventario.CerrarInventario = ButtonCerrarInventario;
    }
    
    private void ActionRecuperarVida(JButton B,int vida){
        B.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setVida(Jugador.getVida()+vida);
                Juego.getVidaJugador().setText(Integer.toString(Jugador.getVida()));
            }
        });
    }
    
    private void ComprobarInventario(JButton B, String ConsumibleABuscar){
        if(Jugador.getConsumibles().isEmpty()){
            B.setEnabled(false);
        }
        else{
            for(int i = 0; i < Jugador.getConsumibles().size(); i++){
                if(Jugador.getConsumibles().get(i).getNombre()==ConsumibleABuscar){
                    B.setEnabled(true);
                }
                else{
                    B.setEnabled(false);
                }
            }
        }
        
    }

}
