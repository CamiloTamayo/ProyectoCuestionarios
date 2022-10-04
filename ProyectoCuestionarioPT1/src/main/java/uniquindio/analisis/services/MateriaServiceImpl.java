package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.Materia;
import uniquindio.analisis.repositories.MateriaRepo;

import java.io.Serializable;

@Service
public class MateriaServiceImpl implements MateriaService, Serializable {

    @Autowired
    private MateriaRepo materiaRepo;

    @Override
    public void guardarMateria(Materia materia) {
        materiaRepo.save(materia);
    }

    @Override
    public void eliminarOpcion(Materia materia) {
        materiaRepo.delete(materia);
    }
}
