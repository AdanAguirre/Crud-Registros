package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Adan
 */
public class ConexionBD {

    private Connection conn;

    public Connection conexion() {
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mjysql://localhost/crud-registros", "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos.");
        }
        return conn;
    }
}
