package dao;

import models.Usuario;
import java.util.List;

public interface UsuarioDao {
    void delete(Long id) ;

    List<Usuario> getUsuarios();

    void regUsuario(Usuario usuario);

    List<Usuario> getUsuario();
}
