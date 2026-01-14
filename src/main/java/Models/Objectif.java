package Models;

public class Objectif {
    private int idObj;
    private boolean controleObj;
    private int nbrePtsVictoire;

    public Objectif(int idObj, boolean controleObj, int nbrePtsVictoire) {
        this.idObj = idObj;
        this.controleObj = controleObj;
        this.nbrePtsVictoire = nbrePtsVictoire;
    }

    public int getIdObj() {
        return idObj;
    }

    public void setIdObj(int idObj) {
        this.idObj = idObj;
    }

    public boolean isControleObj() {
        return controleObj;
    }

    public void setControleObj(boolean controleObj) {
        this.controleObj = controleObj;
    }

    public int getNbrePtsVictoire() {
        return nbrePtsVictoire;
    }

    public void setNbrePtsVictoire(int nbrePtsVictoire) {
        this.nbrePtsVictoire = nbrePtsVictoire;
    }

    @Override
    public String toString() {
        return "Objectif{" +
                "idObj=" + idObj +
                ", controleObj=" + controleObj +
                ", nbrePtsVictoire=" + nbrePtsVictoire +
                '}';
    }
}