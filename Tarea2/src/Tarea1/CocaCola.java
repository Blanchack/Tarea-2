package Tarea1;

import Tarea1.Bebida;

/**
 * Una bebida de tipo Tarea1.CocaCola
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

class CocaCola extends Bebida {

    /**Metodo constructor clase Tarea1.CocaCola.
     * @param s primero int
     */
    public CocaCola(int s){
        super(s);
    }

    /**Metodo consumir
     * return un string con el nombre del producto "cocacola".
     */
    public String consumir(){
        return "cocacola";
    }
}