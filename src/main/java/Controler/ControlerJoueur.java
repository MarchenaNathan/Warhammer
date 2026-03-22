package Controler;

import Models.Joueur;
import Service.ConnectionBDD;
import Views.NouveauJoueur;
import Views.RechercheJoueur;
import Views.UpdateJoueur;

public class ControlerJoueur {

    public void creerJoueur() {
        //créer un nouveau joueur
        //appel de la view pour un nouveau joueur
        NouveauJoueur GUInouveauJr = new NouveauJoueur();
        //afficher la view pour saisir les infos du nouveau joueur
        Joueur jou = GUInouveauJr.saisieNouveauJoueur();
        //appel du service ConnectionBDD
        ConnectionBDD cbdd = new ConnectionBDD();

        Joueur j = cbdd.createJou(jou.getNomJoueur(), jou.getPrenomJoueur(), jou.getPseudoJoueur());

        System.out.println("Joueur crée : " + j);
    }

    public void majJoueur() {
        RechercheJoueur GUIrechercheJr = new RechercheJoueur();
        UpdateJoueur GUIupdateJr = new UpdateJoueur();
        String pseudo = GUIrechercheJr.afficherRecherche();

        ConnectionBDD cbdd = new ConnectionBDD();
        Joueur j = cbdd.findJoueurByPseudo(pseudo);
        int id = j.getIdJoueur();

        GUIrechercheJr.afficherResultatJoueur(j);

        Joueur j2 = GUIupdateJr.saisieUpdateJoueur(j);

        System.out.println(cbdd.updateJou(id, j2));
    }

    public void supprimeJoueur() {
        RechercheJoueur GUIrechercheJr = new RechercheJoueur();
        String pseudo = GUIrechercheJr.afficherRecherche();

        ConnectionBDD cbdd = new ConnectionBDD();
        Joueur j = cbdd.findJoueurByPseudo(pseudo);
        int id = j.getIdJoueur();

        GUIrechercheJr.afficherResultatJoueur(j);

        System.out.println(cbdd.deleteJou(id));
    }
}
