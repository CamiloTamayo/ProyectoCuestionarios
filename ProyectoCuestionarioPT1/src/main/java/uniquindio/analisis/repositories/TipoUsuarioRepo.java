package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.TipoUsuario;

public interface TipoUsuarioRepo extends JpaRepository<TipoUsuario, Integer> {
}
