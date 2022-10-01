package uniquindio.analisis.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Respuesta;

public interface RespuestaRepo extends JpaRepository<Respuesta, Integer> {
}
