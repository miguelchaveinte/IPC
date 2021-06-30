/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import my.termostato.Main;
import my.termostatoVista.*;
import my.termostatoModelo.*;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class ControladorConf {
    
    private VistaConf vista;
    private Modelo modelo;
    
    /**
     * Constructor
     * @param vista
     * @param model 
     */
    public ControladorConf(VistaConf vista, Modelo model){
        this.vista=vista;
        modelo=model;
        if(!modelo.getFechaCambiada()) setDia();
        if(!modelo.getCambioHora())setTime();  
    }

    /**
     * Se ha dado al boton de cancelar, por lo que cargamos esa vista
     */
    public void procesaNavegaInicio() {
           Main.getStateMachineLogin().inicio();
    }
    
    /**
     * Gestiona los cambios en el numero de dias cuando se cambia de mes
     */
    public void cambioMes() {
        String mes=vista.getMes();
        int diaSeleccionado= vista.getDias();
        if(mes=="Enero"||mes=="Marzo"||mes=="Mayo"||mes=="Julio"||mes=="Agosto"||mes=="Octubre"||mes=="Diciembre"){
            vista.setDias31();
        }
        else if(mes=="Febrero"){
            GregorianCalendar calendario = new GregorianCalendar();
            int annio = vista.getAnnio();
            if(calendario.isLeapYear(annio)){
                vista.setDias29();
            } 
            else{
                vista.setDias28();
            }
        }
        else{
            vista.setDias30();
        }
        vista.seleccionarDia(diaSeleccionado);
    }

    /**
     * Gestiona los cambios en el numero de dias cuando se cambia de año
     */
    public void cambioAnnio() {
        int diaSeleccionado= vista.getDias();
        GregorianCalendar calendario = new GregorianCalendar();
        int annio = vista.getAnnio();
        String mes=vista.getMes();
        if(calendario.isLeapYear(annio) && mes=="Febrero"){
            vista.setDias29();
        }
        else if (!calendario.isLeapYear(annio) && mes=="Febrero"){
            vista.setDias28();
        }
        else if(mes=="Enero"||mes=="Marzo"||mes=="Mayo"||mes=="Julio"||mes=="Agosto"||mes=="Octubre"||mes=="Diciembre"){
            vista.setDias31();
        }
        else{
            vista.setDias30();
        }
        vista.seleccionarDia(diaSeleccionado);
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
     * Setea en el modelo la hora actual
     */
    public void setTime(){
        String hora=obtenerHora();
        String array []=hora.split(":");
        modelo.setHoras(Integer.valueOf(array[0])); 
        modelo.setMinutos(Integer.valueOf(array[1]));
        
    }

    /**
     * Setea en el modelo la hora marcada por el usuario
     */
    public void setHora() {
        modelo.setHoras(vista.getHora());
        modelo.setHoraCambiada();
    }
    
    /**
     * Setea en el modelo los minutos marcados por el usuario
     */
    public void setMinutos(){
        modelo.setMinutos(vista.getMinutos());
        modelo.setHoraCambiada();
    }
    
    /**
     * Setea la fecha marcada por el usuario
     */
    public void setFecha(){
        modelo.setAnnio(vista.getAnnio());
        modelo.setMes(vista.getMes());
        modelo.setDia(vista.getDias());
        modelo.setFechaCambiada();
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
