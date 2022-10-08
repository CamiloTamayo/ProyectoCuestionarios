package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.repositories.OpcionRepo;

import java.io.Serializable;
import java.util.List;

@Service
public class OpcionServiceImpl implements OpcionService, Serializable {

    @Autowired
    private OpcionRepo opcionRepo;

    @Override
    @Transactional(readOnly = false)
    public void guardarOpcion(Opcion opcion) {
        opcionRepo.save(opcion);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminarOpcion(Opcion opcion) {
        opcionRepo.delete(opcion);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Opcion> listarOpciones() {
        return opcionRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Opcion> listarOpcionesPreguntaId(Integer preguntaId) {
        return null;
    }

    @Override
    public Opcion obtenerOpcionId(Integer id) {
        return opcionRepo.findById(id).get();
    }


}
