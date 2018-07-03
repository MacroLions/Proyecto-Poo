/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.project;

import Ventanas.Inicio;
import Ventanas.Seleccion;
import Ventanas.VentanaFactory;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 *
 * @author ricky
 */
public class PooProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(VentanaFactory.getVentana(1));
        
        Inicio.getStart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setContentPane(VentanaFactory.getVentana(2));
                ventana.validate();
            }
        });
        
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    }
    
}