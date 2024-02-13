package pokemon;

public class Main {
    public static void main(String[] args) {
        Fuego charmander = new Fuego("Charmander");
        charmander.estadisticas();
        charmander.atacar();
        charmander.numeroDeMovimientos();
        charmander.miTipo();
        charmander.fortalezas();
        charmander.debilidades();
        Agua squirtle = new Agua("Squirtle");
        squirtle.atacar();
        squirtle.numeroDeMovimientos();
        squirtle.miTipo();
        squirtle.fortalezas();
        squirtle.debilidades();


        /*Charmander c1 = new Charmander();
        c1.atacar();
        c1.numeroDeMovimientos();
        c1.miTipo();
        c1.debilidades();
        c1.fortalezas();
        Blastoise b1 = new Blastoise("Blastoise");
        b1.atacar();
        b1.numeroDeMovimientos();
        b1.miTipo();
        b1.debilidades();
        b1.fortalezas();*/
    }
}
