package Tarea1;

/**
 * Clase que simula a un comprador inresando dinero y seleccionando un producto en un expendedor.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 * @see PagoIncorrectoException
 */

public Comprador(Moneda m, int productoId, Expendedor ex) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        vuelto = 0;
        sonido = "null";
        
        if( m ==  null){ 
            throw new PagoIncorrectoException("Se intento comprar sin moneda"); 
        }

        ex.comprarProducto(m, productoId);

        Producto p = ex.getP();

        if(p != null) {
            sonido = p.consumir();
        }
        Moneda aux = ex.getVuelto();
        while (aux != null){
            vuelto += aux.getValor();
            aux = ex.getVuelto();
        }
    }
    
    // Metodo cuantoVuelto, retorna el valor del vuelto retirado por el comprador.
    public int cuantoVuelto() {return vuelto;}
    
    // Metodo queConsumiste, retorna un string indicando el producto adquirido por el comprador desde el expendedor.
    public String queConsumiste() {return sonido;}

}
