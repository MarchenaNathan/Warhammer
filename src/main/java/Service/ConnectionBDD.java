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

    public Joueur createJoueur(String nomJoueur, String prenomJoueur, String pseudoJoueur) {
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


}
