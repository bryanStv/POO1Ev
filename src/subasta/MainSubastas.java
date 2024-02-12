package subasta;

import java.util.Scanner;
import java.util.Set;

public class MainSubastas {
    public static void main(String[] args) {
        //--------------------------------------PUJADORES---------------------------------------------------------------
        Pujador p1 = new Pujador("12345678A","pepe",105500);
        Pujador p2 = new Pujador("87654321A","maria",5000000);
        //---------------------------------------SUBASTA----------------------------------------------------------------
        Subasta s1 = new Subasta("S-01");
        //------------------------------------------PUJAS---------------------------------------------------------------
        Puja puja1 = new Puja(s1,5000);
        //------------------------------------------LOTES---------------------------------------------------------------
        Lote lote1 = new Lote(1,puja1,6000);
        Lote lote2 = new Lote(2,puja1,8500);
        //---------------------------------------ARTICULOS--------------------------------------------------------------
        Articulo mesita = new Articulo("mesita De La Realeza",lote1);
        Articulo cuadro = new Articulo("LAYOKONDA",lote1);

        //ADDS----------------------------------------------------------------------------------------------------------
        lote1.addArticulo(mesita);
        lote1.addArticulo(cuadro);

        s1.addPuja(puja1);
        p1.addPuja(puja1);
        p2.addPuja(puja1);

        subastaActual(puja1,p1,p2);
    }

    private static void subastaActual(Puja puja,Pujador p1,Pujador p2){
        Subasta s1 = puja.getSubasta();
        Set<Lote> Lotes = puja.getLotes();
        Pujador[] pujadores = {p1,p2};

        System.out.println("Puja Inicial --> "+puja.getPrecioInicial());
        System.out.println("Pujador que va ganando: "+puja.getPujador());
        boolean gabacho = false;
        Scanner tc = new Scanner(System.in);
        int cantidad = -1;
        int i = 0;
        while(!gabacho){
            System.out.print("Pujador : "+pujadores[i]+" Dinero total: "+pujadores[i].getDinero()+" puja: ");
            if(pujadores[i].getDinero() >= puja.getPrecioInicial() && cantidad <= pujadores[i].getDinero()){
                cantidad = tc.nextInt();
            }else{
                System.out.println("NO MONEY");
                cantidad = 0;
            }
            if(puja.getPrecioInicial() < cantidad){
                puja.setPrecioInicial(cantidad);
                puja.setPujador(pujadores[i]);
            }
            if(cantidad==0){
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
