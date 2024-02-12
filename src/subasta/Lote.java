package subasta;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int numeroLote;
    private int precioSalida = 0;
    private Set<Articulo> articulos;
    private Puja puja;

    public Lote(int numeroLote, Puja puja) {
        this.numeroLote = numeroLote;
        this.puja = puja;
        this.articulos = new HashSet<>();
    }

    public Puja getPuja() {
        return puja;
    }

    public void setPuja(Puja puja) {
        this.puja = puja;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(int precioSalida) {
        this.precioSalida = precioSalida;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
        this.precioSalida += articulo.getPrecio();
    }

    @Override
    public String toString(){
        return this.numeroLote + ": " + this.precioSalida;
    }
}
