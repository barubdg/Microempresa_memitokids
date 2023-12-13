package DAO.Usuario;

import DTO.Usuario.UsuarioDTO;

public interface UsuarioDAO {
    UsuarioDTO buscarUsuario(String correo, String contrasena);
}
