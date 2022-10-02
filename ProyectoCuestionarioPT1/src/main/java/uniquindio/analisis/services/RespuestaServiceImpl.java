package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.Respuesta;
import uniquindio.analisis.repositories.RespuestaRepo;

import java.io.Serializable;

@Service
public class RespuestaServiceImpl implements RespuestaService, Serializable {

    @Autowired
    private RespuestaRepo respuestaRepo;

    @Override
    public void guardarRespuesta(Respuesta respuesta) {
        respuestaRepo.save(respuesta);
    }

    @Override
    public void borrarRespuesta(Respuesta respuesta) {
        respuestaRepo.delete(respuesta);
    }
}
