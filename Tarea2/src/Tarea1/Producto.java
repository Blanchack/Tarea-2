package Tarea1;

/**
 * Tarea1.Producto que sera almacenado en un expendedor
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

public abstract class Producto { //Clase abstracta que pasara sus atributos y metodos a sus clases hijas Tarea1.Bebida y Tarea1.Dulce.

    private int serie; //Almacena un un numero entero que identifica a cada producto.
    
    /** Metodo constructor clase Tarea1.Producto.
    * @param serie primero int 
    */
    public Producto(int serie) {
        this.serie = serie;
        System.out.println("Se creo un prducto con serie"+ getSerie());
    }

    // Metodo getSerie, retorna el numero de serie de un producto.
    public int getSerie(){
        return serie;
    }
    
    // Metodo abstracto consumir, en las siguientes subclases retornara un string que indica el producto consumido.
    public abstract String consumir();

}
