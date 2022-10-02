package uniquindio.analisis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uniquindio.analisis.model.Test;

public interface TestRepo  extends JpaRepository<Test, Integer> {
}
