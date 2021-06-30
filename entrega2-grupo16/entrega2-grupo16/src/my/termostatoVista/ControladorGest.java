/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import my.termostato.Main;
import my.termostatoModelo.Modelo;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class ControladorGest {
    private VistaGest vista;
    private Modelo modelo;
       
    /**
     * Constructor
     * @param vista
     * @param model 
     */
    public ControladorGest(VistaGest vista, Modelo model){
        this.vista=vista;
        modelo=model;
    }
    
    /**
     * Se ha dado al boton de inicio, por lo que cargamos esa vista
     */
    public void procesaNavegaInicio() {
           Main.getStateMachineLogin().inicio();
    }
    
    /**
     * Gestiona lo de guardar un programa nuevo
     */
    public void addPrograma(){
        modelo.addHash(vista.getNombreProgramaNuevo());
        modelo.addProgramacion(vista.getIntervalos());
        modelo.addTemperatura(vista.getTemperaturaMinima(),vista.getTemperaturaMaxima());
    }

    /**
     * Gestiona el cambioo de nombre de un programa
     */
    public void cambiarPrograma() {
       modelo.actualizarHash(vista.getProgramaComboBox(),vista.nuevoProgramaText());
    }

    /**
     * Gestiona que la temperatura minima nunca sea superior ni igual a la maxima
     */
    public void observarTempMinima() {
        if(vista.getTemperaturaMinima()>=vista.getTemperaturaMaxima()){
           vista.setTempMaxima(vista.getTemperaturaMinima()+1);
        }
    }
    
    /**
     * Gestiona que la temperatura maxima nunca sea inferior ni igual a la maxima
     */
    public void observarTempMaxima() {
        if(vista.getTemperaturaMinima()>=vista.getTemperaturaMaxima()){
           vista.setTempMinima(vista.getTemperaturaMaxima()-1);
        }
    }
}
