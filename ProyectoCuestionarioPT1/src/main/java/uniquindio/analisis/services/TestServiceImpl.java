package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.Test;
import uniquindio.analisis.repositories.TestRepo;

import java.io.Serializable;

@Service
public class TestServiceImpl implements TestService, Serializable {

    @Autowired
    private TestRepo testRepo;

    @Override
    public void guardarTest(Test test) {
        testRepo.save(test);
    }

    @Override
    public void borrarTest(Test test) {
        testRepo.delete(test);
    }
}
