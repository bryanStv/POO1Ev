package universidad;

public class Facultad {
    private String idFacultad;
    private String nombre;
    private Catedra catedra;

    public Facultad(String idFacultad, String nombre, Catedra catedra) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.catedra = catedra;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    @Override
    public String toString(){
        return this.nombre+"("+this.idFacultad+")";
    }
}
