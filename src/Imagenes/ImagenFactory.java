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
                return new ImageIcon("src\\Imagenes\\papacreepy.jpg");             
            case 2:
                return new ImageIcon("src\\Imagenes\\mamacreepy.jpg");
            case 3:
                return new ImageIcon("src\\Imagenes\\hijacreepy.png");
            case 4:
                return new ImageIcon("src\\Imagenes\\hijocreepy.png");
            case 5:
                return new ImageIcon("src\\Imagenes\\fin.png");
            case 6:
                return new ImageIcon("src\\Imagenes\\Lobo.jpg");
            case 7:
                return new ImageIcon("src\\Imagenes\\TextBox.png");
        }
        return null;
    }
}
