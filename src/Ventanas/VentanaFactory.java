/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Container;

/**
 *
 * @author Mai Perez
 */
public class VentanaFactory {
    
    public static Container getVentana(int opcion){
        switch(opcion){
            case 1:
                return new Inicio();
                
            case 2:
                return new Seleccion();

        }
        return null;
    }
    
}
