package Tarea1;

/**
 * Representacion de un dulce que hereda atributos y metodos de Produto para pasarlos a sus subclases Tarea1.Snickers y Tarea1.Super8.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

abstract class Dulce extends Producto {

    /**Metodo constructor clase Tarea1.Dulce
    * @param serie primero int
    */
    public Dulce(int serie){
        super(serie);

    }
}
