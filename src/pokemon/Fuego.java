package pokemon;

public class Fuego extends Pokemon{
    Fuego(String nombre){
        super(nombre,"fuego");
    }
    @Override
    public void debilidades() {
        System.out.println("Soy débil al tipo agua");
    }

    @Override
    public void miTipo() {
        System.out.println("Soy de tipo fuego");
    }

    @Override
    public void fortalezas() {
        System.out.println("El pokemon es fuerte contra el tipo Planta");
    }
}
