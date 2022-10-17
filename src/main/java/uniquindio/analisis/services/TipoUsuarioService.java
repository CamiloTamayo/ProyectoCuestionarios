package uniquindio.analisis.services;

import uniquindio.analisis.model.TipoUsuario;

public interface TipoUsuarioService {
    void guardarTipoUsuario(TipoUsuario tipoUsuario);

    void borrarTipoPregunta(TipoUsuario tipoUsuario);

    TipoUsuario obtenerTipoUsuario(Integer tipo);
}
