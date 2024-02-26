package maquinaExpendedora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMaquinaExpendedora {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        MaquinaExpendedora m1 = new MaquinaExpendedora("01",500,8000);
        System.out.println("El ticket "+m1.getTicket()+" cuesta "+m1.getPrecioTicket()/100+" € "+"("+m1.getPrecioTicket()+" centimos)");
        int pagado;

        try {
            System.out.println("Cantidad Requerida: "+m1.getPrecioTicket()+" Cantidad Pagada: "+m1.getPagado()+" Cajón: "+m1.getCajon());
            System.out.print("Introduce la cantidad(en centimos): ");
            pagado = tc.nextInt();
            m1.addMoney(pagado);
            while(true) {
                if(m1.getPagado() >= m1.getPrecioTicket()){
                    if(m1.getPagado() == m1.getPrecioTicket()){
                        System.out.println("Haz instroducido la cantidad exacta");
                        System.out.println("Total a devolver: 0€");
                        System.exit(0);
                    }
                    m1.setPagado(pagado+ m1.getPagado());
                    m1.devuelvo(pagado);
                    break;
                }
                System.out.println("Cantidad Requerida: "+m1.getPrecioTicket()+" Cantidad Pagada: "+m1.getPagado()+" Cajón: "+m1.getCajon());
                System.out.print("No has introducido suficiente dinero, por favor, añade más(en centimos): ");
                m1.addMoney(tc.nextInt());
            }
        }catch (IllegalArgumentException e){
            System.out.println("Cantidad Requerida: "+m1.getPrecioTicket()+" Cantidad Pagada: "+m1.getPagado()+" Cajón: "+m1.getCajon());
            System.out.println("Por favor, introduzca un valor correcto");
        } catch(InputMismatchException e){
            System.out.println("Error");
        }
    }
}
