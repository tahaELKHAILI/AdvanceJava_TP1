package Exercice5;

public abstract class Figure {

    protected String nom;

    public abstract double calculerAire();
    public abstract double calculerPerimetre();
    
    
    public void afficherDetails(){
        System.out.println("Aire: "+this.calculerAire());
        System.out.println("Perimetere: "+this.calculerPerimetre());
    }
}