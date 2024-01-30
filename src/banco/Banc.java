package banco;

import java.util.HashSet;
import java.util.Set;

class Banc {
    private String nombre;
    private int n_ent;
    private Set<Sucursal> sucursales;

    public Banc(String nombre, int n_ent) {
        this.nombre = nombre;
        this.n_ent = n_ent;
        this.sucursales = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return this.nombre + "-->" +this.n_ent;
    }
}
