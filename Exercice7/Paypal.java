package Exercice7;

import java.util.Date;

public class Paypal extends Paiement{

    private String email;
    
    //Constructor
    public Paypal(String email, double montant, long numerDeTransaction){
        this.email = email;
        this.montant = montant;
        this.numeroDeTransaction = numerDeTransaction;
        this.date = new Date();
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiment effectué par Paypal \n Montant: "+montant);
    }
}