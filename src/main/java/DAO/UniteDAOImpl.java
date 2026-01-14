package DAO;

import Models.Unites;

import java.sql.Connection;
import java.sql.SQLException;

public class UniteDAOImpl implements UniteDAO {

    @Override
    public Unites create(String nomUnite, Connection c) throws SQLException {
        return null;
    }

    @Override
    public Unites findByNom(String nomUnite, Connection c) throws SQLException {
        return null;
    }

    @Override
    public boolean update(int idUnite, Connection c) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int idUnite, Connection c) throws SQLException {
        return false;
    }
}
