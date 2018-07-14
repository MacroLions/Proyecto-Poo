/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import Imagenes.ImagenFactory;
import Objetos.Arma;
import Personajes.Jugador;
import Personajes.Monstruo;
import Ventanas.Armas;
import Ventanas.Consumibles;
import Ventanas.Controles;
import Ventanas.Final;
import Ventanas.GameOver;
import Ventanas.Inicio;
import Ventanas.Inventario;
import Ventanas.Juego;
import Ventanas.Seleccion;
import Ventanas.Tienda;
import Ventanas.VentanaFactory;
import Ventanas.Win;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuria y Mai >:3c
 */
public class Auxiliar {

    static JFrame VentanaAModificar;

    static void configBotones(JFrame VentanaAModificar) {
        Auxiliar.VentanaAModificar = VentanaAModificar;
        Inicio.getStart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(2));
                VentanaAModificar.validate();
            }
        });

        Inicio.getCredits().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(5));
                VentanaAModificar.validate();
            }
        });

        Inicio.getControls().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(9));
                VentanaAModificar.validate();
            }
        });

        Controles.getButtonRegresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(1));
                VentanaAModificar.validate();
            }
        });

        Seleccion.getButtonPapa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Juego.setSprite(ImagenFactory.getImagen(1));
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(3));
                VentanaAModificar.validate();
            }
        });
        
        Seleccion.getButtonMama().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Juego.setSprite(ImagenFactory.getImagen(2));
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(3));
                VentanaAModificar.validate();
            }
        });
        
        Seleccion.getButtonHermana().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Juego.setSprite(ImagenFactory.getImagen(3));
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(3));
                VentanaAModificar.validate();
            }
        });
        
        Seleccion.getButtonHermano().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Juego.setSprite(ImagenFactory.getImagen(4));
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(3));
                VentanaAModificar.validate();
            }
        });
        
        Tienda.getButtonArmas().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
            }
        });
        
        Tienda.getButtonConsumibles().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(7));
                VentanaAModificar.validate();
            }
        });


        Tienda.getButtonSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(3));
                VentanaAModificar.validate();
            }
        });

        Consumibles.getButtonVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(4));
                VentanaAModificar.validate();
            }
        });

        Armas.getButtonVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador.setCompra(0);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(4));
                VentanaAModificar.validate();
            }
        });

        Win.getContinueButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(1));
                VentanaAModificar.validate();
            }
        });

        GameOver.getGOButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(1));
                VentanaAModificar.validate();
            }
        });

        Final.getButtonMenu().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(1));
                VentanaAModificar.validate();
            }
        });

        Tienda.getButtonObjetoFinal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Jugador.getPuntos()>=1000){
                    Jugador.setVida(200);
                    Monstruo.setLvl(1);
                    Jugador.setArmaActual(new Arma("Mani",20));
                    Jugador.setPuntos(0);
                    VentanaAModificar.setContentPane(VentanaFactory.getVentana(10));
                    VentanaAModificar.validate();
                }
                else{
                    JOptionPane.showMessageDialog(null,"No puedes comprar el objeto final aún!");
                }
            }
        });
        Consumibles.getButtonVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(6));
                VentanaAModificar.validate();
            }
        });
        
    }
    
    public static void configClose(JFrame VentanaAModificar){
        Inventario.getCerrarInventario().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.dispose();
                Juego.getInventario().setEnabled(true);
            }
        });
    
    }

    public static void Tienda() {
        Auxiliar.VentanaAModificar.setContentPane(VentanaFactory.getVentana(4));
        Auxiliar.VentanaAModificar.validate();
    }

    public static void GameOver() {
        Auxiliar.VentanaAModificar.setContentPane(VentanaFactory.getVentana(6));
        Auxiliar.VentanaAModificar.validate();
    }
}
