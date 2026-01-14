package DAO;

import models.Joueur;

import java.sql.Connection;
import java.sql.SQLException;

public interface JoueurDAO {

    Joueur findByPseudo (String pseudoJoueur, Connection c) throws SQLException;
    boolean update (int idJoueur, Joueur j, Connection c)throws SQLException;
    boolean delete (int idJoueur, Joueur j, Connection c)throws SQLException;
}
