package Tarea1;

/**
 * Clase Tarea1.Moneda, usada por Tarea1.Comprador y Tarea1.Expendedor.
 */
public abstract class Moneda implements Comparable<Moneda>{

    protected int valor;
    protected int serie;

    public Moneda(int serie){
        this.serie = serie;
        System.out.println("Se creo una moneda de serie" + getSerie());
    }
    public int getSerie(){
        return serie;
    }

    public abstract int getValor();

    /**
     * Compara 2 monedas segun su valor.
     * @param m la moneda que se compara.
     * @return La diferencia de valor entre las 2 monedas.
     */
    public int compareTo(Moneda m) {
        return (this.getValor() - m.getValor());
    }
}