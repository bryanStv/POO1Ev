package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String idDepartamento;
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private Set<Catedra> catedras;
    private Set<Profesor> profesores;

    public Departamento(String idDepartamento, String nombre, AreaConocimiento areaConocimiento) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.catedras = new HashSet<>();
        this.profesores = new HashSet<>();
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    @Override
    public String toString(){
        return this.nombre+"("+this.idDepartamento+")";
    }
}
