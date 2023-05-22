package Tarea1;

import Tarea1.Bebida;

/**
 * Una bebida de tipo Tarea1.Sprite
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

public class Sprite extends Bebida {

    /**Metodo constructor clase Tarea1.Sprite.
     * @param s primero int
     */
    public Sprite(int s){
        super(s);
    }

    /**Metodo consumir
     * return un string con el nombre del producto "sprite".
     */
    public String consumir(){
        return "sprite";
    }
}