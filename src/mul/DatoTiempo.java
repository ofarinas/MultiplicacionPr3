package mul;

public class DatoTiempo {

    private double tiempo;

    public DatoTiempo() {
        this.tiempo = 0;
    }

    public void start() {
        this.tiempo = System.currentTimeMillis();
    }

    public void stop() {
        this.tiempo = System.currentTimeMillis() - this.tiempo;
    }

    public double dameTiempoEnSegundos() {
        return this.tiempo / 1000;
    }

    public double dameTiempoEnMilis() {
        return this.tiempo;
    }

}
