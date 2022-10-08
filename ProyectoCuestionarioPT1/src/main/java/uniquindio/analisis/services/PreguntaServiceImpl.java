package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.Pregunta;
import uniquindio.analisis.repositories.PreguntaRepo;

import java.io.Serializable;
import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntaService, Serializable {

    @Autowired
    private PreguntaRepo preguntaRepo;

    @Override
    @Transactional(readOnly = false)
    public void guardarPregunta(Pregunta pregunta) {
        preguntaRepo.save(pregunta);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrarPregunta(Pregunta pregunta) {
        preguntaRepo.delete(pregunta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pregunta> listarPreguntas() {
        return preguntaRepo.findAll();
    }

    @Override
    public Pregunta obtenerPreguntaId(Integer id) {
        return preguntaRepo.findById(id).get();
    }


}
