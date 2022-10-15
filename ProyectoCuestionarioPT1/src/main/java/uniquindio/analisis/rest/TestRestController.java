package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.services.TestService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TestRestController {


    @Autowired
    public TestService testService;

    @GetMapping("/test/{usuarioNombre}")
    public String devolverIdTest(@PathVariable String usuarioNombre) {
        testService.obtenerTestUsuarioNombre(usuarioNombre);

        return null;
    }
}
