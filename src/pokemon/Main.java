package pokemon;

public class Main {
    public static void main(String[] args) {
        Fuego charmander = new Fuego("Llamita");
        charmander.estadisticas(10,15,10);
        System.out.println("Nombre: "+charmander.getNombre());
        charmander.addMovimientos("Arañazo","Ascuas","Malicioso","Pantalla humo");
        charmander.listarMovimientos();
        charmander.numeroDeMovimientos();
        charmander.estadisticasPokemon();
        charmander.atacar();
        charmander.miTipo();
        charmander.fortalezas();
        charmander.debilidades();
        charmander.getMovimientos();
        System.out.println("--------------------------------------------------------------------------------------------");
        Agua squirtle = new Agua("Burbujas");
        System.out.println("Nombre: "+squirtle.getNombre());
        squirtle.estadisticas(12,12,13);
        squirtle.addMovimientos("Placaje","Pistola Agua","Malicioso","Surf");
        squirtle.listarMovimientos();
        squirtle.numeroDeMovimientos();
        squirtle.estadisticasPokemon();
        squirtle.atacar();
        squirtle.miTipo();
        squirtle.fortalezas();
        squirtle.debilidades();
        System.out.println("--------------------------------------------------------------------------------------------");
        Charizard charizard = new Charizard("Llamota");
        System.out.println("Nombre: "+charizard.getNombre());
        charizard.addMovimientos("Lanzallamas","Vuelo","Movimiento Sismico","Pantalla humo");
        charizard.listarMovimientos();
        charizard.estadisticas(120,90,80);
        charizard.estadisticasPokemon();
        charizard.numeroDeMovimientos();
        charizard.atacar();
        charizard.miTipo();
        charizard.mi2Tipo();
        charizard.fortalezas();
        charizard.fortalezasAñadidas();
        charizard.debilidades();
        charizard.debilidadesAñadidas();
        charizard.getMovimientos();
    }
}
