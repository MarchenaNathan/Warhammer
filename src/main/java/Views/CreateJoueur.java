package Views;

import Models.Joueur;

import java.time.LocalDate;

public class CreateJoueur {

    public Joueur createSaisieJoueur(Joueur j) {
        System.out.println("*************************************************");
        System.out.println("Nom du joueur :");
        String nomJoueur = Util.SCANNER.next();
        System.out.println("Prénom du joueur :");
        String prenomJoueur = Util.SCANNER.next();
        System.out.println("Pseudo du joueur :");
        String pseudoJoueur = Util.SCANNER.next();


        Joueur jou = new Joueur(j.getNomJoueur(), j.getPrenomJoueur(), j.getPseudoJoueur());
        return j;
    }
}
