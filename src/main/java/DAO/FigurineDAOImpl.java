package DAO;

import Models.Figurine;
import Service.ConnectionBDD;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FigurineDAOImpl implements FigurineDAO{


    @Override
    public Figurine findById(int idFigurine, Connection c) throws SQLException {
        PreparedStatement pst = c.prepareStatement("select * from Figurine where idFigurine = ?");
        Figurine fig = null;
        pst.setInt(1, idFigurine);
        try {
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                fig = new Figurine(rs.getInt("idFigurine"), rs.getString("nom"), rs.getInt("pv"), rs.getDouble("mvt"), rs.getInt("ct"), rs.getInt("cc"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return fig;
    }

    @Override
    public Figurine findByNom(String nomArmee, Connection c) throws SQLException {
        return null;
    }

    @Override
    public boolean update(int idArmee, Figurine f, Connection c) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int idArmee, Connection c) throws SQLException {
        return false;
    }
}




