package DAO;

import Models.Armee;

import java.sql.Connection;
import java.sql.SQLException;

public interface ArmeeDAO {

    Armee create (String nomArmee, String faction, Connection c) throws SQLException;
    Armee findByNom (String nomArmee, Connection c) throws SQLException;
    boolean update (int idArmee,Armee a, Connection c)throws SQLException;
    boolean delete (int idArmee, Connection c)throws SQLException;
}