/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Imagenes.ImagenFactory;
import Objetos.Arma;
import Personajes.Jugador;
import Personajes.Monstruo;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import SFX.Music;
import java.awt.Color;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;
import poo.project.Auxiliar;
import sun.audio.AudioPlayer;

/**
 *
 * @author Maishi
 */
public class Juego extends JPanel{
    //Jugador jugador = new Jugador();
    Monstruo monstruo = new Monstruo();
    public int WIDTH = 700;
    public int HEIGHT = 500;
    static ImageIcon SpriteJugador;
    ImageIcon SpriteMonstruo = ImagenFactory.getImagen(6);
    JLabel JugadorLabel = new JLabel(SpriteJugador);
    JLabel MonstruoLabel = new JLabel(SpriteMonstruo);
    JButton Atacar = new JButton("Atacar");
    static JButton Inventario;
    JLabel CajaDeTexto = new JLabel("Lobo salvaje ha aparecido!");
    JLabel Background = new JLabel();
    static JLabel VidaJugador = new JLabel(Integer.toString(Jugador.getVida()));
    JLabel VidaMonstruo = new JLabel(Integer.toString(monstruo.getVida()));
    ActionListener Ganar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            CajaDeTexto.setText("Hombre Lobo: Volveré y no podrás vencerme la proxima!");
        }
    };
    ActionListener Puntos = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            int num = new Random().nextInt((Monstruo.getLvl()*100)-51)+50;
            Jugador.setPuntos(Jugador.getPuntos()+num);
            CajaDeTexto.setText(Jugador.getNombre()+" ha ganado "+num+" puntos!");
        }
    };
    ActionListener Tienda = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Monstruo.setLvl(Monstruo.getLvl()+1);
            Auxiliar.Tienda();
        }
    };
    ActionListener Perder = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            CajaDeTexto.setText("Hombre Lobo: Suerte la proxima, Creepy Family!");
        }
    };
    ActionListener GameOver = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Jugador.setVida(200);
            Jugador.setArmaActual(new Arma("Mani",20));
            VidaJugador.setText(Integer.toString(Jugador.getVida()));
            Monstruo.setLvl(1);
            Jugador.setPuntos(0);
            Auxiliar.GameOver();
        }
    };
    
    
    public Juego(){
        Inventario = new JButton("Inventario");
        VidaJugador.setBounds(100, 10, 100, 20);
        VidaMonstruo.setBounds(500, 10, 100, 20);
        VidaJugador.setFont(new Font("Berlin Sans FB",Font.PLAIN,30));
        VidaMonstruo.setFont(new Font("Berlin Sans FB",Font.PLAIN,30));
        VidaJugador.setForeground(Color.red);
        VidaMonstruo.setForeground(Color.red);
        Background.setIcon(ImagenFactory.getImagen(8));
        Background.setBounds(0,0,700,500);
        JugadorLabel.setBounds(0,50,300,300);
        MonstruoLabel.setBounds(400,50,300,300);
        Inventario.setBounds(600,400,100,50);
        Atacar.setBounds(500,400,100,50);
        CajaDeTexto.setBounds(0,400,500,100);
        CajaDeTexto.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
        CajaDeTexto.setHorizontalTextPosition(JLabel.CENTER);
        CajaDeTexto.setIcon(ImagenFactory.getImagen(7));
        Atacar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               boolean TurnoJugador = true;
               int damagejugador = Jugador.Atacar();
               int damagemonstruo = monstruo.Atacar();
               monstruo.recibirDamage(damagejugador);
               if(damagejugador>0){
                   CajaDeTexto.setText(Jugador.getNombre()+ " ha hecho "+damagejugador+" de daño");
               }
               else{
                   CajaDeTexto.setText("Hombre lobo ha esquivado el ataque!");
               }
               Atacar.setEnabled(false);
               VidaMonstruo.setText(Integer.toString(monstruo.getVida()));
               Timer timer = new Timer(1000,new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       if(monstruo.getVida()>0){
                           if(damagemonstruo>0){
                               CajaDeTexto.setText("Hombre lobo ha hecho "+damagemonstruo+" de daño a "+Jugador.getNombre());
                           }
                           else{
                               CajaDeTexto.setText(Jugador.getNombre()+" ha esquivado el ataque!");
                           }
                           Jugador.recibirDamage(damagemonstruo);
                           VidaJugador.setText(Integer.toString(Jugador.getVida()));
                           if(Jugador.getVida()>0){
                               Atacar.setEnabled(true);
                           }
                           else{
                               Timer timerPerder = new Timer(2000,Perder);
                               timerPerder.setRepeats(false);
                               timerPerder.start();
                               Timer timerGameOver = new Timer(4000,GameOver);
                               timerGameOver.setRepeats(false);
                               timerGameOver.start();
                               CajaDeTexto.setText(Jugador.getNombre()+" ha sido derrotado!");
                           }
                       }
                       else{
                           Timer timerGanar = new Timer(2000,Ganar);
                           timerGanar.setRepeats(false);
                           timerGanar.start();
                           Timer timerPuntos = new Timer(4000,Puntos);
                           timerPuntos.setRepeats(false);
                           timerPuntos.start();
                           Timer timerTienda = new Timer(6000,Tienda);
                           timerTienda.setRepeats(false);
                           timerTienda.start();
                           
                           CajaDeTexto.setText(Jugador.getNombre()+" ha derrotado a Hombre lobo!");
                       }
                   }
               });
               timer.setRepeats(false);
               timer.start();
               }  
        });
        //Inventario
            
        
        Inventario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame InventarioFrame = new JFrame();
                InventarioFrame.setContentPane(new Inventario());
                InventarioFrame.setResizable(false);
                InventarioFrame.pack();
                InventarioFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                Auxiliar.configClose(InventarioFrame);
                InventarioFrame.setVisible(true);
                Inventario.setEnabled(false);
            }
        });
        
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(Background);
        Background.add(JugadorLabel);
        Background.add(MonstruoLabel);
        Background.add(Atacar);
        Background.add(Inventario);
        Background.add(CajaDeTexto);
        Background.add(VidaMonstruo);
        Background.add(VidaJugador);
        validate();
        AudioPlayer.player.stop(Music.getAudio());
        Music.BattleTheme();
    }

    public static ImageIcon SpriteJugador() {
        return SpriteJugador;
    }

    public static void setSprite(ImageIcon SpriteJugador) {
        Juego.SpriteJugador = SpriteJugador;
    }

    public static JLabel getVidaJugador() {
        return VidaJugador;
    }

    public static void setVidaJugador(JLabel VidaJugador) {
        Juego.VidaJugador = VidaJugador;
    }

    public static JButton getInventario() {
        return Inventario;
    }

    public static void setInventario(JButton Inventario) {
        Juego.Inventario = Inventario;
    }
    
    
    
}
