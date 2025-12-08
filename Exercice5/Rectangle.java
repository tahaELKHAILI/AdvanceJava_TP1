package Exercice5;

public class Rectangle extends Figure {

    private double longeur;
    private double largeur;

    //Constructor
    public Rectangle(String nom, double longeur, double largeur){
        this.nom = nom;
        this.largeur = largeur;
        this.longeur = longeur;
    }

    @Override
    public double calculerAire() {
        return longeur*largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2*(largeur+longeur);
    }
}