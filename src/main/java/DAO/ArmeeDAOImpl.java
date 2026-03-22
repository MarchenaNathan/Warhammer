package DAO;

import Models.Armee;


import java.sql.Connection;
import java.sql.SQLException;

public class ArmeeDAOImpl implements ArmeeDAO {

    @Override
    public Armee create(String nomArmee, String faction, Connection c) throws SQLException {
        return null;
    }

    @Override
    public Armee findByNom(String nomArmee, Connection c) throws SQLException {
        return null;
    }

    @Override
    public boolean update(int idArmee, Armee a, Connection c) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int idArmee, Connection c) throws SQLException {
        return false;
    }
}