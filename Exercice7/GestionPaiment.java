package Exercice7;

public class GestionPaiment {

    public static void main(String[] args) {
        
        
        Paypal paypal = new Paypal("test@mail.com", 2000, 1212132135);
        Commande c1 = new Commande("John", 2000, paypal);
        c1.processPayment();

        CarteCredit carteCredit = new CarteCredit(125213215, 800, 132123131);
        Commande c2 = new Commande("Jane", 500, carteCredit);
        c2.processPayment();
    }
}