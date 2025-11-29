package Exercice1;

public class Livre {

    private int ISBN;
    private String titre;
    private Auteur auteur;

    //Constructor
    public Livre(int ISBN, String titre, Auteur auteur){
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    //Setters
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    //Getters
    public Auteur getAuteur() {
        return auteur;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "ISBN: "+ISBN+ " / Titre: "+titre+ " / "+ auteur.toString();
    }
}