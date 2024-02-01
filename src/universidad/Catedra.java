package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String idCatedra;
    private String nombre;
    private Departamento departamento;
    private Set<Facultad> facultades;
    private Set<Profesor> profesores;

    public Catedra(String idCatedra,String nombre, Departamento departamento) {
        this.idCatedra = idCatedra;
        this.nombre = nombre;
        this.departamento = departamento;
        this.facultades = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public String getIdCatedra() {
        return idCatedra;
    }

    public void setIdCatedra(String idCatedra) {
        this.idCatedra = idCatedra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(Set<Facultad> facultades) {
        this.facultades = facultades;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void addFacultad(Facultad facultad){
        this.facultades.add(facultad);
    }
    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    @Override
    public String toString(){
        return this.nombre+"("+this.idCatedra+")";
    }
}
