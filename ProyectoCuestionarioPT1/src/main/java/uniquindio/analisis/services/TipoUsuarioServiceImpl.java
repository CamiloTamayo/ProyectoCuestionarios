package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.TipoUsuario;
import uniquindio.analisis.repositories.TipoUsuarioRepo;

import java.io.Serializable;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService, Serializable {

    @Autowired
    private TipoUsuarioRepo tipoUsuarioRepo;

    @Override
    @Transactional(readOnly = false)
    public void guardarTipoUsuario(TipoUsuario tipoUsuario) {
        tipoUsuarioRepo.save(tipoUsuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrarTipoPregunta(TipoUsuario tipoUsuario) {
        tipoUsuarioRepo.delete(tipoUsuario);
    }

}
