package main;
public class DatoTiempo {

    private double tiempo;
    
    public DatoTiempo(){
        this.tiempo = 0;
    }

    public double getTiempoEnSegundos() {
        return tiempo/1000;
    }
    
    public void comienza(){
        this.tiempo = System.currentTimeMillis();
    }
    
    public void para(){
        this.tiempo = System.currentTimeMillis() - this.tiempo;
    }
    
}
