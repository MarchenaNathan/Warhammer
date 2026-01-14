import Controler.ControlerFigurine;
import DAO.FigurineDAOImpl;
import Models.Figurine;

import java.util.Scanner;

public class main {
    static void main() {
        ControlerFigurine cf = new ControlerFigurine();
        cf.rechercherFigurine();
        System.out.println();
    }
}
