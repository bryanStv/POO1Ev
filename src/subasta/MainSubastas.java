package subasta;

import java.util.Scanner;
import java.util.Set;

public class MainSubastas {
    public static void main(String[] args) {
        //--------------------------------------PUJADORES---------------------------------------------------------------
        Pujador p1 = new Pujador("12345678A","pepe",2500);
        Pujador p2 = new Pujador("87654321A","maria",5000);
        //---------------------------------------SUBASTA----------------------------------------------------------------
        Subasta s1 = new Subasta("S-01");
        //------------------------------------------PUJAS---------------------------------------------------------------
        Puja puja1 = new Puja(s1);
        //------------------------------------------LOTES---------------------------------------------------------------
        Lote lote1 = new Lote(1,puja1);
        Lote lote2 = new Lote(2,puja1);
        //---------------------------------------ARTICULOS--------------------------------------------------------------
        Articulo mesita = new Articulo("Mesita De La realeza",200,lote1);
        Articulo cuadro = new Articulo("LAYOKONDA",400,lote1);

        //ADDS----------------------------------------------------------------------------------------------------------
        lote1.addArticulo(mesita);
        lote1.addArticulo(cuadro);

        s1.addPuja(puja1);
        p1.addPuja(puja1);
        p2.addPuja(puja1);

        puja1.setPrecioInicial(lote1.getPrecioSalida());

        subastaActual(puja1,p1,p2);
    }

    private static void subastaActual(Puja puja,Pujador p1,Pujador p2){
        Pujador[] pujadores = {p1,p2};

        System.out.println("Puja Inicial --> "+puja.getPrecioInicial());
        System.out.println("Pujador que va ganando: "+puja.getPujador());
        boolean gabacho = false;
        Scanner tc = new Scanner(System.in);
        int cantidad = -1, c1;
        int i = 0;
        int maxPuja = 0;
        while(!gabacho){
            System.out.print("Pujador : "+pujadores[i]+" puja: ");
            c1 = tc.nextInt();
            if(pujadores[i].getDinero() >= puja.getPrecioInicial() && c1 <= pujadores[i].getDinero() && c1 >= puja.getPrecioInicial()){
                cantidad = c1;
            }else{
                System.out.println("NO MONEY");
                cantidad = 0;
            }
            if(puja.getPrecioInicial() <= cantidad){
                if(cantidad > maxPuja) {
                    puja.setPrecioInicial(cantidad);
                    puja.setPujador(pujadores[i]);
                }
                maxPuja = cantidad;
            }
            if(cantidad<=0){
                gabacho = true;
                System.out.println("El ganador de la puja es: "+puja.getPujador()+" con una cantidad de "+puja.getPrecioInicial());
                System.out.println("Articulos ganados: ");
                for(Lote l: puja.getLotes()){
                    for(Articulo a:l.getArticulos()){
                        System.out.println(a);
                    }
                }
                System.exit(0);
            }
            System.out.println("Puja actual: "+puja.getPrecioInicial());
            System.out.println("Pujador que va ganando: "+puja.getPujador());
            if(i==0){
                i++;
            }else{
                i = 0;
            }
        }


    }
    private static void pujadorActual(Pujador pujador,Puja puja){
        puja.setPujador(pujador);
    }
}
