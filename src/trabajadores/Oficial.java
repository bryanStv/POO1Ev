package trabajadores;

public class Oficial extends Operario implements Trabaja{
    public Oficial(String nombre){
        super(nombre);
    }
    @Override
    public void trabaja() {
        System.out.println("Trabaja como oficial");
    }

    @Override
    public void puedeAscender() {
        System.out.println("Puede ascender a Operario");
    }
}
