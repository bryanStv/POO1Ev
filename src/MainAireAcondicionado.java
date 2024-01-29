public class MainAireAcondicionado {
    public static void main(String[] args) {
        try{
            AireAcondicionado aire1 = new AireAcondicionado("Aire1",15);
            System.out.println(aire1);
            aire1.subirTemperatura();
            aire1.subirTemperatura();
            System.out.println(aire1);
            aire1.bajarTemperatura();
            System.out.println(aire1);
            AireAcondicionado aire2 = new AireAcondicionado("Aire2",30);
            aire2.bajarTemperatura();
            System.out.println(aire2);
            aire2.subirTemperatura();
            System.out.println(aire2);
            aire2.subirTemperatura();
            System.out.println(aire2);
            AireAcondicionado aire3 = new AireAcondicionado("Aire3",5);
            System.out.println(aire3);
        }catch (IllegalArgumentException e){
            AireAcondicionado airePrueba = new AireAcondicionado("Prueba",20);
            System.out.println("La temperatura no se encuetra en el rango de "+airePrueba.getTemperaturaMinima()+"-"+airePrueba.getTemperaturaMaxima());
        }
    }
}

class AireAcondicionado{
    private String nombre;
    private final int temperaturaMaxima = 30;
    private final int temperaturaMinima = 10;
    private int temperatura;

    public AireAcondicionado(String nombre, int temperatura) throws IllegalArgumentException{
        this.nombre = nombre;
        if(temperatura > this.temperaturaMaxima || temperatura < this.temperaturaMinima) throw new IllegalArgumentException("Temperatura Incorrecta");
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void subirTemperatura(){
        if(temperatura < this.temperaturaMaxima){
            temperatura++;
        }
    }
    public void bajarTemperatura(){
        if(temperatura > this.temperaturaMinima){
            temperatura--;
        }
    }

    @Override
    public String toString(){
        return this.nombre + "\n\t" + this.temperatura;
    }
}
