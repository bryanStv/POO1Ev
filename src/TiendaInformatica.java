public class TiendaInformatica {
    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador("Asus","VivoBook",true,800);
        Ordenador pc2 = new Ordenador("Asus","Rog Strix",false,2000);
        Ordenador pc3 = new Ordenador("Lenovo","Thinkpad",true,1000);
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
    }
}

class Ordenador{
    private String marca;
    private String modelo;
    private boolean disponibilidad;
    private int precio;

    public Ordenador(String marca, String modelo, boolean disponibilidad, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        String disponible = "NO";
        if(disponibilidad) disponible = "SI";
        return "Marca: "+this.marca + "\n\t" + "Modelo: "+this.modelo + "\n\t" +"Precio: "+ this.precio +" €" + "\n\t"+ "Disponibilidad: " + disponible;
    }
}