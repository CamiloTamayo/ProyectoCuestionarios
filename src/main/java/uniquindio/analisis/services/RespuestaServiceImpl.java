package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.Respuesta;
import uniquindio.analisis.repositories.RespuestaRepo;

import java.io.Serializable;

@Service
public class RespuestaServiceImpl implements RespuestaService, Serializable {

    @Autowired
    private RespuestaRepo respuestaRepo;

    @Override
    @Transactional(readOnly = false)
    public void guardarRespuesta(Respuesta respuesta) {
        respuestaRepo.save(respuesta);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrarRespuesta(Respuesta respuesta) {
        respuestaRepo.delete(respuesta);
    }
}
