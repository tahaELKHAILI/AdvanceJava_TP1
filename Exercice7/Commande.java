package Exercice7;

public class Commande {

    private String user;
    private double montant;
    private Paiement moyPaiement;

    //Constructor
    public Commande(String user, double montant, Paiement moyPaiement){
        this.user = user;
        this.montant = montant;
        this.moyPaiement = moyPaiement;
    }

    //Getters
    public double getMontant() {
        return montant;
    }
    public Paiement getMoyPaiement() {
        return moyPaiement;
    }
    public String getUser() {
        return user;
    }

    //Setters
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setMoyPaiement(Paiement moyPaiement) {
        this.moyPaiement = moyPaiement;
    }
    public void setUser(String user) {
        this.user = user;
    }

    //Méthods
    public void processPayment(){
        moyPaiement.effectuerPaiement(montant);
    }
}