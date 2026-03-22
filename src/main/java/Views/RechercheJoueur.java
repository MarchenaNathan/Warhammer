package Views;

import Models.Joueur;

public class RechercheJoueur {

    public String afficherRecherche(){
        String pseudoJoueur = null;
        System.out.println("*************************************************");
        System.out.println("Quel est le pseudo du joueur à chercher:");
        pseudoJoueur = Util.SCANNER.next();
        return pseudoJoueur;
    }
    public void afficherResultatJoueur(Joueur j){
        if (j != null) {
            System.out.println(j);
        } else {
            System.out.println("Joueur non présent en BDD");
        }
    }
}
