package DAO;

import Models.Figurine;
import Models.Joueur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoueurDAOImpl implements JoueurDAO {

    @Override
    public Joueur create(String nomJoueur, String prenomJoueur, String pseudoJoueur, Connection c) throws SQLException {
        String sql = "insert into joueur (nomJoueur, prenomJoueur, pseudoJoueur) values(?, ?, ?)";
        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, nomJoueur);
        pst.setString(2, prenomJoueur);
        pst.setString(3, pseudoJoueur);

        int rows = pst.executeUpdate();

        if (rows > 0) {
            return new Joueur(nomJoueur, prenomJoueur, pseudoJoueur);
        }

        return null;
    }

    @Override
    public Joueur findByPseudo(String pseudoJoueur, Connection c) throws SQLException {
        return null;
    }

    @Override
    public boolean update(int idJoueur, Joueur j, Connection c) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int idJoueur, Joueur j, Connection c) throws SQLException {
        return false;
    }
}
