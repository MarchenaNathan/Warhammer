package Service;

import DAO.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDD {
    private UniteDAO uniteDAO;
    private ArmeeDAO armeeDAO;
    private JoueurDAO joueurDAO;
    private Connection conn;

    public ConnectionBDD() {
        uniteDAO = new UniteDAOImpl();
        armeeDAO = new ArmeeDAOImpl();
        joueurDAO = new JoueurDAOImpl();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://109.234.166.12:3306/tima6358_nmarchena", "tima6358_nmarchena", "Hayden060819");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
