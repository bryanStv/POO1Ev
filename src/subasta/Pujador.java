package subasta;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String ID;
    private String name;
    private int dinero;
    Set<Puja> pujas;

    public Pujador(String ID, String name, int dinero) {
        this.ID = ID;
        this.name = name;
        this.dinero = dinero;
        this.pujas = new HashSet<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
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
        return this.name+"("+this.ID+") --> "+this.dinero;
    }
}
