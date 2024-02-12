package subasta;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String idSubasta;
    private Set<Puja> pujas;

    public Subasta(String idSubasta) {
        this.idSubasta = idSubasta;
        this.pujas = new HashSet<>();
    }

    public String getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(String idSubasta) {
        this.idSubasta = idSubasta;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    @Override
    public String toString() {
        return this.idSubasta;
    }
}
