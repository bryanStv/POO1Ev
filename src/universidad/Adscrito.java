package universidad;

public class Adscrito {
    private String fecha;
    private Profesor profesor;
    private Catedra catedra;

    public Adscrito(String fecha, Profesor profesor, Catedra catedra) {
        this.fecha = fecha;
        this.profesor = profesor;
        this.catedra = catedra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString(){
        return this.fecha;
    }
}
