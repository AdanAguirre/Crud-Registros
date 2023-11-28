package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    Connection conn;

    public Connection conexion() {
        try {
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_registros?useSSL=false", "root", "root");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos.");
        }
        return conn;
    }
}
