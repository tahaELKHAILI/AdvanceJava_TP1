package Exercice5;

public class Application {

    public static void main(String[] args) {

        System.out.println("==========Rectangle===========================");
        Rectangle rectangle1 = new Rectangle("John", 200, 10);
        rectangle1.afficherDetails();

        System.out.println("===========Cercle======================");
        Cercle cercle1 = new Cercle("Jane", 10);
        cercle1.afficherDetails();
    }
}