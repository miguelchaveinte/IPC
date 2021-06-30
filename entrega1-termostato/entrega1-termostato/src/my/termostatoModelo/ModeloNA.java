package my.termostatoModelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class ModeloNA {
        
    private ArrayList<Boolean> listaPrograma0= new ArrayList<Boolean>(Arrays.asList(true, false, false, true,false,true));
    private ArrayList<Boolean> listaPrograma1= new ArrayList<Boolean>(Arrays.asList(true, true, true, false,false,false));
    private ArrayList<Boolean> listaPrograma2= new ArrayList<Boolean>(Arrays.asList(false, false, false, true,true,true));
    
    private int temperaturasPrograma0 []= {10,11};
    private int temperaturasPrograma1 []= {20,21};
    private int temperaturasPrograma2 []= {5,11};
    
    public ModeloNA(){

    }
    
    /**
     * Getter de la lista que contiene qué franjas horarias están seleccionadas para cada tipo de programa.
     * @param programa- Programa seleccionado
     * @return retorno -Arraylist de booleans que indican si el boton esta seleccionado(true) o no (false).
     */
    public ArrayList getLista(String programa){
        ArrayList<Boolean> retorno=null;
        switch(programa)
        {
            case "Programa 0": retorno=listaPrograma0;
            break;

            case "Programa 1": retorno=listaPrograma1;
            break;
            
            case "Programa 2": retorno=listaPrograma2;
            break;
        }
        return retorno;
    }

    /**
     * Actualiza la lista de las franjas horarias con la lista nueva recibida que es ya la actualizada
     * @param nuevaList - lista actualizada de las franjas seleccionadas
     * @param programa -Programa seleccionado de las franjas 
     */
    public void actualizarLista(ArrayList<Boolean> nuevaList, String programa) {
        switch(programa)
        {
            case "Programa 0": listaPrograma0=nuevaList;
            break;

            case "Programa 1": listaPrograma1=nuevaList;
            break;
            
            case "Programa 2": listaPrograma2=nuevaList;
            break;
        }
    }

    /**
     * Settea la temperatura máxima de un determinado programa
     * @param temperaturaMaxima temperatura maxima seleccionada
     * @param programa Programa seleccionado
     */
    public void setTemperaturaMaxima(int temperaturaMaxima, String programa) {
       switch(programa)
        {
            case "Programa 0": temperaturasPrograma0[1]=temperaturaMaxima;
            break;

            case "Programa 1": temperaturasPrograma1[1]=temperaturaMaxima;
            break;
            
            case "Programa 2": temperaturasPrograma2[1]=temperaturaMaxima;
            break;
        }
    }

    /**
     * Settea la temperatura minima de un determinado programa
     * @param temperaturaMinima temperatura minima seleccionada
     * @param programa Programa seleccionado
     */
    public void setTemperaturaMinima(int temperaturaMinima, String programa) {
        switch(programa)
        {
            case "Programa 0": temperaturasPrograma0[0]=temperaturaMinima;
            break;

            case "Programa 1": temperaturasPrograma1[0]=temperaturaMinima;
            break;
            
            case "Programa 2": temperaturasPrograma2[0]=temperaturaMinima;
            break;
        }
    }
    
    /**
     * Getter de las temperaturas de un determinado programa
     * @param programa Programa seleccionado
     * @return array con la temperatura minima en el incice 0 y la tempera maxima en el indice 1.
     */
    public int [] getTemperaturas(String programa){
        int retorno[]=null;
        switch(programa)
        {
            case "Programa 0": retorno=temperaturasPrograma0;
            break;

            case "Programa 1": retorno=temperaturasPrograma1;
            break;
            
            case "Programa 2": retorno=temperaturasPrograma2;
            break;
        }
        return retorno;
    }


    
}
