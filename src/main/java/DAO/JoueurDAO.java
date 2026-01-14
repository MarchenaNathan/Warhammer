package DAO;

import models.Joueur;

import java.sql.Connection;
import java.sql.SQLException;

public interface JoueurDAO {

    Joueur create (String nomJoueur, String prenomJoueur, String pseudoJoueur, Connection c) throws SQLException;
    Joueur findByPseudo (String pseudoJoueur, Connection c) throws SQLException;
    boolean update (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
    boolean delete (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
}
