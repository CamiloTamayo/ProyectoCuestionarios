package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.Pregunta;
import uniquindio.analisis.repositories.PreguntaRepo;

import java.io.Serializable;
import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntaService, Serializable {

    @Autowired
    private PreguntaRepo preguntaRepo;

    @Override
    public void guardarPregunta(Pregunta pregunta) {
        preguntaRepo.save(pregunta);
    }

    @Override
    public void borrarPregunta(Pregunta pregunta) {
        preguntaRepo.delete(pregunta);
    }

    @Override
    public List<Pregunta> listarPreguntas() {
        return preguntaRepo.findAll();
    }
}
