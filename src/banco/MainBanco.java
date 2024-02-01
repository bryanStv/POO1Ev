package banco;
public class MainBanco {
    public static void main(String[] args) {
        Banc bbva = new Banc("BBVA",1000);
        Sucursal bbvaCastellon = new Sucursal("bbvaCastellón",bbva);
        Sucursal bbvaValencia = new Sucursal("bbvaValencia",bbva);
        bbva.addSucursal(bbvaCastellon);
        bbva.addSucursal(bbvaValencia);
        System.out.println(bbva);
        Client juan = new Client("12A","Juan");
        Client maria = new Client("12B","María");
        Client pepe = new Client("12C","Pepe");
        Prestec p1 = new Prestec(1,1000,bbvaCastellon,juan);
        Prestec p2 = new Prestec(2,2500,bbvaCastellon,pepe);
        Prestec p3 = new Prestec(3,5560,bbvaCastellon,pepe);
        Prestec p4 = new Prestec(1,10000,bbvaValencia,maria);

        juan.addPrestamo(p1);
        pepe.addPrestamo(p2);
        pepe.addPrestamo(p3);
        maria.addPrestamo(p4);

        CompteCorrent cc1 = new CompteCorrent("C1",bbvaCastellon);
        CompteCorrent cc2 = new CompteCorrent("C2",bbvaValencia);
        bbvaCastellon.addCuentaCorriente(cc1);
        bbvaValencia.addCuentaCorriente(cc2);
        juan.addCuentaCorriente(cc1);
        maria.addCuentaCorriente(cc1);
        pepe.addCuentaCorriente(cc2);

        Domiciliacio d1 = new Domiciliacio("D1","Iberdrola",100,cc1);
        Domiciliacio d2 = new Domiciliacio("D2","Movistar",60,cc1);
        Domiciliacio d3 = new Domiciliacio("D3","Vodafone",75,cc2);
        cc1.addDomiciliacion(d1);
        cc1.addDomiciliacion(d2);
        cc2.addDomiciliacion(d3);

        bbvaCastellon.addPrestec(p1);
        bbvaCastellon.addPrestec(p2);
        bbvaCastellon.addPrestec(p3);
        bbvaValencia.addPrestec(p4);

        for(Sucursal s:bbva.getSucursales()){
            System.out.println(s);
            System.out.println("PRESTAMOS");
            for(Prestec p:s.getPrestamos()){
                System.out.println("\t"+p + " --> " + p.getCliente().getNombre());
            }
            System.out.println("CUENTAS CORRIENTES");
            for(CompteCorrent c: s.getCuentasCorrientes()){
                System.out.println("Cuenta Corriente: "+c.getN_cc());
                System.out.println("DOMICILIACIONES");
                for(Domiciliacio d:c.getDomiciliaciones()){
                    System.out.println(d);
                }
            }
            System.out.println("----------------------------------");
        }
    }
}

