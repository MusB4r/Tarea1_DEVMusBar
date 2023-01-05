public class Coche {
    private int npuertas;
    public Coche(int npuertas) {
        this.npuertas = npuertas;
    }
    public void addPuerta() {
        npuertas++;
    }
    public int getNpuertas() {
        return npuertas;
    }
}