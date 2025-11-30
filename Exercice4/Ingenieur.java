package Exercice4;

public class Ingenieur extends Employee{

    private String specialite;

    //Constructor
    public Ingenieur(){
        super();
    }

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite){
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    //Getter
    public String getSpecialite() {
        return specialite;
    }

    //Setters
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        setSalaire(getSalaire()*1.15);
        return getSalaire();
    }

    @Override
    public String toString() {
        return super.toString()+" / Spécialité: "+specialite;
    }
}