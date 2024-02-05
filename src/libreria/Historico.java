package libreria;

public class Historico {
    private String fechaPrestamo;
    private String fechaTerminacion;
    private Lector lector;
    private Ejemplar ejemplar;

    public Historico(String fechaPrestamo, String fechaTerminacion, Lector lector, Ejemplar ejemplar) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaTerminacion = fechaTerminacion;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(String fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString(){
        return this.fechaPrestamo + "-" + this.fechaTerminacion;
    }
}
