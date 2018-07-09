/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
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

    
    JLabel puntosJugador, total, lblBackground;
    JLabel lblTitulo, lblGalleta, lblJugo, lblPupusa, lblEmpanada, lblChocolate, lblLista_objetos, lblPuntos_acumulados;
    JLabel lblSoda, lblLeche, lblChurro;
    int b1, b2, b3, b4, b5, b6, b7, b8;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;

    public Consumibles() {
        lblBackground = new JLabel();
        lblBackground.setIcon(ImagenFactory.getBackground(5));
        lblBackground.setBounds(0, 0, 700, 500);

        lblTitulo = new JLabel("¡CONSUMIBLES!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.CYAN);
        lblTitulo.setBounds(250, 15, 300, 30);

        //EMPIEZAN LOS BOTONES PARA OBTENER CONSUMIBLES
        lblGalleta = new JLabel("Galleta 10 pts");
        lblGalleta.setFont(new Font("Arial", Font.BOLD, 16));
        lblGalleta.setForeground(Color.WHITE);
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
        lblJugo.setForeground(Color.WHITE);
        lblJugo.setBounds(50, 130, 400, 20);

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
        lblPupusa.setForeground(Color.WHITE);
        lblPupusa.setBounds(50, 160, 400, 20);

        lblEmpanada = new JLabel("Empanada 25 pts");
        lblEmpanada.setFont(new Font("Arial", Font.BOLD, 16));
        lblEmpanada.setForeground(Color.WHITE);
        lblEmpanada.setBounds(50, 190, 400, 20);

        //consumibles ubicados a la derecha
        lblSoda = new JLabel("Soda 40 pts");
        lblSoda.setFont(new Font("Arial", Font.BOLD, 16));
        lblSoda.setForeground(Color.WHITE);
        lblSoda.setBounds(50, 220, 400, 20);

        lblLeche = new JLabel("Leche 40 pts");
        lblLeche.setFont(new Font("Arial", Font.BOLD, 16));
        lblLeche.setForeground(Color.WHITE);
        lblLeche.setBounds(50, 250, 400, 20);

        lblChurro = new JLabel("Churro 10 pts");
        lblChurro.setFont(new Font("Arial", Font.BOLD, 16));
        lblChurro.setForeground(Color.WHITE);
        lblChurro.setBounds(50, 280, 400, 20);

        lblChocolate = new JLabel("Chocolate 15 pts");
        lblChocolate.setFont(new Font("Arial", Font.BOLD, 16));
        lblChocolate.setForeground(Color.WHITE);
        lblChocolate.setBounds(50, 310, 400, 20);

        lbl1 = new JLabel("" + this.getB1());
        lbl1.setFont(new Font("Arial", Font.BOLD, 16));
        lbl1.setForeground(Color.WHITE);
        lbl1.setBounds(385, 98, 30, 30);

        lbl2 = new JLabel("" + this.getB2());
        lbl2.setFont(new Font("Arial", Font.BOLD, 16));
        lbl2.setForeground(Color.WHITE);
        lbl2.setBounds(385, 130, 30, 30);

        lbl3 = new JLabel("" + this.getB3());
        lbl3.setFont(new Font("Arial", Font.BOLD, 16));
        lbl3.setForeground(Color.WHITE);
        lbl3.setBounds(385, 160, 30, 30);

        lbl4 = new JLabel("" + this.getB4());
        lbl4.setFont(new Font("Arial", Font.BOLD, 16));
        lbl4.setForeground(Color.WHITE);
        lbl4.setBounds(385, 190, 30, 30);

        lbl5 = new JLabel("" + this.getB5());
        lbl5.setFont(new Font("Arial", Font.BOLD, 16));
        lbl5.setForeground(Color.WHITE);
        lbl5.setBounds(385, 220, 30, 30);

        lbl6 = new JLabel("" + this.getB6());
        lbl6.setFont(new Font("Arial", Font.BOLD, 16));
        lbl6.setForeground(Color.WHITE);
        lbl6.setBounds(385, 248, 30, 30);

        lbl7 = new JLabel("" + this.getB7());
        lbl7.setFont(new Font("Arial", Font.BOLD, 16));
        lbl7.setForeground(Color.WHITE);
        lbl7.setBounds(385, 277, 30, 30);

        lbl8 = new JLabel("" + this.getB8());
        lbl8.setFont(new Font("Arial", Font.BOLD, 16));
        lbl8.setForeground(Color.WHITE);
        lbl8.setBounds(385, 306, 30, 30);

        total = new JLabel("Total de compra ");
        total.setFont(new Font("Arial", Font.BOLD, 16));
        total.setForeground(Color.WHITE);
        total.setBounds(350, 340, 200, 20);

        puntosJugador = new JLabel("Puntos: " + Jugador.getPuntos());
        puntosJugador.setFont(new Font("Arial", Font.BOLD, 16));
        puntosJugador.setForeground(Color.WHITE);
        puntosJugador.setBounds(50, 375, 125, 75);

        //TERMINAN LOS BOTONES DE CONSUMIBLES
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
        lblBackground.add(lblPupusa);
        lblBackground.add(lblEmpanada);
        lblBackground.add(lblChocolate);
        lblBackground.add(lblSoda);
        lblBackground.add(lblLeche);
        lblBackground.add(lblChurro);

        lblBackground.add(lbl1);
        lblBackground.add(lbl2);
        lblBackground.add(lbl3);
        lblBackground.add(lbl4);
        lblBackground.add(lbl5);
        lblBackground.add(lbl6);
        lblBackground.add(lbl7);
        lblBackground.add(lbl8);

        //agregando botones 
        lblBackground.add(ButtonConfirmacion);
        lblBackground.add(ButtonCancelar);
        lblBackground.add(puntosJugador);
        lblBackground.add(ButtonVolver);

        ButtonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB1(0);
                c.setB2(0);
                c.setB3(0);
                c.setB4(0);
                c.setB5(0);
                c.setB6(0);
                c.setB7(0);
                c.setB8(0);
            }
        });

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB1(c.getB1() + 1);
                lbl1.setText("" + c.getB1());
                VentanaFactory.getVentana(7);
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB2(c.getB2() + 1);
                lbl2.setText("" + c.getB2());
            }
        });

        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB3(c.getB3() + 1);
                lbl3.setText("" + c.getB3());
            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB4(c.getB4() + 1);
                lbl4.setText("" + c.getB4());
            }
        });

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB5(c.getB5() + 1);
                lbl5.setText("" + c.getB5());
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB6(c.getB6() + 1);
                lbl6.setText("" + c.getB6());
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB7(getB7() + 1);
                lbl7.setText("" + c.getB7());
            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB8(c.getB8() + 1);
                lbl8.setText("" + c.getB8());
            }
        });

        Button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB1(c.getB8() - 1);
                lbl1.setText("" + c.getB1());
            }
        });

        Button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB2(c.getB2() - 1);
                lbl2.setText("" + c.getB2());
            }
        });

        Button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB3(c.getB3() - 1);
                lbl3.setText("" + c.getB3());
            }
        });

        Button44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB4(c.getB4() - 1);
                lbl4.setText("" + c.getB4());
            }
        });

        Button55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB5(c.getB5() - 1);
                lbl5.setText("" + c.getB5());
            }
        });

        Button66.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB6(c.getB6() - 1);
                lbl6.setText("" + c.getB6());
            }
        });

        Button77.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB7(c.getB7() - 1);
                lbl7.setText("" + c.getB7());
            }
        });

        Button88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Consumibles c = new Consumibles();
                c.setB8(c.getB8() - 1);
                lbl8.setText("" + c.getB8());
            }
        });
        validate();
    }

    public static JButton getButtonCancelar() {
        return ButtonCancelar;
    }

    public static void setButtonCancelar(JButton ButtonCancelar) {
        Consumibles.ButtonCancelar = ButtonCancelar;
    }

    public static JButton getButtonVolver() {
        return ButtonVolver;
    }

    public static void setButtonVolver(JButton ButtonVolver) {
        Consumibles.ButtonVolver = ButtonVolver;
    }

    public JButton getButton1() {
        return Button1;
    }

    public void setButton1(JButton Button1) {
        this.Button1 = Button1;
    }

    public JButton getButton2() {
        return Button2;
    }

    public void setButton2(JButton Button2) {
        this.Button2 = Button2;
    }

    public JButton getButton3() {
        return Button3;
    }

    public void setButton3(JButton Button3) {
        this.Button3 = Button3;
    }

    public JButton getButton4() {
        return Button4;
    }

    public void setButton4(JButton Button4) {
        this.Button4 = Button4;
    }

    public JButton getButton5() {
        return Button5;
    }

    public void setButton5(JButton Button5) {
        this.Button5 = Button5;
    }

    public JButton getButton6() {
        return Button6;
    }

    public void setButton6(JButton Button6) {
        this.Button6 = Button6;
    }

    public JButton getButton7() {
        return Button7;
    }

    public void setButton7(JButton Button7) {
        this.Button7 = Button7;
    }

    public JButton getButton8() {
        return Button8;
    }

    public void setButton8(JButton Button8) {
        this.Button8 = Button8;
    }

    public JButton getButton11() {
        return Button11;
    }

    public void setButton11(JButton Button11) {
        this.Button11 = Button11;
    }

    public JButton getButton22() {
        return Button22;
    }

    public void setButton22(JButton Button22) {
        this.Button22 = Button22;
    }

    public JButton getButton33() {
        return Button33;
    }

    public void setButton33(JButton Button33) {
        this.Button33 = Button33;
    }

    public JButton getButton44() {
        return Button44;
    }

    public void setButton44(JButton Button44) {
        this.Button44 = Button44;
    }

    public JButton getButton55() {
        return Button55;
    }

    public void setButton55(JButton Button55) {
        this.Button55 = Button55;
    }

    public JButton getButton66() {
        return Button66;
    }

    public void setButton66(JButton Button66) {
        this.Button66 = Button66;
    }

    public JButton getButton77() {
        return Button77;
    }

    public void setButton77(JButton Button77) {
        this.Button77 = Button77;
    }

    public JButton getButton88() {
        return Button88;
    }

    public void setButton88(JButton Button88) {
        this.Button88 = Button88;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getB3() {
        return b3;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public int getB4() {
        return b4;
    }

    public void setB4(int b4) {
        this.b4 = b4;
    }

    public int getB5() {
        return b5;
    }

    public void setB5(int b5) {
        this.b5 = b5;
    }

    public int getB6() {
        return b6;
    }

    public void setB6(int b6) {
        this.b6 = b6;
    }

    public int getB7() {
        return b7;
    }

    public void setB7(int b7) {
        this.b7 = b7;
    }

    public int getB8() {
        return b8;
    }

    public void setB8(int b8) {
        this.b8 = b8;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public void setLbl4(JLabel lbl4) {
        this.lbl4 = lbl4;
    }

    public JLabel getLbl5() {
        return lbl5;
    }

    public void setLbl5(JLabel lbl5) {
        this.lbl5 = lbl5;
    }

    public JLabel getLbl6() {
        return lbl6;
    }

    public void setLbl6(JLabel lbl6) {
        this.lbl6 = lbl6;
    }

    public JLabel getLbl7() {
        return lbl7;
    }

    public void setLbl7(JLabel lbl7) {
        this.lbl7 = lbl7;
    }

    public JLabel getLbl8() {
        return lbl8;
    }

    public void setLbl8(JLabel lbl8) {
        this.lbl8 = lbl8;
    }

}
