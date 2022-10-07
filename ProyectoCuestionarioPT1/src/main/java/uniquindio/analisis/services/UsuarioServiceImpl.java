package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.Usuario;
import uniquindio.analisis.repositories.UsuarioRepo;

import java.io.Serializable;

@Service
public class UsuarioServiceImpl implements UsuarioService, Serializable {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Override
    @Transactional(readOnly = false)
    public void guardarUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrarUsuario(Usuario usuario) {
        usuarioRepo.delete(usuario);
    }

}
