package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.model.Usuario;
import uniquindio.analisis.services.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario/{nombre}")
    public void guardarUsuario(@PathVariable String nombre) {
        Usuario usuario = new Usuario(nombre);
        usuarioService.guardarUsuario(usuario);

    }


}
