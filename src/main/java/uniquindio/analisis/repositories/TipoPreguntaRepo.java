package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.TipoPregunta;

public interface TipoPreguntaRepo  extends JpaRepository<TipoPregunta, Integer> {
}
