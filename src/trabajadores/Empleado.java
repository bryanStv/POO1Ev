package trabajadores;

public abstract class Empleado {
    private String nombre;
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        String[] profesion = new String[2];
        profesion = getClass().getName().split("\\.");
        return this.nombre +" es un "+profesion[1];
    }
}
