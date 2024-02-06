package maquinaExpendedora;

import javax.management.InvalidAttributeValueException;

public class MaquinaExpendedora {
    private String ticket;
    private int precioTicket;
    private int pagado;
    private int devolucion;

    public MaquinaExpendedora(String ticket,int precioTicket) {
        this.ticket = ticket;
        this.precioTicket = precioTicket;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getPrecioTicket() {
        return precioTicket;
    }

    public void setPrecioTicket(int precioTicket) {
        this.precioTicket = precioTicket;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) throws InvalidAttributeValueException{
        if(this.pagado >= this.precioTicket){
            this.pagado = pagado;
        }else{
            throw new InvalidAttributeValueException("Cantidad Introducida Incorrecta");
        }
    }

    public int getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(int devolucion) {
        this.devolucion = devolucion;
    }

    private String devuelvo(int pagado) throws InvalidAttributeValueException{
        setPagado(pagado);
        int[] monedas = {1000,500,200,100,50,20,10,5,1};
        int cantidad = this.precioTicket - pagado;
        if(cantidad==0) return "0";
        else{
            StringBuilder resultado = new StringBuilder();
            int aux = 0;
            for(int i = 0;i < monedas.length;i++){
                aux = monedas[i] - cantidad;
                if(aux >= 0){
                    resultado.append(monedas[i]).append(", ");
                }
            }
            return resultado.toString();
        }
    }

    @Override
    public String toString(){
        try {
            return "Ticket: "+this.ticket + " Coste: "+this.precioTicket+" Pagado: "+this.pagado+" Devuelto: "+devuelvo(this.pagado);
        } catch (InvalidAttributeValueException e) {
            throw new RuntimeException(e);
        }
    }
}
