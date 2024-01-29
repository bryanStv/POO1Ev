import java.util.Arrays;
import java.util.LinkedList;

public class MainLibro {
    public static void main(String[] args) {
        Autor pepe = new Autor("Pepe","01-01-1980");
        Autor paco = new Autor("Paco","01-01-1960");
        LinkedList<Tema> listaTemas = new LinkedList<>();
        Tema misterio = new Tema("Misterio");
        listaTemas.add(misterio);
        listaTemas.add(new Tema("Acción"));
        Libro libroMisterio1 = new Libro("Misterio1",pepe,200,listaTemas);
        libroMisterio1.addTema("Novela Negra");
        listaTemas = new LinkedList<>();
        Tema cienciaFiccion = new Tema("Ciencia Ficción");
        listaTemas.add(cienciaFiccion);
        Libro libroCienciaFiccion1 = new Libro("CC1",paco,500,listaTemas);
        libroCienciaFiccion1.addTema("Fantasía");
        System.out.println(libroMisterio1);
        System.out.println(libroCienciaFiccion1);
    }
}

class Autor{
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + "\n\tfecha de nacimiento: " + this.fechaNacimiento;
    }
}

class Tema{
    private String tema;

    public Tema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return this.tema;
    }
}

class Libro{
    private String titulo;
    private Autor autor;
    private int paginas;
    private LinkedList<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas,LinkedList<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void addTema(String tema){
        Tema t = new Tema(tema);
        this.temas.add(t);
    }

    @Override
    public String toString() {
        return "Título: "+this.titulo+"\n\tAutor: "+this.autor+"\n\tPáginas: "+this.paginas+"\n\tTemas: "+this.temas;
    }
}