package Exercice3;

public class Vehicule {
    private String nom;
    private double prix;

    //Constructor
    public Vehicule(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    //Setters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    //Getters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //Méthodes
    public void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations(){
        System.out.println("Nom: "+ nom + " / prix: "+ prix);
    }
}
