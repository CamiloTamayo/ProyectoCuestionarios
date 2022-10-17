package uniquindio.analisis.services;

import uniquindio.analisis.model.Test;

public interface TestService {
    public Test guardarTest(Test test);

    public void borrarTest(Test test);

    public Test obtenerTestId(Integer id);

    public Integer obtenerTestUsuarioNombre(String nombre);

}
