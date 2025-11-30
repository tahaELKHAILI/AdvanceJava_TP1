package Exercice3;

public class Application {

    public static void main(String[] args) {
        
        System.out.println("************Test Vehicule***************************");
        Vehicule v1 = new Vehicule("Bike", 1000);
        v1.afficherInformations();
        v1.emettreSon();

        System.out.println("************Test Voiture****************************");
        Voiture voiture1 = new Voiture("Ford", 1000000, "Mustang", 1975);
        voiture1.afficherInformations();
        voiture1.emettreSon();

        System.out.println("***************Test Moto***********************");
        Moto m1 = new Moto("Yamaha", 998, "R1", 220);
        m1.afficherInformations();
        m1.emettreSon();

        System.out.println("***************Test Avion*********************");
        Avion av1 = new Avion("Sessna", 5000000, "ARAM", 1200);
        av1.afficherInformations();
        av1.emettreSon();
    }
}