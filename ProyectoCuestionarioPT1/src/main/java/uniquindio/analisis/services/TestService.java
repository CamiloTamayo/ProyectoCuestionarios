package uniquindio.analisis.services;

import uniquindio.analisis.model.Test;

public interface TestService {
    public void guardarTest(Test test);

    public void borrarTest(Test test);

    public Test obtenerTestId(Integer id);
}
