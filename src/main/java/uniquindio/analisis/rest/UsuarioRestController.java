package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.model.TipoUsuario;
import uniquindio.analisis.model.Usuario;
import uniquindio.analisis.services.TipoUsuarioService;
import uniquindio.analisis.services.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @PostMapping("/usuario/{nombre}/{tipoUsuario}")
    public void guardarUsuario(@PathVariable String nombre, @PathVariable Integer tipoUsuario) {
        TipoUsuario tipo = tipoUsuarioService.obtenerTipoUsuario(tipoUsuario);
        Usuario usuario = new Usuario(nombre, tipo);
        usuarioService.guardarUsuario(usuario);

    }


}
