package trabajadores;

public class Tecnico extends Operario implements Trabaja{
    public Tecnico(String nombre){
        super(nombre);
    }

    @Override
    public void trabaja() {
        System.out.println("Trabaja como técnico");
    }

    @Override
    public void puedeAscender() {
        System.out.println("Puede ascender a Operario");
    }
}
