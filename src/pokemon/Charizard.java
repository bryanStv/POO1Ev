package pokemon;

public class Charizard extends Fuego implements Volador{
    public Charizard(String nombre){
        super(nombre);
    }

    @Override
    public void mi2Tipo() {
        System.out.println("Mi segundo tipo es volador");
    }

    @Override
    public void debilidadesAñadidas() {
        System.out.println("Soy débil al tipo roca");
    }

    @Override
    public void fortalezasAñadidas() {
        System.out.println("El pokemon es fuerte contra el tipo Lucha");
    }
}
