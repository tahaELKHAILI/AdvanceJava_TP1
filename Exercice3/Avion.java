package Exercice3;

public class Avion extends Vehicule{

    private String compagnie;
    private int vitesseMax;

    //Constructor
    public Avion(String nom, double prix, String compagnie, int vitesseMax){
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    //Setters
    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    //Getters
    public String getCompagnie() {
        return compagnie;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    //Méthode
    @Override
    public void emettreSon() {
        System.out.println("L\'avion fait un bruit de moteur puissant");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie: "+compagnie+ " / Vitesse Max: "+vitesseMax);
    }
}