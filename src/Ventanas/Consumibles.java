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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Diana
 */
public class Consumibles extends JPanel {

    public int WIDTH = 700;
    public int HEIGHT = 500;
    
    private int PuntosCompra = 0;

    ImageIcon ObjetoFinalIMG = new ImageIcon("src\\Imagenes\\objetofinal.jpg");
    JButton ButtonConfirmacion = new JButton("CONFIRMAR");
    JButton ButtonCancelar = new JButton("CANCELAR");
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
    JTextField totalCompra = new JTextField("0 Puntos");
    
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
        Button1.setBounds(344, 100, 60, 20);
        Button2.setBounds(344, 130, 60, 20);
        Button3.setBounds(344, 160, 60, 20);
        Button4.setBounds(344, 190, 60, 20);
        Button5.setBounds(344, 220, 60, 20);
        Button6.setBounds(344, 250, 60, 20);
        Button7.setBounds(344, 280, 60, 20);
        Button8.setBounds(344, 310, 60, 20);

        text1.setBounds(422, 100, 60, 20);
        text2.setBounds(422, 130, 60, 20);
        text3.setBounds(422, 160, 60, 20);
        text4.setBounds(422, 190, 60, 20);
        text5.setBounds(422, 220, 60, 20);
        text6.setBounds(422, 250, 60, 20);
        text7.setBounds(422, 280, 60, 20);
        text8.setBounds(422, 310, 60, 20);
       
        Button11.setBounds(500, 100, 60, 20);
        Button22.setBounds(500, 130, 60, 20);
        Button33.setBounds(500, 160, 60, 20);
        Button44.setBounds(500, 190, 60, 20);
        Button55.setBounds(500, 220, 60, 20);
        Button66.setBounds(500, 250, 60, 20);
        Button77.setBounds(500, 280, 60, 20);
        Button88.setBounds(500, 310, 60, 20);

        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        text6.setEditable(false);
        text7.setEditable(false);
        text8.setEditable(false);
        
        lblGalleta = new JLabel("Galleta           10 pts      (+10 HP)");
        lblGalleta.setFont(new Font("Arial", Font.BOLD, 16));
        lblGalleta.setForeground(Color.WHITE);
        lblGalleta.setBounds(90, 100, 400, 20);
        
        lblJugo = new JLabel("Jugo              20 pts      (+20 HP)");
        lblJugo.setFont(new Font("Arial", Font.BOLD, 16));
        lblJugo.setForeground(Color.WHITE);
        lblJugo.setBounds(90, 130, 400, 20);

        lblPupusa = new JLabel("Pupusa         30 pts      (+30 HP)");
        lblPupusa.setFont(new Font("Arial", Font.BOLD, 16));
        lblPupusa.setForeground(Color.WHITE);
        lblPupusa.setBounds(90, 160, 400, 20);

        lblEmpanada = new JLabel("Empanada   25 pts      (+25 HP)");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD, 16));
        lblEmpanada.setForeground(Color.WHITE);
        lblEmpanada.setBounds(90, 190, 400, 20);

        //consumibles ubicados a la derecha
        lblSoda = new JLabel("Soda              40 pts      (+30 HP)");
        lblSoda.setFont(new Font("Arial", Font.BOLD, 16));
        lblSoda.setForeground(Color.WHITE);
        lblSoda.setBounds(90, 220, 400, 20);

        lblLeche = new JLabel("Leche            40 pts      (+50 HP)");
        lblLeche.setFont(new Font("Arial", Font.BOLD, 16));
        lblLeche.setForeground(Color.WHITE);
        lblLeche.setBounds(90, 250, 400, 20);

        lblChurro = new JLabel("Churro          05 pts      (+05 HP)");
        lblChurro.setFont(new Font("Arial", Font.BOLD, 16));
        lblChurro.setForeground(Color.WHITE);
        lblChurro.setBounds(90, 280, 400, 20);

        lblChocolate = new JLabel("Chocolate    15 pts      (+15 HP)");
        lblChocolate.setFont(new Font("Arial", Font.BOLD, 16));
        lblChocolate.setForeground(Color.WHITE);
        lblChocolate.setBounds(90, 310, 400, 20);

        total = new JLabel("Total de compra:");
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setForeground(Color.WHITE);
        total.setBounds(350, 340, 200, 20);
        
        totalCompra.setBounds(485, 340, 70, 20);
        totalCompra.setEditable(false);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setForeground(Color.WHITE);
        puntosJugador.setBounds(90, 375, 125, 75);

        //Eventos
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
        //Cancelar
        ButtonCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PuntosCompra=0;
                text1.setText("0");
                text2.setText("0");
                text3.setText("0");
                text4.setText("0");
                text5.setText("0");
                text6.setText("0");
                text7.setText("0");
                text8.setText("0");
                totalCompra.setText("0 Puntos");
            }
        });
        //Confirmar
        ButtonConfirmacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.ValidarCompra(PuntosCompra)){
                    Jugador.setPuntos(Jugador.getPuntos()-PuntosCompra);
                    puntosJugador.setText("Puntos: " + Jugador.getPuntos());
                    Compra(text1,"Galleta",10);
                    Compra(text2,"Jugo",20);
                    Compra(text3,"Pupusa",30);
                    Compra(text4,"Empanada",25);
                    Compra(text5,"Soda",30);
                    Compra(text6,"Leche",50);
                    Compra(text7,"Churro",5);
                    Compra(text8,"Chocolate",15);
                    JOptionPane.showMessageDialog(null,"Compra realizada con exito!");
                    PuntosCompra=0;
                    text1.setText("0");
                    text2.setText("0");
                    text3.setText("0");
                    text4.setText("0");
                    text5.setText("0");
                    text6.setText("0");
                    text7.setText("0");
                    text8.setText("0");
                    totalCompra.setText("0 Puntos");
                }
                else{
                    JOptionPane.showMessageDialog(null,"No cuentas con suficientes puntos para realizar la compra!");
                }
                
            }
        });

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
                    PuntosCompra=PuntosCompra+precio;
                    totalCompra.setText(PuntosCompra+" Puntos");
                }
            });
        }else{
            B.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(Integer.parseInt(TF.getText())!=0){
                        PuntosCompra=PuntosCompra-precio;
                        totalCompra.setText(PuntosCompra+" Puntos");
                        TF.setText(Integer.toString(Integer.parseInt(TF.getText())-1));
                    }
                }
            });
        }
    }
    
    private void Compra(JTextField TF,String nombreObjeto,int vidaRecuperada){
        for(int i=0; i<(Integer.parseInt(TF.getText())); i++){
            Jugador.getConsumibles().add(new Consumible(nombreObjeto,vidaRecuperada));
        }
    }
}
