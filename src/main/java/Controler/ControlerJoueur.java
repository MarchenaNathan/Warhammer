package Controler;

import Models.Joueur;
import Service.ConnectionBDD;
import Views.NouveauJoueur;

public class ControlerJoueur {

    public void creerJoueur() {
        //créer un nouveau joueur
        //appel de la view pour un nouveau joueur
        NouveauJoueur GUInouveauJr = new NouveauJoueur();
        //afficher la view pour saisir les infos du nouveau joueur
        Joueur jou = GUInouveauJr.saisieNouveauJoueur();
        //appel du service ConnectionBDD
        ConnectionBDD cbdd = new ConnectionBDD();

        Joueur j = cbdd.createJoueur(jou.getNomJoueur(), jou.getPrenomJoueur(), jou.getPseudoJoueur());

        System.out.println("Joueur crée : " + j);
    }

}
