package Exercice1;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    //Constructor
    public Personne(String nom, String prenom, String email, String tel, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    //Getters
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Nom: "+nom+ " / Prenom: "+prenom+ " / Email: "+email+ " / Telephone: "+tel+ " / Age: "+age;
    }
}
