package pokemon;

public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private int movimientos;
    private int HP;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;

    public Pokemon(String nombre,String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.movimientos = 4;
    }

    public void estadisticas(int HP,int ataque,int ataqueEspecial, int defensa, int defensaEspecial, int velocidad){
        this.HP = HP;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
    }

    public Pokemon(String tipo){
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void debilidades(){
        System.out.println("No soy débil a ninguno");
    }

    public void atacar(){
        System.out.println("El pokemon "+this.nombre+" ataca");
    }

    public void miTipo(){
        System.out.println("El pokemon no tiene tipo, por lo que lo consideraremos sin tipo");
    }
    public void numeroDeMovimientos(){
        System.out.println("El pokemon tiene siempre de 1 a 4 movimientos");
    }

    public void fortalezas(){
        System.out.println("El pokemin no es fuerte contra ninguno");
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", movimientos=" + movimientos +
                '}';
    }
}
