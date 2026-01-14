package models;

import java.util.List;

public class Armee extends Faction {
    private int idArmee;
    private String nomArmee;
    private int totalPtsUnites;
    private int ptsVictoire;
    private List<Unites> ListUnite;

    public Armee(int idFaction, String nomFaction, int idArmee, String nomArmee, int totalPtsUnites, int ptsVictoire, List<Unites> listUnite) {
        super(idFaction, nomFaction);
        this.idArmee = idArmee;
        this.nomArmee = nomArmee;
        this.totalPtsUnites = totalPtsUnites;
        this.ptsVictoire = ptsVictoire;
        ListUnite = listUnite;
    }



    public int getIdArmee() {
        return idArmee;
    }

    public void setIdArmee(int idArmee) {
        this.idArmee = idArmee;
    }

    public String getNomArmee() {
        return nomArmee;
    }

    public void setNomArmee(String nomArmee) {
        this.nomArmee = nomArmee;
    }

    public int getTotalPtsUnites() {
        return totalPtsUnites;
    }

    public void setTotalPtsUnites(int totalPtsUnites) {
        this.totalPtsUnites = totalPtsUnites;
    }

    public int getPtsVictoire() {
        return ptsVictoire;
    }

    public void setPtsVictoire(int ptsVictoire) {
        this.ptsVictoire = ptsVictoire;
    }

    public List<Unites> getListUnite() {
        return ListUnite;
    }

    public void setListUnite(List<Unites> listUnite) {
        ListUnite = listUnite;
    }

    @Override
    public String toString() {
        return "Armee{" +
                "idArmee=" + idArmee +
                ", nomArmee='" + nomArmee + '\'' +
                ", totalPtsUnites=" + totalPtsUnites +
                ", ptsVictoire=" + ptsVictoire +
                ", ListUnite=" + ListUnite +
                '}';
    }


}
