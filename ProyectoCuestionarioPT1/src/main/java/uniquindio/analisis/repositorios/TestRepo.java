package uniquindio.analisis.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Test;

public interface TestRepo  extends JpaRepository<Test, Integer> {
}
