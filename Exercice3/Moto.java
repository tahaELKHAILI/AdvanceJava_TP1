package Exercice3;

public class Moto extends Vehicule{

    private String marque;
    private int puissance;

    //Constructor
    public Moto(String nom, double prix, String marque, int puissance){
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    //Setters
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    //Getters
    public String getMarque() {
        return marque;
    }

    public int getPuissance() {
        return puissance;
    }

    //Méthode
    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque: "+marque+ " / Puissance: "+puissance);
    }
}