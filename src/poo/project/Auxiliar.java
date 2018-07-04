/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import Imagenes.ImagenFactory;
import Ventanas.Inicio;
import Ventanas.Juego;
import Ventanas.Seleccion;
import Ventanas.VentanaFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author UCA
 */
public class Auxiliar {
    static void configBotones(JFrame VentanaAModificar){
        
        Inicio.getStart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAModificar.setContentPane(VentanaFactory.getVentana(2));
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
    }
}
