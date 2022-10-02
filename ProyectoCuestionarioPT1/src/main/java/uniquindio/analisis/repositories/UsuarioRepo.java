package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Usuario;

public interface UsuarioRepo  extends JpaRepository<Usuario, Integer> {
}
