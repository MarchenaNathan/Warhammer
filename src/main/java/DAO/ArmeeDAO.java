package DAO;

import models.Armee;
import models.Joueur;

import java.sql.Connection;
import java.sql.SQLException;

public interface ArmeeDAO {

    Armee create (String nomArmee, String faction, Connection c) throws SQLException;
    Armee findByName (String nomArmee, Connection c) throws SQLException;
    boolean update (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
    boolean delete (String pseudoJoueur, Joueur j, Connection c)throws SQLException;
}
