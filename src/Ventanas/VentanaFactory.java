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
                
            case 3:
                return new Juego();
            case 4:
                return new Tienda();
            case 5:
                return new Final();
            case 6:
                return new GameOver();
            case 7:
                return new Consumibles();
            case 8:
                return new Armas();
            case 9:
                return new Controles();
            case 10:
                return new Win();
            case 11:
                return new Inventario();
        }
        return null;
    }
    
}
