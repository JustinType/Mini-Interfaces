
public class Histogramme {

    private int valeur;
    private String nom;

    /**
     * Histogramme
     * @param n nom
     * @param v valeur
     */
    public Histogramme(String n, int v) {
        if (v >= 0 && v <= 20) {
            this.valeur = v;
        }
        this.nom = n;
    }

    public int getValeur() {
        return this.valeur;
    }

    public String getNom() {
        return this.nom;
    }

}