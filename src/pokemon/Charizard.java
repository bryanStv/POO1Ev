package pokemon;

public class Charizard extends Pokemon{
    public Charizard(){
        super("Charizard","fuego/volador");
    }

    @Override
    public void miTipo(){
        System.out.println("Mi tipo es el fuego");
    }

}
