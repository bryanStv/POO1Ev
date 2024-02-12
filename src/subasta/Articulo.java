package subasta;

public class Articulo {
    private String nombre;
    private Lote lote;

    public Articulo(String nombre, Lote lote) {
        this.nombre = nombre;
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
