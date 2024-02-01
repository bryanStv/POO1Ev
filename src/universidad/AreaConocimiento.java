package universidad;

import java.util.HashSet;
import java.util.Set;

public class AreaConocimiento {
    private String idArea;
    private Set<Departamento> departamentos;

    public AreaConocimiento(String idArea) {
        this.idArea = idArea;
        this.departamentos = new HashSet<>();
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    @Override
    public String toString(){
        return this.idArea;
    }
}
