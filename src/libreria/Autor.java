package libreria;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String cod_aut;
    private String nombre;
    private Set<Libro> libros;

    public Autor(String cod_aut, String nombre) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public String getCod_aut() {
        return cod_aut;
    }

    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
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
        return this.cod_aut + "-" + this.nombre;
    }
}
