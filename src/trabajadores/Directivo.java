package trabajadores;

public class Directivo extends Empleado implements Trabaja{
    public Directivo(String nombre){
        super(nombre);
    }
    @Override
    public void trabaja() {
        System.out.println("No trabaja");
    }

    @Override
    public void puedeAscender() {
        System.out.println("Puede ascender a político");
    }
}
