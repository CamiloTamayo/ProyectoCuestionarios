package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.Test;
import uniquindio.analisis.repositories.TestRepo;

import java.io.Serializable;

@Service
public class TestServiceImpl implements TestService, Serializable {

    @Autowired
    private TestRepo testRepo;

    @Override
    @Transactional(readOnly = false)
    public Test guardarTest(Test test) {
        return testRepo.save(test);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrarTest(Test test) {
        testRepo.delete(test);
    }

    @Override
    public Test obtenerTestId(Integer id) {
        return testRepo.findById(id).get();
    }

    @Override
    public Integer obtenerTestUsuarioNombre(String nombre) {
        return testRepo.obtenerTestUsuarioNombre(nombre);
    }
}
