package subasta;

public class Articulo {
    private String nombre;
    private int precio;
    private Lote lote;

    public Articulo(String nombre,int precio, Lote lote) {
        this.nombre = nombre;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
