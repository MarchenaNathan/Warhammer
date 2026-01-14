package DAO;

import Models.Joueur;

import java.sql.Connection;
import java.sql.SQLException;

public class JoueurDAOImpl implements JoueurDAO {

    @Override
    public Joueur create(String nomJoueur, String prenomJoueur, String pseudoJoueur, Connection c) throws SQLException {
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
