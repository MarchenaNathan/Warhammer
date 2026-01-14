package Models;

import java.util.List;

public class Joueur {
    private int idJoueur;
    private String nomJoueur;
    private String prenomJoueur;
    private String pseudoJoueur;
    private boolean victoire;
    private List<Armee> listArmee;

    public Joueur(String nomJoueur, String prenomJoueur, String pseudoJoueur) {
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.pseudoJoueur = pseudoJoueur;
    }

    public Joueur(int idJoueur, String nomJoueur, String prenomJoueur, String pseudoJoueur, boolean victoire, List<Armee> listArmee) {
        this.idJoueur = idJoueur;
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.pseudoJoueur = pseudoJoueur;
        this.victoire = victoire;
        this.listArmee = listArmee;
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

    public List<Armee> getListArmee() {
        return listArmee;
    }

    public void setListArmee(List<Armee> listArmee) {
        this.listArmee = listArmee;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "idJoueur=" + idJoueur +
                ", nomJoueur='" + nomJoueur + '\'' +
                ", prenomJoueur='" + prenomJoueur + '\'' +
                ", pseudoJoueur='" + pseudoJoueur + '\'' +
                ", victoire=" + victoire +
                ", listArmee=" + listArmee +
                '}';
    }
}
