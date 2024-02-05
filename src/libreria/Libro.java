package libreria;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String isbn;
    private String nombre;
    private Set<Autor> autores;
    private Set<Ejemplar> ejemplares;
    private Tema tema;
    private Editorial editorial;

    public Libro(String isbn, String nombre,Editorial editorial,Tema tema) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.tema = tema;
        this.autores = new HashSet<>();
        this.ejemplares = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void addAutor(Autor autor){
        autores.add(autor);
    }

    public void addEjemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString(){
        return this.isbn + " " + this.nombre;
    }
}
