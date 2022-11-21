package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uniquindio.analisis.model.Pregunta;

import java.util.List;

public interface PreguntaRepo  extends JpaRepository<Pregunta, Integer> {

    @Query("select p from Pregunta p where p.nivelDificultad=:dificultad")
    List<Pregunta> obtenerPreguntasDificultad (Integer dificultad);

}
