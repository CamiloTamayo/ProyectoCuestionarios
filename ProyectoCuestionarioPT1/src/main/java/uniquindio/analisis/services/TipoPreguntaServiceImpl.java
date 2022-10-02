package uniquindio.analisis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uniquindio.analisis.model.TipoPregunta;
import uniquindio.analisis.repositories.TipoPreguntaRepo;

import java.io.Serializable;

@Service
public class TipoPreguntaServiceImpl implements TipoPreguntaService, Serializable {

    @Autowired
    private TipoPreguntaRepo tipoPreguntaRepo;

    @Override
    public void guardarTipoPregunta(TipoPregunta tipoPregunta) {
        tipoPreguntaRepo.save(tipoPregunta);
    }

    @Override
    public void borrarTipoPregunta(TipoPregunta tipoPregunta) {
        tipoPreguntaRepo.delete(tipoPregunta);
    }

}
