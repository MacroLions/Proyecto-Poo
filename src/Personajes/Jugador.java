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
    ArrayList<Consumible> Consumibles;
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

    public boolean ValidarComprar() {
        boolean compraRealizada;
        if (Jugador.getCompra() > Jugador.getPuntos()) {
            compraRealizada = false;
        } else if (Jugador.getCompra() == 0) {
            compraRealizada = false;
        } else {
            compraRealizada = true;
        }
        return compraRealizada;
    }

}
