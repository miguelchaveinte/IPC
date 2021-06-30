/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostato;


import my.termostatoModelo.Modelo;
import my.termostatoVista.*;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class Main {
       private static MaquinaDeEstados maquina;
       
       private static Modelo model; 

       /**
        * Creamos la maquina de estados
        * @param args 
        */
       public static void main(String args[]) {
            model=new Modelo();
            maquina = new MaquinaDeEstados(model);
        }
    
       /**
        * Retorna la maquina de estados
        * @return 
        */
       public static MaquinaDeEstados getStateMachineLogin() {
            return maquina;
       }

    }
