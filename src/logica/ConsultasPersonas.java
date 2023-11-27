
package logica;

import com.mysql.jdbc.Connection;
import config.ConexionBD;
import java.sql.PreparedStatement;

/**
 *
 * @author Adan
 */
public class ConsultasPersonas {
    private ConexionBD conectar = new ConexionBD();
    private Connection miConexion;
    private PreparedStatement ps;
    
}
