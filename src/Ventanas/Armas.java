/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

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
public class Armas extends JPanel {

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
    static JButton ButtonCartera = new JButton("20 pts");
    static JButton ButtonBolson = new JButton("13 pts");

    JLabel lblTitulo, lblChancla, lblCincho, lblZapato, lblChiliyo, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblAlmohada, lblPantunfla, lblCartera, lblBolson;

    public Armas() {

        lblTitulo = new JLabel("¡ARMAS!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(275, 10, 200, 20);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblChancla = new JLabel("Chancla");
        lblChancla.setFont(new Font("Arial", Font.BOLD, 25));
        lblChancla.setBounds(50, 98, 400, 30);

        ButtonChancla.setBounds(180, 100, 75, 30);

        lblCincho = new JLabel("Cincho");
        lblCincho.setFont(new Font("Arial", Font.BOLD, 25));
        lblCincho.setBounds(50, 150, 400, 30);

        ButtonCincho.setBounds(180, 148, 75, 30);

        lblChiliyo = new JLabel("Chiliyo");
        lblChiliyo.setFont(new Font("Arial", Font.BOLD, 25));
        lblChiliyo.setBounds(50, 200, 400, 30);

        ButtonChiliyo.setBounds(180, 198, 75, 30);

        lblZapato = new JLabel("Zapato");
        lblZapato.setFont(new Font("Arial", Font.BOLD, 25));
        lblZapato.setBounds(50, 250, 400, 30);

        ButtonZapato.setBounds(180, 248, 75, 30);

        //consumibles ubicados a la derecha
        lblAlmohada = new JLabel("Almohada");
        lblAlmohada.setFont(new Font("Arial", Font.BOLD, 25));
        lblAlmohada.setBounds(375, 98, 400, 30);

        ButtonAlmohada.setBounds(500, 100, 75, 30);

        lblPantunfla = new JLabel("Pantunfla");
        lblPantunfla.setFont(new Font("Arial", Font.BOLD, 25));
        lblPantunfla.setBounds(375, 150, 400, 30);

        ButtonPantunfla.setBounds(500, 148, 75, 30);

        lblCartera = new JLabel("Cartera");
        lblCartera.setFont(new Font("Arial", Font.BOLD, 25));
        lblCartera.setBounds(375, 200, 400, 30);

        ButtonCartera.setBounds(500, 198, 75, 30);

        lblBolson = new JLabel("Bolson");
        lblBolson.setFont(new Font("Arial", Font.BOLD, 25));
        lblBolson.setBounds(375, 250, 400, 30);

        ButtonBolson.setBounds(500, 248, 75, 30);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
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
        add(ButtonCincho);
        add(ButtonAlmohada);
        add(ButtonChancla);
        add(ButtonZapato);
        add(ButtonChiliyo);
        add(ButtonConfirmacion);
        add(ButtonCancelar);
        add(ButtonCartera);
        add(ButtonBolson);
        add(ButtonPantunfla);

        validate();
    }
}
