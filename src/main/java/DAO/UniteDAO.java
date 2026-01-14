package DAO;

import Models.Unites;

import java.sql.Connection;
import java.sql.SQLException;

public interface UniteDAO {
    Unites create (String nomUnite, Connection c) throws SQLException;
    Unites findByNom (String nomUnite, Connection c) throws SQLException;
    boolean update (int idUnite, Connection c)throws SQLException;
    boolean delete (int idUnite, Connection c)throws SQLException;
}
