package subasta;

import java.util.HashSet;
import java.util.Set;

public class Puja {
    private static int contador = 0;
    private int idPuja;
    private int precioInicial;
    private Set<Lote> lotes;
    private Pujador pujador;
    private Subasta subasta;

    public Puja(Subasta subasta,int precioInicial) {
        this.idPuja = contador++;
        this.subasta = subasta;
        this.precioInicial = precioInicial;
        lotes = new HashSet<>();
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public int getIdPuja() {
        return idPuja;
    }

    public void setIdPuja(int idPuja) {
        this.idPuja = idPuja;
    }

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public void addLote(Lote lote){
        this.lotes.add(lote);
    }

    @Override
    public String toString() {
        return this.idPuja+" "+this.precioInicial;
    }
}
