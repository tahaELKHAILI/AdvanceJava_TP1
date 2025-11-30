package Exercice3;

public class Voiture extends Vehicule {

    private String modele;
    private int annee;

    //Constructor
    public Voiture(String nom, double prix, String modele, int annee){
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    //Getters
    public int getAnnee() {
        return annee;
    }

    public String getModele() {
        return modele;
    }

    //Setters
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    //Methode
    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modele: "+modele + " / Année: "+annee);
    }
}