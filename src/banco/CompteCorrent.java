package banco;

import java.util.HashSet;
import java.util.Set;

class CompteCorrent {
    private String n_cc;
    private Sucursal sucursal;
    private Set<Domiciliacio> domiciliaciones;
    private Set<Client> clientes;

    public CompteCorrent(String n_cc, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.domiciliaciones = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getN_cc() {
        return n_cc;
    }

    public void setN_cc(String n_cc) {
        this.n_cc = n_cc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Domiciliacio> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacio> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public Set<Client> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Client> clientes) {
        this.clientes = clientes;
    }
    public void addCliente(Client cliente){
        this.clientes.add(cliente);
    }
    public void addDomiciliacion(Domiciliacio domiciliacio){
        this.domiciliaciones.add(domiciliacio);
    }
    @Override
    public String toString() {
        return this.n_cc;
    }
}
