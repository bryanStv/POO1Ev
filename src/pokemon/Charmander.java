package pokemon;

public class Charmander extends Fuego{
    public Charmander(){
        super("Charmander");
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void miTipo(){
        System.out.println("Mi tipo es "+this.getTipo());
    }

}
