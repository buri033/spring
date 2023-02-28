package dao;

import models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoimp implements UsuarioDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        //consulta con hibernate usamos nombre d la clase no d la tabla

        String query = "FROM Usuario";
        return  entityManager.createQuery(query).getResultList();

    }

    @Override
    public void regUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);

    }

    @Override
    public List<Usuario> getUsuario() {
        return null;
    }
}