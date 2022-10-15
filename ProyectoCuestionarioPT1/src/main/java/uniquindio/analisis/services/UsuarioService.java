package uniquindio.analisis.services;

import uniquindio.analisis.model.Usuario;

public interface UsuarioService {
    void guardarUsuario(Usuario usuario);

    void borrarUsuario(Usuario usuario);

    Usuario obtenerUsuarioNombre(String nombre);
}
