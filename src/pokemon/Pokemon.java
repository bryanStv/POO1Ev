package pokemon;

public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private int movimientos;

    public Pokemon(String nombre,String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.movimientos = 4;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
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
    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", movimientos=" + movimientos +
                '}';
    }
}
