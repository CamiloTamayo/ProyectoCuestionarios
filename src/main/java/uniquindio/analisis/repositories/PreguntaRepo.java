package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Pregunta;

public interface PreguntaRepo  extends JpaRepository<Pregunta, Integer> {
}