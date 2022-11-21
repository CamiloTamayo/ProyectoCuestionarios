package uniquindio.analisis.services;

import uniquindio.analisis.model.Pregunta;

import java.util.List;

public interface PreguntaService {

    public void guardarPregunta(Pregunta pregunta);

    public void borrarPregunta(Pregunta pregunta);

    public List<Pregunta> listarPreguntas();
    
    public List<Pregunta> obtenerPreguntasDificultad(Integer dificultad);

    public Pregunta obtenerPreguntaId(Integer id);
}
