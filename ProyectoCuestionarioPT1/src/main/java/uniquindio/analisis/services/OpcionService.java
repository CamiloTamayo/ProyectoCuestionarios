package uniquindio.analisis.services;


import uniquindio.analisis.model.Opcion;

import java.util.List;

public interface OpcionService {
    public void guardarOpcion(Opcion opcion);

    public void eliminarOpcion(Opcion opcion);

    public List<Opcion> listarOpciones();

    public List<Opcion> listarOpcionesPreguntaId(Integer preguntaId);
}
