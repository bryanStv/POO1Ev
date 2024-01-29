public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cpepe = new Cuenta("Pepe",2000.0);
        System.out.println(cpepe);
        cpepe.ingresar(1500.0);
        System.out.println(cpepe);
        cpepe.ingresar(-2000.0);
        System.out.println(cpepe);
        cpepe.retirar(1500.0);
        System.out.println(cpepe);
        cpepe.retirar(9999.0);
        System.out.println(cpepe);
    }
}

class Cuenta{
    String titular;
    Double cantidad;
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0.0;
    }
    public Cuenta(String titular,Double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return "Titular: "+this.titular + "\n\tCantidad: "+this.cantidad;
    }

    public void ingresar(Double ingreso){
        if(ingreso > 0){
            this.cantidad += ingreso;
        }
    }

    public void retirar(Double retiro){
        if(retiro <= this.cantidad){
            this.cantidad -= retiro;
        }else{
            this.cantidad = 0.0;
        }
    }
}
