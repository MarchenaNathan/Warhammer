package Models;

public class Figurine {
    private  int idFigurine;
    private String nom;
    private int pv;
    private double mvt;
    private int ct;
    private int cc;

    public Figurine(int idFigurine, String nom, int pv, double mvt, int ct, int cc) {
        this.idFigurine = idFigurine;
        this.nom = nom;
        this.pv = pv;
        this.mvt = mvt;
        this.ct = ct;
        this.cc = cc;
    }

    public int getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(int idFigurine) {
        this.idFigurine = idFigurine;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public double getMvt() {
        return mvt;
    }

    public void setMvt(double mvt) {
        this.mvt = mvt;
    }

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Figurine{" +
                "idFigurine=" + idFigurine +
                ", nom='" + nom + '\'' +
                ", pv=" + pv +
                ", mvt=" + mvt +
                ", ct=" + ct +
                ", cc=" + cc +
                '}';
    }
}