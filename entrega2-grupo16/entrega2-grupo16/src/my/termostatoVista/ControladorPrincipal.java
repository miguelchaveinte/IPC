/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import my.termostato.Main;
import my.termostatoModelo.Modelo;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class ControladorPrincipal {

    private VistaPrincipal vista;
    private Modelo modelo;
    
    /**
     * Constructor
     * @param vista
     * @param model 
     */
    public ControladorPrincipal(VistaPrincipal vista, Modelo model){
        this.vista=vista;
        modelo=model;
        if(!modelo.getCambioHora())setTime(); 
        if(!modelo.getFechaCambiada()) setDia();
    }
    
    /**
     * Procesa en cambio de ventana a VistaConf
     */
    public void procesaNavegaConf() {
           Main.getStateMachineLogin().configuracion();
    }
    
    /**
     * Procesa en cambio de ventana a VistaGest
     */
    public void procesaNavegaGest() {
           Main.getStateMachineLogin().gestionProgramas();
    }
    
    /**
     * Procesa en cambio de ventana a VistaTermostato
     */
    public void procesaNavegaTer() {
           Main.getStateMachineLogin().termostato();
    }
    
    /**
     * Obtiene la hora actual 
     * @return hora en formato: hora+":"+minutos
     */
    public String obtenerHora(){
        LocalDateTime locaDate= LocalDateTime.now();        
        int hours=locaDate.getHour();
        String minutes=String.valueOf(locaDate.getMinute());
        if(Integer.parseInt(minutes)<10) minutes="0"+minutes;
        return(hours+":"+minutes);
    }
    
    /**
     * Setea la hora actual
     */
    public void setTime(){
        String hora=obtenerHora();
        String array []=hora.split(":");
        modelo.setHoras(Integer.valueOf(array[0])); 
        modelo.setMinutos(Integer.valueOf(array[1]));
        
    }
    
    /**
     * Setea la fecha actual
     */
    public void setDia() {
        String hoy=LocalDate.now().toString();
        String array [] =hoy.split("-");
        modelo.setAnnio(Integer.parseInt(array[0]));
        modelo.guardarMes(Integer.parseInt(array[1]));
        modelo.setDia(Integer.parseInt(array[2]));
    }
    
}
