package Exercice4;

public abstract class Employee {

    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private double salaire;

    //Constructor
    public Employee(String nom, String prenom, String email, String telephone, double salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public Employee(){

    }

    //Getters
    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getTelephone() {
        return telephone;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    //Retourne Salaire
    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Nom: "+nom+ " / Prénom: "+prenom + " / Email: "+email+ 
        " / Telephone: "+telephone + " / Salaire: "+salaire;
    }
}