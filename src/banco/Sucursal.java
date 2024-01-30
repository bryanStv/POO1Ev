package banco;

import java.util.HashSet;
import java.util.Set;

class Sucursal {
    private String n_suc;
    private Banc banco;
    private Set<Prestec> prestamos;

    public Sucursal(String n_suc, Banc banco) {
        this.n_suc = n_suc;
        this.banco = banco;
        this.prestamos = new HashSet<>();
    }

    public String getN_suc() {
        return n_suc;
    }

    public void setN_suc(String n_suc) {
        this.n_suc = n_suc;
    }

    public Banc getBanco() {
        return banco;
    }

    public void setBanco(Banc banco) {
        this.banco = banco;
    }

    public Set<Prestec> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestec> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestec(Prestec prestamo){
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return this.n_suc;
    }
}
