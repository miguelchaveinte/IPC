/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoModelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class Modelo {
    
    String mes31 []={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String mes30 []={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    String febreroBis[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};
    String febreroNormal []={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
        
    Map meses;
    
    int hora;
    int minutos;
    
    int annio;
    int mes;
    String mesString;
    int dia;
    
    
    
    Map programasIndice;
    
    ArrayList<String> listaProgramas;
    
    private ArrayList<ArrayList> programacion;
    private ArrayList<int[]> temperaturas;
    
    private ArrayList<Boolean> listaPrograma0= new ArrayList<Boolean>(Arrays.asList(true, false, false, true,false,true));
    private ArrayList<Boolean> listaPrograma1= new ArrayList<Boolean>(Arrays.asList(true, true, true, false,false,false));
    private ArrayList<Boolean> listaPrograma2= new ArrayList<Boolean>(Arrays.asList(false, false, false, true,true,true));
    
    private int temperaturasPrograma0 []= {10,11};
    private int temperaturasPrograma1 []= {20,21};
    private int temperaturasPrograma2 []= {5,11};
    
    
    int contador=3; //contador indice nuevos programas
    boolean horaCambiada=false;
    boolean fechaCambiada=false;
    
    
    /**
     * Creacion del modelo 
     * meses- mapa que relaciona un  mes con su indice
     * programasIndice - mapa que relaciona el nombre de un programa con su indice
     * programacion -arraylist que almacena arraylist de las horas en las que cada programa esta activo,acceso por el indice obtenido de programasIndice
     * temperaturas - arraylist de int[] que guarda la temperatura minima y maxima de cada programa, acceso por el indice obtenido de programasIndice
     */
    public Modelo(){
        meses=new HashMap<String, Integer>();
        programasIndice=new HashMap<String, Integer>();
        programacion=new ArrayList<ArrayList>();
        temperaturas=new ArrayList<int[]>();
        meterMeses();
        meterProgramas();
        meterProgramacion();
        meterTemperaturas();
        hacerArrayPogramas();
       
    }
    
    /**
     * Retorna true si la hora ha sido modificada por el usuario.En caso contrario,false.
     * @return 
     */
    public boolean getCambioHora(){
        return horaCambiada;
    }
    
    /**
     * Retorna un arraylist de los nombres del programa que tenemos
     */
    public void hacerArrayPogramas(){
        Set<String> keySet = programasIndice.keySet();
        listaProgramas= new ArrayList<String>(keySet);
    }
    
    /**
     * Mete los programas prefijados
     */
    public void meterProgramas(){
        programasIndice.put("Programa 0", 0);
        programasIndice.put("Programa 1", 1);
        programasIndice.put("Programa 2", 2);
    }
    
    /**
     * Mete los horarios de activo de los programas prefijados
     */
    public void meterProgramacion(){
        programacion.add(listaPrograma0);
        programacion.add(listaPrograma1);
        programacion.add(listaPrograma2);
    }
    
    /**
     * Mete las temperaturas de los programas prefijados
     */
    public void meterTemperaturas(){
        temperaturas.add(temperaturasPrograma0);
        temperaturas.add(temperaturasPrograma1);
        temperaturas.add(temperaturasPrograma2);
    }
    
    /**
     * Mete los meses con su indice en mapa
     */
    public void meterMeses(){
        meses.put("Enero",1);
        meses.put("Febrero",2);
        meses.put("Marzo",3);
        meses.put( "Abril",4);
        meses.put("Mayo",5);
        meses.put("Junio",6);
        meses.put( "Julio",7);
        meses.put("Agosto",8);
        meses.put("Septiembre",9);
        meses.put("Octubre",10);
        meses.put( "Noviembre",11);
        meses.put("Diciembre",12);
    }
    
    /**
     * Devuelve el array de los dias desde 1-31
     * @return 
     */
    public String[] getMes31(){
        return mes31;
    }

    /**
     * Devuelve el array de los dias desde 1-30
     * @return 
     */
    public String[] getMes30(){
        return mes30;
    }

    /**
     * Devuelve el array de los dias desde 1-29
     * @return 
     */
    public String[] getFebreroBis(){
        return febreroBis;
    }

    /**
     * Devuelve el array de los dias desde 1-28
     * @return 
     */
    public String[] getFebreroNormal(){
        return febreroNormal;
    }

    /**
     * Retorna la hora guardada(la actual o la modificada por el usuario)
     * @return 
     */
    public int getHora(){
        return hora;
    }
    
    /**
     * Retorna los minutos guardados(la actual o la modificada por el usuario)
     * @return 
     */
    public int getMinutos(){
        return minutos;
    }
    
    /**
     * Setea la hora
     * @param hora 
     */
    public void setHoras(int hora) {
        this.hora=hora;
    }

    /**
     * Setea los minutos
     * @param minutos 
     */
    public void setMinutos(int minutos) {
       this.minutos=minutos;
    }
    
    /**
     * Setea el año
     * @param annio 
     */
    public void setAnnio(int annio){
        this.annio=annio;
    }
    
    /**
     * Setea el mes
     * @param mes 
     */
    public void setMes(String mes){
        int indice=(int) meses.get(mes);
        this.mes=indice;
    }
    
    /**
     * Setea el dia
     * @param dia 
     */
    public void setDia(int dia){
       this.dia=dia;
    }
   
    /**
     * Obtiene el año guardado(el actual o el modificado por el usuario)
     * @return 
     */
    public int getAnnio(){
        return annio;
    }
    
    /**
     * Obtiene el mes guardado(el actual o el modificado por el usuario)
     * @return 
     */
    public int getMes(){
        return mes;
    }
    
    /**
     * Obtiene el mes en formato string
     * @return 
     */
    public String getMesString(){
        return mesString;
    }
    
    /**
     * Obtiene el dia guardado(el actual o el modificado por el usuario)
     * @return 
     */
    public int getDia(){
       return dia;
    }
    
    /**
     * Obtiene el día de la semana a partir del año,mes y dia guardados
     * @return 
     */
    public int getDiaSemana(){
        GregorianCalendar calendar = new GregorianCalendar(annio, mes-1, dia);
        int i = calendar.get(Calendar.DAY_OF_WEEK); // 1- domingo , 2 - lunnes ...
        return i;
    }

    /**
     * Añadir un nuevo programa 
     * @param nombreProgramaNuevo 
     */
    public void addHash(String nombreProgramaNuevo) {
        if(!programasIndice.containsKey(nombreProgramaNuevo)){
            programasIndice.put(nombreProgramaNuevo,contador);
            contador++;
            hacerArrayPogramas();
        }
    }

    /**
     * Añadir programación de horarios de un nuevo programa
     * @param intervalos 
     */
    public void addProgramacion(List<Boolean> intervalos) {
        programacion.add((ArrayList) intervalos);
    }

    /**
     * Añadir temperaturas de un nuevo programa
     * @param temperaturaMinima
     * @param temperaturaMaxima 
     */
    public void addTemperatura(int temperaturaMinima, int temperaturaMaxima) {
        int temperatura [] ={temperaturaMinima,temperaturaMaxima};
        temperaturas.add(temperatura);
    }

    /**
     * Cuando se cambia un nombre, se le cambia en el hashmap
     * @param programaComboBox
     * @param nuevoNombre 
     */
    public void actualizarHash(String programaComboBox,String nuevoNombre) {
        int indice=(int) programasIndice.get(programaComboBox);
        programasIndice.remove(programaComboBox);
        programasIndice.put(nuevoNombre, indice);
        hacerArrayPogramas();
    }

    /**
     * Obtener el indice relativo al nombre de un programa
     * @param nombrePrograma
     * @return 
     */
    public int obtenerIndiceHash(String nombrePrograma){
        return (int) programasIndice.get(nombrePrograma);
    }

    /**
     * Retorna true si el nombre del programa ya esta en el hashmap de programas, por tanto ya utilizado el nombre.
     * @param nombreProgramaNuevo
     * @return 
     */
    public boolean contienePrograma(String nombreProgramaNuevo) {
        return programasIndice.containsKey(nombreProgramaNuevo);
    }
    
    /**
     * Retorna el array de los nombres de los programas
     * @return 
     */
    public ArrayList<String> getProgramas(){
        return listaProgramas;
    }
    
    /**
     * Obtiene la clave(indice ) de un programa dado
     * @param programa
     * @return 
     */
    public int obtenerClave(String programa){
        return (int)programasIndice.get(programa);
    }
    
    /**
     * Obtiene los intervalos de tiempos de un programa dado el indice de un programa
     * @param i
     * @return 
     */
    public ArrayList<Boolean> getHorarios(int i){
        return programacion.get(i);
    }
    
    /**
     * Obtiene las temperaturas de un programa dado el indice de un programa
     * @param i
     * @return 
     */
    public int[] getTemperaturas(int i){
        return temperaturas.get(i);
    }

    /**
     * Guarda la temperatura minima de un determinado programa
     * @param temperaturaMinima
     * @param programa 
     */
    public void setTemperaturaMinima(int temperaturaMinima, String programa) {
        int i=obtenerClave(programa);
        int nuevatemperatura[]={temperaturaMinima,(int)temperaturas.get(i)[1]};
        temperaturas.set(i,nuevatemperatura);
    }

    /**
     * Guarda la temperatura maxima de un determinado programa
     * @param temperaturaMaxima
     * @param programa 
     */
    public void setTemperaturaMaxima(int temperaturaMaxima, String programa) {
        int i=obtenerClave(programa);
        int nuevatemperatura[]={(int)temperaturas.get(i)[0],temperaturaMaxima};
        temperaturas.set(i,nuevatemperatura);
    }

    /**
     * Cambia los intervalos de tiempo de un programa dado su clave(indice)
     * @param miPrograma
     * @param clave 
     */
    public void cambiarHorarios(ArrayList<Boolean> miPrograma,int clave) {
        programacion.set(clave, miPrograma);
    }

    /**
     * Se pone a true si el usuario cambio la hora
     */
    public void setHoraCambiada() {
       horaCambiada=true;
    }

    /**
     * Se pone a true si el usuario cambio la fecha
     */
    public void setFechaCambiada() {
       horaCambiada=true;
    }
    
    /**
     * Retorna true si la fecha fue cambiada por el usuario, sino false
     * @return 
     */
    public boolean getFechaCambiada() {
       return horaCambiada;
    }
    
    /**
     * Guarda el cambio de mes que ha realizado el usuario
     * @param mes 
     */
    public void guardarMes(int mes) {
        Iterator it=meses.keySet().iterator();
        boolean noObtenido=true;
        while(it.hasNext() && noObtenido){
            String key=(String) it.next();
            int valor=(int) meses.get(key);
            if(valor==mes){
                noObtenido=false;
                mesString=key;
            }
        }
        setMes(mesString);
    }
}
