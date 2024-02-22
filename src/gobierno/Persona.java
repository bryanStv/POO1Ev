package gobierno;

public class Persona {
    private String nombre;
    private int ID;
    private static int contadorIds = 1;
    public Persona(String nombre){
        this.nombre = nombre;
        this.ID = contadorIds++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getContadorIds() {
        return contadorIds;
    }

    public static void setContadorIds(int contadorIds) {
        Persona.contadorIds = contadorIds;
    }

    public void caminar(){
        System.out.println("Puede caminar");
    }
    @Override
    public String toString(){
        return this.nombre + " " + this.ID;
    }
}
