package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.repositories.OpcionRepo;

import java.io.Serializable;

@Service
public class OpcionServiceImpl implements OpcionService, Serializable {

    @Autowired
    private OpcionRepo opcionRepo;

    @Override
    public void guardarOpcion(Opcion opcion) {
        opcionRepo.save(opcion);
    }

    @Override
    public void eliminarOpcion(Opcion opcion) {
        opcionRepo.delete(opcion);
    }


}
