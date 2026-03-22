package DAO;

import Models.Joueur;

import java.sql.*;

public class JoueurDAOImpl implements JoueurDAO {

    @Override
    public Joueur create(String nomJoueur, String prenomJoueur, String pseudoJoueur, Connection c) throws SQLException {
        String sql = "insert into Joueur (nomJoueur, prenomJoueur, pseudoJoueur) values(?, ?, ?)";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, nomJoueur);
        pst.setString(2, prenomJoueur);
        pst.setString(3, pseudoJoueur);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            return new Joueur(nomJoueur, prenomJoueur, pseudoJoueur);
        }
        return null;
    }

    @Override
    public Joueur findByPseudo(String pseudoJoueur, Connection c) throws SQLException {
        PreparedStatement pst = c.prepareStatement("select * from Joueur where pseudoJoueur = ?");
        Joueur jou = null;
        pst.setString(1, pseudoJoueur);
        try {
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                jou = new Joueur(rs.getInt("idJoueur"), rs.getString("nomJoueur"),
                        rs.getString("prenomJoueur"), rs.getString("pseudoJoueur"), rs.getBoolean("victoire"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return jou;
    }

    @Override
    public boolean update(int idJoueur, Joueur j, Connection c) throws SQLException {
        String sql = "update Joueur set nomJoueur=?, prenomJoueur=?, pseudoJoueur=? where idJoueur = ?";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, j.getNomJoueur());
        pst.setString(2, j.getPrenomJoueur());
        pst.setString(3, j.getPseudoJoueur());
        pst.setInt(4,idJoueur);
        int row = pst.executeUpdate();
        return row > 0;
    }

    @Override
    public boolean delete(int idJoueur, Connection c) throws SQLException {
        String sql = "delete from Joueur where idJoueur = ?";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, idJoueur);
        int ligne = pst.executeUpdate();
        return ligne > 0;
    }
}
