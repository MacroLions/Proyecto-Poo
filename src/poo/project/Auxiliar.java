/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import Imagenes.ImagenFactory;
import Personajes.Jugador;
import Ventanas.Armas;
import Ventanas.Consumibles;
import Ventanas.Controles;
import Ventanas.Final;
import Ventanas.Inicio;
import Ventanas.Juego;
import Ventanas.Seleccion;
import Ventanas.Tienda;
import Ventanas.VentanaFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Nuria y Mai >:3c
 */
public class Auxiliar {

    static void configBotones(JFrame VentanaAModificar) {

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

        //Juego.getButton
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
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(4));
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

        //BOTONES PARA COMPRAR ARMAS
        Armas.getButtonCincho().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 20);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 20);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonCincho().setEnabled(false);
            }
        });
        Armas.getButtonChancla().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 10);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 10);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonChancla().setEnabled(false);
            }
        });
        Armas.getButtonChiliyo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 40);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 40);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonChiliyo().setEnabled(false);
            }
        });
        Armas.getButtonZapato().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 50);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 50);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonZapato().setEnabled(false);
            }
        });
        Armas.getButtonAlmohada().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 5);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 5);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonAlmohada().setEnabled(false);
            }
        });
        Armas.getButtonPantunfla().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 15);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 15);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonPantunfla().setEnabled(false);
            }
        });
        Armas.getButtonCartera().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 35);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 35);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonCartera().setEnabled(false);
            }
        });
        Armas.getButtonBolson().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se cobra al jugador, le restamos puntos
                Jugador.setPuntos(Jugador.getPuntos() - 35);
                //Almacenamos la cantidad de puntos que se le cobraran en la compra
                Jugador.setCompra(Jugador.getCompra() + 35);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
                Armas.getButtonBolson().setEnabled(false);
            }
        });
        Armas.getButtonCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //El total de la compra no realizada se regresa a la los puntos del jugador
                Jugador.setPuntos(Jugador.getPuntos()+Jugador.getCompra());
                Jugador.setCompra(0);
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(8));
                VentanaAModificar.validate();
            }
        });

    }
}
