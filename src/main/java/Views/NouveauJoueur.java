package Views;

import Models.Joueur;

public class NouveauJoueur {

    public Joueur saisieNouveauJoueur() {
        System.out.println("*************************************************");
        System.out.println("Création d'un nouveau joueur : ");
        System.out.println("Nom du joueur :");
        String nomJoueur = Util.SCANNER.next();
        System.out.println("Prénom du joueur :");
        String prenomJoueur = Util.SCANNER.next();
        System.out.println("Pseudo du joueur :");
        String pseudoJoueur = Util.SCANNER.next();

        Joueur jou = new Joueur(nomJoueur, prenomJoueur, pseudoJoueur);
        return jou;
    }
}
