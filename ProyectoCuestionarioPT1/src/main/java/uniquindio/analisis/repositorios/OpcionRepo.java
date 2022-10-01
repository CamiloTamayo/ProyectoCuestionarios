package uniquindio.analisis.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Opcion;

public interface OpcionRepo  extends JpaRepository<Opcion, Integer> {
}
