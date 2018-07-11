/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Objetos.Arma;
import Objetos.Consumible;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mai Perez
 */
public class Jugador {

    static String nombre = "Juanito Scarlet";
    static int Puntos;
    static int compra;
    static ArrayList<Consumible> Consumibles = new ArrayList<Consumible>();
    static Arma ArmaActual = new Arma("Mani", 30);
    static int vida = 200;

    public Jugador() {
    }

    public Jugador(String nombre) {
        Jugador.nombre = nombre;
    }

    public static int Atacar() {

        int DamageReal = new Random().nextInt((ArmaActual.getDamage()
                - ArmaActual.getDamageMin()) + 1) + ArmaActual.getDamageMin();

        return DamageReal;
    }

    public static void recibirDamage(int damageRecibido) {
        vida = vida - damageRecibido;
    }

    public static int getPuntos() {
        return Puntos;
    }

    public static void setPuntos(int Puntos) {
        Jugador.Puntos = Puntos;
    }

    public static int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
        Jugador.vida = vida;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Jugador.nombre = nombre;
    }

    public static int getCompra() {
        return compra;
    }

    public static void setCompra(int compra) {
        Jugador.compra = compra;
    }

    public boolean ValidarCompra() {
        boolean compraRealizada;
        if (Jugador.getPuntos() == 0) {
            compraRealizada = false;
            System.out.println("no deberia funcionar");
        } else if(Jugador.getCompra() > Jugador.getPuntos() && Jugador.getPuntos() > 0){
            System.out.println("no debe");
            compraRealizada = false;
        }
        else {
            System.out.println("DEBE FUNCIONAR");
            compraRealizada = true;
        }
        return compraRealizada;
    }
    
    public static boolean ValidarCompra(int Deuda){
        if(Deuda> Jugador.Puntos){
            System.out.println("No se puede");
            return false;
        }
        else{
            return true;
        }
    }

    public static Arma getArmaActual() {
        return ArmaActual;
    }

    public static void setArmaActual(Arma ArmaActual) {
        Jugador.ArmaActual = ArmaActual;
    }

    public static ArrayList<Consumible> getConsumibles() {
        return Consumibles;
    }

    public static void setConsumibles(ArrayList<Consumible> Consumibles) {
        Jugador.Consumibles = Consumibles;
    }
    

}
