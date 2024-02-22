package gobierno;

public class Diputado extends Persona implements PoderLegislativo{
    public Diputado(String nombre){
        super(nombre);
    }
    @Override
    public void crearLeyes() {
        System.out.println("Puede proponer la creación de una ley");
    }

    @Override
    public void eliminarLeyes() {
        System.out.println("Puede proponer la eliminación de una ley");
    }

    @Override
    public void modificarLeyes() {
        System.out.println("Puede proponer la modificación de una ley");
    }

    @Override
    public void votarLeyes() {
        System.out.println("Puede votar una ley");
    }
}
