package banco;

class Domiciliacio {
    private String num_d;
    private String company;
    private int cantidad;
    private CompteCorrent cuentaCorriente;

    public Domiciliacio(String num_d,String company,int cantidad ,CompteCorrent cuentaCorriente) {
        this.num_d = num_d;
        this.company = company;
        this.cantidad = cantidad;
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getNum_d() {
        return num_d;
    }

    public void setNum_d(String num_d) {
        this.num_d = num_d;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CompteCorrent getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CompteCorrent cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString(){
        return "Número de domiciliación: "+this.num_d + " Compañía: "+this.company+" Cantidad: "+this.cantidad;
    }
}
