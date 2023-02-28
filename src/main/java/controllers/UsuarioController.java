package controllers;

import dao.UsuarioDao;
import models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId("247");
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setCorreo("hola@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping("/user", method = RequestMethod.DELETE)
    public void delUsuario () {

    }

    @RequestMapping("/edituser")
    public Usuario editUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId("247");
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setCorreo("hola@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping("/finduser")
    public Usuario findUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId("247");
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setCorreo("hola@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping("/users")
    public List<Usuario> getUsuarios() {
    return usuarioDao.getUsuarios();

    }
}

