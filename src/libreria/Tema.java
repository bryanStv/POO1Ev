package libreria;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String cod_t;
    private String nombre;
    private Set<Libro> libros;

    public Tema(String cod_t, String nombre) {
        this.cod_t = cod_t;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public String getCod_t() {
        return cod_t;
    }

    public void setCod_t(String cod_t) {
        this.cod_t = cod_t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }
    @Override
    public String toString(){
        return this.cod_t + " " + this.nombre;
    }
}
