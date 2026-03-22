package Views;

import Models.Joueur;

import java.time.LocalDate;

public class UpdateJoueur {

    public Joueur saisieUpdateJoueur(Joueur j) {
        System.out.println("*************************************************");
        System.out.println("Nom actuel: " + j.getNomJoueur());
        System.out.println("Nouveau nom:");
        String nomJoueur = Util.SCANNER.next();

        System.out.println("Prénom actuel: " + j.getPrenomJoueur());
        System.out.println("Nouveau prénom:");
        String prenomJoueur = Util.SCANNER.next();

        System.out.println("Pseudo actuel: " + j.getPseudoJoueur());
        System.out.println("Nouveau pseudo:");
        String pseudoJoueur = Util.SCANNER.next();

        return new Joueur(nomJoueur, prenomJoueur, pseudoJoueur);
    }
}
