package Service;

import DAO.*;
import Models.Figurine;
import Models.Joueur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDD {
    private FigurineDAO figurineDAO;
    private UniteDAO uniteDAO;
    private ArmeeDAO armeeDAO;
    private JoueurDAO joueurDAO;
    private Connection conn;

    public ConnectionBDD() {
        uniteDAO = new UniteDAOImpl();
        armeeDAO = new ArmeeDAOImpl();
        joueurDAO = new JoueurDAOImpl();
        figurineDAO = new FigurineDAOImpl();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://109.234.166.12:3306/tima6358_nmarchena", "tima6358_nmarchena", "Hayden060819");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Figurine findFig(int id) {
        Figurine f = null;
        try {
            if (conn != null) {
                f = figurineDAO.findById(id, conn);
            }
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getMessage(), e.getSQLState());
        }
        return f;
    }

    public Joueur createJou(String nomJoueur, String prenomJoueur, String pseudoJoueur) {
        Joueur jou = null;
        try {
            if (conn != null) {
                jou = joueurDAO.create(nomJoueur, prenomJoueur, pseudoJoueur, conn);
            }
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getMessage(), e.getSQLState());
        }
        return jou;
    }

    public String updateJou(int idJoueur,Joueur j){
        try {
            if (conn != null) {
                boolean updateOk= joueurDAO.update(idJoueur, j, conn);
                if(updateOk){
                    return "Le joueur "+ j.getPseudoJoueur() +" a été mis à jour!";
                }
                else {
                    return "La mise à jour de " + j.getPseudoJoueur() + "n'a pas fonctionné!";
                }
            }
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getSQLState(), e.getMessage());
        }
        return "Erreur lors de la mise à jour du joueur";
    }

    public boolean deleteJou(int idJoueur){
        try {
            if (conn != null) {
                joueurDAO.delete(idJoueur, conn);
                return true;
            }
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getSQLState(), e.getMessage());
        }
        return false;
    }

    public Joueur findJoueurByPseudo(String pseudoJoueur) {
        Joueur j = null;
        try {
            if (conn != null) {
                j = joueurDAO.findByPseudo(pseudoJoueur, conn);
            }
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getMessage(), e.getSQLState());
        }
        return j;
    }

}
