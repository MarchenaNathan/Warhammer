package Views;

import Models.Figurine;

public class RechercheFigurine {

    public int afficherRecherche(){
        int idFigurine=0;
        System.out.println("*************************************************");
        System.out.println("Quel est l'identifiant de la figurine à chercher :");
        idFigurine=Util.SCANNER.nextInt();
        return idFigurine;
    }
    public void afficherResultatPers(Figurine f){
        if (f != null) {
            System.out.println(f);
        } else {
            System.out.println("Figurine non présente en BDD");
        }
    }
}
