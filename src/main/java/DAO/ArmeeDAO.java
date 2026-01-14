package DAO;

import Models.Armee;
import Models.Joueur;

import java.sql.Connection;
import java.sql.SQLException;

public interface ArmeeDAO {

    Armee create (String nomArmee, String faction, Connection c) throws SQLException;
    Joueur findByPseudo (String pseudoJoueur, Connection c) throws SQLException;
    boolean update (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
    boolean delete (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
}
