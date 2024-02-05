package libreria;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private String n_reg;
    private Libro libro;
    private Set<Historico> historicos;
    private Set<String> fechasPrestamo;

    public Ejemplar(String n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.historicos = new HashSet<>();
        this.fechasPrestamo = new HashSet<>();
    }

    public String getN_reg() {
        return n_reg;
    }

    public void setN_reg(String n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    public Set<String> getFechasPrestamo() {
        return fechasPrestamo;
    }

    public void setFechasPrestamo(Set<String> fechasPrestamo) {
        this.fechasPrestamo = fechasPrestamo;
    }

    public void addFechaPrestamo(String fecha){
        fechasPrestamo.add(fecha);
    }
    public void addHistorico(Historico historico){
        historicos.add(historico);
    }
    @Override
    public String toString(){
        return this.n_reg;
    }
}
