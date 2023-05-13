package Tarea1;

import Tarea1.Dulce;

/**
 * Un dulce de tipo Tarea1.Super8
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */
public class Super8 extends Dulce {

    /**Metodo constructor clase Tarea1.Super8.
    * @param s primero int
    */
    public Super8(int s){
        super(s);
    }

    /**Metodo consumir
    * return un string con el nombre del producto "super8".
    */
    public String consumir(){
        return "super8";
    }
}
