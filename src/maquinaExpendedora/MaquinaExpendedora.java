package maquinaExpendedora;

import javax.management.InvalidAttributeValueException;
import java.util.HashMap;
import java.util.Map;

public class MaquinaExpendedora {
    private String ticket;
    private int precioTicket;
    private int pagado;
    private int devolucion;
    private Map<Integer,Integer> ahorros;

    public MaquinaExpendedora(String ticket,int precioTicket) {
        this.ticket = ticket;
        this.precioTicket = precioTicket;
        this.ahorros = new HashMap<>();
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
        if(pagado >= this.precioTicket){
            this.pagado = pagado;
        }else{
            throw new InvalidAttributeValueException("Introduce la cantidad justa");
        }
    }

    public int getDevolucion() {
        this.devolucion = this.pagado - this.precioTicket;
        return devolucion;
    }

    private StringBuilder devuelvo(int pagado) throws InvalidAttributeValueException{
        setPagado(pagado);
        int[] monedas = {1000,500,200,100,50,20,10,5,2,1};
        StringBuilder resultado = new StringBuilder();
        int posicion = 0;
        int devolver = pagado - this.precioTicket;
        int cambio;
        int resto;
        while(true){
            cambio = devolver/monedas[posicion];
            resto = devolver%monedas[posicion];
            if(resto == 0){
                resultado.append(monedas[posicion]/100).append("€");
                return resultado;
            }
            if(cambio/monedas[posicion] >= 0){
                if(cambio != 0) {
                    resultado.append(monedas[posicion]/100).append("€, ");
                    devolver -= monedas[posicion];
                    if(devolver >= monedas[posicion]){
                        posicion = 0;
                    }
                }
                if(devolver < monedas[posicion]){
                    posicion++;
                }
            }else{
                posicion++;
            }
        }
    }

    @Override
    public String toString(){
        try {
            return "Ticket: "+this.ticket + " Coste: "+this.precioTicket+" Pagado: "+this.pagado+" Devuelto: "+this.getDevolucion()+" Cambio: "+devuelvo(this.pagado);
        } catch (InvalidAttributeValueException e) {
            throw new RuntimeException(e);
        }
    }
}
