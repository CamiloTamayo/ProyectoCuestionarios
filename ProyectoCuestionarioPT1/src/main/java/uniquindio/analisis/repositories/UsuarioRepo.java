package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uniquindio.analisis.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    @Query("select u from Usuario u where u.nombre=:nombre")
    Usuario findByNombre(String nombre);
}
