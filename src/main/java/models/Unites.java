package models;

import java.util.List;

public class Unites {
    private int idUnite;
    private String nomUnite;
    private int nbrePtsUnite;
    public List<Figurine> listFigurine;

    public Unites(int idUnite, String nomUnite, int nbrePtsUnite, List<Figurine> listFigurine) {
        this.idUnite = idUnite;
        this.nomUnite = nomUnite;
        this.nbrePtsUnite = nbrePtsUnite;
        this.listFigurine = listFigurine;
    }

    public int getIdUnite() {
        return idUnite;
    }

    public void setIdUnite(int idUnite) {
        this.idUnite = idUnite;
    }

    public String getNomUnite() {
        return nomUnite;
    }

    public void setNomUnite(String nomUnite) {
        this.nomUnite = nomUnite;
    }

    public int getNbrePtsUnite() {
        return nbrePtsUnite;
    }

    public void setNbrePtsUnite(int nbrePtsUnite) {
        this.nbrePtsUnite = nbrePtsUnite;
    }

    public List<Figurine> getListFigurine() {
        return listFigurine;
    }

    public void setListFigurine(List<Figurine> listFigurine) {
        this.listFigurine = listFigurine;
    }

    @Override
    public String toString() {
        return "Unites{" +
                "idUnite=" + idUnite +
                ", nomUnite='" + nomUnite + '\'' +
                ", nbrePtsUnite=" + nbrePtsUnite +
                ", listFigurine=" + listFigurine +
                '}';
    }
}
