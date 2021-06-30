/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import java.util.ArrayList;
import my.termostatoModelo.*;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class ControladorNA {
    private VistaMain vista;
    private ModeloNA modelo;
    
    /**
     * Constructor de llamadas a vista y modelo
     * @param v
     * @param m 
     */
    public ControladorNA(VistaMain v,ModeloNA m){
        vista=v;
        modelo=m;
    }

    /**
     * Llama a vista.cambiarMenusHoras() que gestiona los componentes de la vista cuando se 
     * cambia de programa en el comboBox
     */
    public void procesaCambioPrograma() {
        vista.cambiarMenusHoras();
        
    }
    
    /**
     * Llama a  vista.botonesAutomatico() que gestiona los componentes de la vista cuando se 
     * cambia de programa en el comboBox
     */
    public void cambioTextoAutomatico(){
        vista.botonesAutomatico();
    }

    /**
     * Gestiona el evento de pulsación de un botón de la franja horaria actualizandolo en el modelo
     * y en la vista
     * @param i - La franja que ha sido pulsada (0 para la primera franja,1 para la segunda,...)
     */
    public void procesaHoraPulsada(int i) {
        String programa=vista.obtenerPrograma();
        ArrayList<Boolean> nuevaList= modelo.getLista(programa);
        nuevaList.set(i, !nuevaList.get(i));
        modelo.actualizarLista(nuevaList,programa);
        vista.cambiarMenusHoras();
        
    }

    /**
     * Gestiona los componentes de la vista cuando se da al botón de inicio para apagar el termostato
     */
    public void apagarPantalla() {
       vista.actualizarBotonesManual(false);
       vista.eliminarPanel();
    }

    /**
     * Gestiona los componentes de la vista cuando se da al botón de inicio para encender el termostato
     */
    public void encenderPantalla() {
        vista.actualizarBotonesManual(true);
    }

    
    /**
     * Gestiona los componentes de la vista cuando se da al botón del modo automatico
     */
    public void modoAutomatico() {
        vista.eliminarPanel();
        vista.actualizarBotonesAutomatico();
        vista.botonesAutomatico();
    }   

    /**
     * Gestiona los componentes de la vista cuando se da al botón del modo manual
     */
    public void modoManual() {
        vista.eliminarPanel();
        vista.crearPanelManual();
    }

    /**
     * Gestiona los componentes de la vista cuando se da al botón del modo edicion
     */
    public void modoEdicion() {
        vista.botonesEdicion();
    }

    /**
     * Gestiona los componentes de la vista cuando se da al botón del modo de inciar en el modo manual
     */
    public void inicioModoManual() {
        vista.actualizarBotonesAutomatico();
        vista.ponerIconAutomatico();
    }

    /**
     * Gestiona el cambio en la temperatura maxima seleccionada con el jspinner. Si la temperatura máxima 
     * seleccionada es menor que la temperatura mínima previamente acordada se hará tambien un cambio de 
     * la temperatura mínima que quedará como la máxima seleccionada -1.
     */
    public void procesaTemperaturaMaxima() {
        modelo.setTemperaturaMaxima(vista.getTemperaturaMaxima(),vista.obtenerPrograma());
        if(vista.getTemperaturaMinima()>=vista.getTemperaturaMaxima()){
           vista.setTempMinima(vista.getTemperaturaMaxima()-1);
           modelo.setTemperaturaMinima(vista.getTemperaturaMaxima()-1,vista.obtenerPrograma());
        }
    }

    
    /**
     * Gestiona el cambio en la temperatura minima seleccionada con el jspinner. Si la temperatura minima 
     * seleccionada es mayor que la temperatura máxima previamente acordada se hará tambien un cambio de 
     * la temperatura máxima que quedará como la mínima seleccionada +1.
     */
    public void procesaTemperaturaMinima() {
        modelo.setTemperaturaMinima(vista.getTemperaturaMinima(),vista.obtenerPrograma());
        if(vista.getTemperaturaMinima()>=vista.getTemperaturaMaxima()){
           vista.setTempMaxima(vista.getTemperaturaMinima()+1);
           modelo.setTemperaturaMaxima(vista.getTemperaturaMinima()+1,vista.obtenerPrograma());
        }
    }
}
