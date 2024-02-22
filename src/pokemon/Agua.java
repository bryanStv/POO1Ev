package pokemon;

public class Agua extends Pokemon {
    Agua(String nombre){
        super(nombre,"agua");
    }
    @Override
    public void debilidades() {
        System.out.println("Soy débil al tipo planta");;
    }
    @Override
    public void miTipo() {
        System.out.println("Soy de tipo agua");;
    }
    @Override
    public void fortalezas(){
        System.out.println("El pokemon es fuerte contra el tipo fuego");
    }

}
