package maquinaExpendedora;

import javax.management.InvalidAttributeValueException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaquinaExpendedora {
    private String ticket;
    private int precioTicket;
    private int pagado;
    private int cajon;

    public MaquinaExpendedora(String ticket,int precioTicket, int cajon) {
        this.ticket = ticket;
        this.precioTicket = precioTicket;
        this.cajon = cajon;
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
    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public void addMoney(int dinero){
        this.pagado += dinero;
    }

    public void devuelvo(int pagado){
        int[] monedas = {1000,500,200,100,50,20,10,5,2,1};
        Map<Integer,Integer> cambios = new HashMap<>();
        int moneda, resto, cambio;
        int devolver = pagado - this.getPrecioTicket();
        if(devolver > this.cajon){
            System.out.println("Introduce el cambio exacto, intentelo de nuevo.");
            System.exit(0);
        }else{
            this.cajon += this.getPrecioTicket();
            this.cajon -= devolver;
        }
        int posicion = 0;
        //Rellenar mapa
        for(int i = 0; i < monedas.length;i++){
            cambios.put(monedas[i],0);
        }
        Integer cantidad;
        while(true){
            moneda = monedas[posicion];
            cambio = devolver/moneda;
            resto = devolver%moneda;
            cantidad = cambios.get(moneda);
            if(resto == 0){
                cambios.put(moneda,cambio);
                break;
            }
            if(cambio/moneda >= 0 && cambio != 0){
                cambios.put(moneda,cambio);
            }
            else{
                posicion++;
            }
            devolver=resto;
        }
        //Ordenar Mapa de mayor a menor
        Map<Integer, Integer> cambiosOrdenados = new TreeMap<>((clave1, clave2) -> clave2.compareTo(clave1));
        cambiosOrdenados.putAll(cambios);
        System.out.println("Total a devolver: ");
        for(Integer key: cambiosOrdenados.keySet()){
            Integer valor = cambios.get(key);
            double euro = Double.valueOf(key)/100;
            if(valor != 0){
                System.out.println("\t\t"+euro+"€ --> "+valor);
            }
        }
        System.out.println("Dinero en el cajón: "+this.cajon);
    }

    @Override
    public String toString(){
        return "Ticket: "+this.ticket + " Coste: "+this.precioTicket;
    }

    /*
    public void devuelvo2(int pagado){
        int[] monedas = {1000,500,200,100,50,20,10,5,2,1};
        StringBuilder resultado = new StringBuilder();
        int posicion = 0;
        int devolver = pagado - this.precioTicket;
        int cambio;
        int resto , moneda;
        while(true){
            moneda = monedas[posicion];
            cambio = devolver/moneda;
            resto = devolver%moneda;
            if(resto == 0){
                resultado.append(moneda/100).append("€");
                //return resultado;
                System.out.println(resultado);
            }
            if(cambio/moneda >= 0){
                if(cambio != 0) {
                    resultado.append(moneda/100).append("€, ");
                    devolver -= monedas[posicion];
                    if(devolver >= moneda){
                        posicion = 0;
                    }
                }
                if(devolver < moneda){
                    posicion++;
                }
            }else{
                posicion++;
            }
        }
    }
    */
}
