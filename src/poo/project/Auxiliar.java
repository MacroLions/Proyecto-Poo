/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import Ventanas.Inicio;
import Ventanas.Seleccion;
import Ventanas.VentanaFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author UCA
 */
public class Auxiliar {
    static void configBotones(){
        Seleccion.getButtonPapa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
}
