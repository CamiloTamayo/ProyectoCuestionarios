package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uniquindio.analisis.model.Test;

public interface TestRepo extends JpaRepository<Test, Integer> {

    @Query("select max(t.id) from Test t join Usuario u where u.nombre=:nombre")
    Integer obtenerTestUsuarioNombre(String nombre);

}
