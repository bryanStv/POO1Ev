package banco;

class CompteCorrent {
    private String n_cc;
    private Sucursal sucursal;

    public CompteCorrent(String n_cc, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
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

    @Override
    public String toString() {
        return this.n_cc;
    }
}
