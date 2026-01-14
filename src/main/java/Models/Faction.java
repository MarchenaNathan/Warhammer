package Models;

public class Faction {
    private int idFaction;
    private String nomFaction;

    public Faction(int idFaction, String nomFaction) {
        this.idFaction = idFaction;
        this.nomFaction = nomFaction;
    }

    public int getIdFaction() {
        return idFaction;
    }

    public void setIdFaction(int idFaction) {
        this.idFaction = idFaction;
    }

    public String getNomFaction() {
        return nomFaction;
    }

    public void setNomFaction(String nomFaction) {
        this.nomFaction = nomFaction;
    }
}
