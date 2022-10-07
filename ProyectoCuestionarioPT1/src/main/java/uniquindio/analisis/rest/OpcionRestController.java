package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.services.OpcionService;

import java.util.List;

@RestController
@RequestMapping("/api/opciones")
@CrossOrigin(origins = "http://localhost:8080")
public class OpcionRestController {

    @Autowired
    private OpcionService opcionService;

    @GetMapping("/api/opciones/{preguntaId}")
    public List<Opcion> listarOpcionesPregunta(@PathVariable Integer preguntaId) {
        return opcionService.listarOpcionesPreguntaId(preguntaId);
    }

    @GetMapping
    public List<Opcion> listarOpciones() {
        return opcionService.listarOpciones();
    }

}
