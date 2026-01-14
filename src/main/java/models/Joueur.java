package models;

import java.util.List;

public class Joueur {
    private int idJoueur;
    private String nomJoueur;
    private String prenomJoueur;
    private String pseudoJoueur;
    private boolean victoire;
    private List<Armee>;

    public Joueur(String nomJoueur, String prenomJoueur, String pseudoJoueur) {
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.pseudoJoueur = pseudoJoueur;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getPrenomJoueur() {
        return prenomJoueur;
    }

    public void setPrenomJoueur(String prenomJoueur) {
        this.prenomJoueur = prenomJoueur;
    }

    public String getPseudoJoueur() {
        return pseudoJoueur;
    }

    public void setPseudoJoueur(String pseudoJoueur) {
        this.pseudoJoueur = pseudoJoueur;
    }

    public boolean isVictoire() {
        return victoire;
    }

    public void setVictoire(boolean victoire) {
        this.victoire = victoire;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "idJoueur=" + idJoueur +
                ", nomJoueur='" + nomJoueur + '\'' +
                ", prenomJoueur='" + prenomJoueur + '\'' +
                ", pseudoJoueur='" + pseudoJoueur + '\'' +
                ", victoire=" + victoire +
                '}';
    }
}
