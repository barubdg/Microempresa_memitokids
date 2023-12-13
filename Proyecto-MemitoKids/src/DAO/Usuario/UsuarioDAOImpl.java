package DAO.Usuario;
import Conexion.ConexionSQLWorkbrench;
import DTO.Usuario.UsuarioDTO;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;



//import java.sql.Connection;
//import java.sql.PreparedStatement;



import java.sql.ResultSet;
import java.sql.SQLException;
public class UsuarioDAOImpl implements UsuarioDAO {
    @Override
    public UsuarioDTO buscarUsuario(String correo, String contrasena) {
        // Realizar la conexión a la base de datos utilizando la clase ConexionSQLWorkbrench
        Connection conexion = (Connection) ConexionSQLWorkbrench.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        UsuarioDTO usuario = null; //Modelo
        try {
            // Consultar el usuario en la base de datos
            String consulta = "select * from usuarios where correo= ? and contraseña= ?;";
            statement = (PreparedStatement) conexion.prepareStatement(consulta);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                
                // Si se encuentra el usuario, crear el objeto UsuarioDTO con los datos obtenidos
                usuario = new UsuarioDTO(resultSet.getString("correo"), resultSet.getString("contraseña"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }
}

