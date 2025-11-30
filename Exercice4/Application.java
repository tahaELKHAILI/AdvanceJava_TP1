package Exercice4;

public class Application {

    public static void main(String[] args) {
        

        System.out.println("*************Test manager*****************************");
        Manager m1 = new Manager("John", "Doe", "J.Doe@gmail.com"
        , "+21256565861", 5000, "Comptabilité");
        m1.calculerSalaire();
        System.out.println(m1);


        System.out.println("*************Test ingenieur****************************");
        Ingenieur in1 = new Ingenieur("Barry", "Allen", "B.allen@gmail.com",
            "+2126694546",20000, "Méchanique");
        in1.calculerSalaire();
        System.out.println(in1);
    }
}