package trabajadores;

public class Operario extends Empleado implements Trabaja{
    public Operario(String nombre){
        super(nombre);
    }
    @Override
    public void trabaja() {
        System.out.println("Trabaja como operario");
    }

    @Override
    public void puedeAscender() {
        System.out.println("Puede ascender a Directivo, rara vez");
    }
}
