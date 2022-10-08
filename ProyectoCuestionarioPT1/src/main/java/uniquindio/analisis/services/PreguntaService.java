package uniquindio.analisis.services;

import uniquindio.analisis.model.Pregunta;

import java.util.List;

public interface PreguntaService {

    public void guardarPregunta(Pregunta pregunta);

    public void borrarPregunta(Pregunta pregunta);

    public List<Pregunta> listarPreguntas();

    public Pregunta obtenerPreguntaId(Integer id);
}
