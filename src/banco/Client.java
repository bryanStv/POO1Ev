package banco;

import java.util.HashSet;
import java.util.Set;

class Client {
    private String dni;
    private String nombre;
    private Set<Prestec> prestamos;
    private Set<CompteCorrent> cuentasCorrientes;

    public Client(String dni, String nombre, Set<Prestec> prestamos, Set<CompteCorrent> cuentasCorrientes) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = prestamos;
        this.cuentasCorrientes = cuentasCorrientes;
    }

    public Client(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.cuentasCorrientes = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestec> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestec> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CompteCorrent> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void setCuentasCorrientes(Set<CompteCorrent> cuentasCorrientes) {
        this.cuentasCorrientes = cuentasCorrientes;
    }

    public void addCuentaCorriente(CompteCorrent cuentaCorriente){
        this.cuentasCorrientes.add(cuentaCorriente);
    }
    public void addPrestamo(Prestec prestamo){
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString(){
        return this.dni + " - " + this.nombre;
    }
}
