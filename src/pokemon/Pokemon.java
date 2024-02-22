package pokemon;

public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private String[] movimientos;
    private int HP;
    private int ataque;
    private int defensa;

    public Pokemon(String nombre,String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.movimientos = new String[4];
    }

    public void estadisticas(int HP,int ataque, int defensa){
        this.HP = HP;
        this.ataque = ataque;
        this.defensa = defensa;
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

    public String[] getMovimientos() {
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
        System.out.println("El pokemon no es fuerte contra ninguno");
    }
    public void estadisticasPokemon(){
        System.out.printf("Sus estadisticas son: %d HP, %d Ataque, %d Defensa\n",this.HP,this.ataque,this.defensa);
    }
    public void listarMovimientos(){
        int movs = 1;
        for(String mov: movimientos){
            System.out.println("Movimiento "+movs++ +": "+ mov);
        }
    }
    public void addMovimientos(String mov1,String mov2,String mov3,String mov4){
        movimientos[0] = mov1;
        movimientos[1] = mov2;
        movimientos[2] = mov3;
        movimientos[3] = mov4;
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
