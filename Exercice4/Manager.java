package Exercice4;

public class Manager extends Employee{

    private String service;

    //Constructor
    public Manager(){
        super();
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service){
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    //getter
    public String getService() {
        return service;
    }

    //setters
    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        setSalaire(getSalaire()*1.2);;
        return getSalaire();
    }

    @Override
    public String toString() {
        return super.toString()+ " / Service: "+service;
    }
}