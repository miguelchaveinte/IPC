/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostato;

import javax.swing.JFrame;
import my.termostatoModelo.Modelo;
import my.termostatoVista.*;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class MaquinaDeEstados {
    private JFrame currentState;
    private static Modelo modelo;
    
    /**
     * VistaPrincipal al principio
     * @param model 
     */
    public MaquinaDeEstados(Modelo model) {
        modelo=model;
        java.awt.EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    currentState = new VistaPrincipal(model);
                    currentState.setVisible(true);
                }
            });
    } 
    
    /**
     * VistaGestion
     */
    public void gestionProgramas() {
        currentState.setVisible(false); // si se desea ocultar
        currentState.dispose(); // si se desea destruir
        //realiza transición
        java.awt.EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    currentState = new VistaGest(modelo);
                    currentState.setVisible(true);
                }
            });
        } //gestionProgramas
    
    /**
     * VistaConfiguracion
     */
    public void configuracion() {
        currentState.setVisible(false); // si se desea ocultar
        currentState.dispose(); // si se desea destruir
        //realiza transición
        java.awt.EventQueue.invokeLater(
            new Runnable() {
            public void run() {
                currentState = new VistaConf(modelo);
                currentState.setVisible(true);
            }
        });
    } //configuracion
    
    /**
     * Ver VistaTermostato
     */
    public void termostato() {
        currentState.setVisible(false); // si se desea ocultar
        currentState.dispose(); // si se desea destruir
        //realiza transición
        java.awt.EventQueue.invokeLater(
            new Runnable() {
            public void run() {
                currentState = new VistaTermostato(modelo);
                currentState.setVisible(true);
    }
    });
    } //termostato
    
    /**
     * Ver VistaPrincipal
     */
    public void inicio() {
        currentState.setVisible(false); // si se desea ocultar
        currentState.dispose(); // si se desea destruir
        //realiza transición
        java.awt.EventQueue.invokeLater(
            new Runnable() {
            public void run() {
                currentState = new VistaPrincipal(modelo);
                currentState.setVisible(true);
    }
    });
    } //termostato
}
