package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uniquindio.analisis.model.Opcion;

import java.util.List;

@Repository
public interface OpcionRepo extends JpaRepository<Opcion, Integer> {

    @Query("select o from Opcion o where o.pregunta = :preguntaId")
    List<Opcion> listarOpcionesPregunta(Integer preguntaId);
}
