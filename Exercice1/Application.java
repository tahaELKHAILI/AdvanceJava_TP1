package Exercice1;

public class Application {

    public static void main(String[] args) {



        //Auteur
        Auteur aut1 = new Auteur("John", "Doe", "J.Doe@gmail.com",
         "+212663254526", 50,"t15151");
        
         //Livre
        Livre l1 = new Livre(123546, "the book", aut1);
        //Affichage livre
        System.out.println("********************Livre********************");
        System.out.println(l1);

        //Adherent
        Adherent ad1 = new Adherent("Jane", "Doe", "JaDoe@hotmail.com",
         "+2123365664644", 25, "12354");
        //Affichage adherent
        System.out.println("********************Adherent********************");
        System.out.println(ad1);
    }
}