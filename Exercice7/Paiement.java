package Exercice7;

import java.util.Date;

public abstract class Paiement {
    
    protected double montant;
    protected long numeroDeTransaction;
    protected Date date;

    public abstract void effectuerPaiement(double  montant);

}