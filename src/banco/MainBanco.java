package banco;
public class MainBanco {
    public static void main(String[] args) {
        Banc bbva = new Banc("BBVA",1000);
        Sucursal bbvaCastellon = new Sucursal("bbvaCastellón",bbva);
        Sucursal bbvaValencia = new Sucursal("bbvaValencia",bbva);
        bbva.addSucursal(bbvaCastellon);
        bbva.addSucursal(bbvaValencia);
        System.out.println(bbva);
        Prestec p1 = new Prestec(1,1000,bbvaCastellon);
        Prestec p2 = new Prestec(2,2500,bbvaCastellon);
        Prestec p3 = new Prestec(3,5560,bbvaCastellon);
        Prestec p4 = new Prestec(1,10000,bbvaValencia);
        bbvaCastellon.addPrestec(p1);
        bbvaCastellon.addPrestec(p2);
        bbvaCastellon.addPrestec(p3);
        bbvaValencia.addPrestec(p4);
        for(Sucursal s:bbva.getSucursales()){
            System.out.println(s);
            for(Prestec p:s.getPrestamos()){
                System.out.println("\t"+p);
            }
        }
    }
}

