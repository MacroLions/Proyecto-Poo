/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import javax.swing.ImageIcon;

/**
 *
 * @author UCA
 */
public class ImagenFactory {
     public static ImageIcon getImagen(int opcion){
        switch(opcion){
            case 1:
                return new ImageIcon("src\\Imagenes\\papacreepy.png");             
            case 2:
                return new ImageIcon("src\\Imagenes\\mamacreepy.png");
            case 3:
                return new ImageIcon("src\\Imagenes\\hijacreepy.png");
            case 4:
                return new ImageIcon("src\\Imagenes\\hijocreepy.png");
            case 5:
                return new ImageIcon("src\\Imagenes\\fin.png");
            case 6:
                return new ImageIcon("src\\Imagenes\\Lobo.png");
            case 7:
                return new ImageIcon("src\\Imagenes\\TextBox.png");
            case 8:
                return new ImageIcon("src\\Imagenes\\BatallaBG.png");
            case 9:
                return new ImageIcon("src\\Imagenes\\SelPapa.png");
            case 10:
                return new ImageIcon("src\\Imagenes\\SelMama.png");
            case 11:
                return new ImageIcon("src\\Imagenes\\SelHija.png");
            case 12:
                return new ImageIcon("src\\Imagenes\\SelHijo.png");
        }
        return null;
    }
     
     public static ImageIcon getBackground(int opcion){
        switch(opcion){
            case 1:
                return new ImageIcon("src\\Imagenes\\BatallaBG.png");             
            case 2:
                return new ImageIcon("src\\Imagenes\\SelBG.jpg");
            case 3:
                return new ImageIcon("src\\Imagenes\\TiendaBG.png");
            case 4:
                return new ImageIcon("src\\Imagenes\\ArmasBG.png");
            case 5:
                return new ImageIcon("src\\Imagenes\\ConsumiblesBG.png");
            case 6:
                return new ImageIcon("src\\Imagenes\\InventarioBG.png");
        }
        return null;
    }
}
