package DAO;

import Models.Figurine;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FigurineDAO {
    Figurine findById(int idFigurine, Connection c) throws SQLException;
    Figurine findByNom (String nomArmee, Connection c) throws SQLException;
    boolean update (int idArmee,Figurine f, Connection c)throws SQLException;
    boolean delete (int idArmee, Connection c)throws SQLException;
}
