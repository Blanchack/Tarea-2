package Tarea1;

import Tarea1.Dulce;

/**
 * Un dulce de tipo Tarea1.Snickers
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */
public class Snickers extends Dulce {
    
    /**Metodo constructor clase Tarea1.Snickers.
    * @param s primero int
    */
    public Snickers(int s){
        super(s);
    }
    
    /**Metodo consumir
    * return un string con el nombre del producto "snickers".
    */
    public String consumir(){
        return "snickers";
    }
}
