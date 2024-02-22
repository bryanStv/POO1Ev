package network;

public class Mensajes{
    private int id;
    private static int contador = 0;
    public Mensajes(){
        this.id = contador++;
    }
}
