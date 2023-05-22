package Tarea1;

import Tarea1.Moneda;

/**
 * Tarea1.Moneda de 15000
 */
public class Moneda1500 extends Moneda {
    public Moneda1500(int serie){
        super(serie);
        super.valor = 1500;
    }
    public int getValor(){
        return super.valor;
    }
}