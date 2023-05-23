/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Juego;
import entidades.RevolverDeAgua;
import servicios.RevolverDeAguaService;

/**
 *
 * @author jorge
 */
public class Main {

    /*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:*/
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.llenarJuego();
        juego.ronda();
     }
}
