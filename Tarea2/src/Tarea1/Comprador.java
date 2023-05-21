package Tarea1;

/**
 * Clase que simula a un comprador inresando dinero y seleccionando un producto en un expendedor.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 * @see PagoIncorrectoException
 */

class Comprador{
    private String sonido;
    private int vuelto;
    
    /** Metodo constructor clase Tarea1.Comprador
    * @param m primero Moneda 
    * @param productoId segundo int
    * @param ex tercero Expendedor
    * @throws PagoIncorrectoException  puede lanzar esta excepción si la moneda ingresada no es valida (null).
    */

    public Comprador(Moneda m, int productoId, Expendedor ex) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        //Ya no usamos comprador, todas las compras se hacen directamente a traves de la GUI
    }
    
    // Metodo cuantoVuelto, retorna el valor del vuelto retirado por el comprador.
    public int cuantoVuelto() {return vuelto;}
    
    // Metodo queConsumiste, retorna un string indicando el producto adquirido por el comprador desde el expendedor.
    public String queConsumiste() {return sonido;}

}
