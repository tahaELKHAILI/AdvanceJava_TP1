package Exercice7;

import java.util.Date;

public class CarteCredit extends Paiement {

    private long numeroDeCarte;

    //Constructor
    public CarteCredit(long numeroDeCarte, double montant, long numerDeTransaction){
        this.numeroDeCarte = numeroDeCarte;
        this.montant = montant;
        this.numeroDeTransaction = numerDeTransaction;
        this.date = new Date();
    }

    public long getNumeroDeCarte() {
        return numeroDeCarte;
    }

    public void setNumeroDeCarte(long numeroDeCarte) {
        this.numeroDeCarte = numeroDeCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiment effectué par carte credit.\n Montant; "+montant);
    }
}