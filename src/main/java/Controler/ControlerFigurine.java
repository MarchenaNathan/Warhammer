package Controler;

import Models.Figurine;
import Service.ConnectionBDD;
import Views.RechercheFigurine;

public class ControlerFigurine {
    public void rechercherFigurine() {
        RechercheFigurine GUIrecherchefig= new RechercheFigurine();
        int id= GUIrecherchefig.afficherRecherche();
        ConnectionBDD cbdd = new ConnectionBDD();
        Figurine f = cbdd.findFig(id);
        GUIrecherchefig.afficherResultatFig(f);
    }
}
