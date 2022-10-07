package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.services.OpcionService;

import java.util.List;

@RestController
@RequestMapping("/api/opciones")
public class OpcionRestController {

    @Autowired
    private OpcionService opcionService;

    @GetMapping("/api/opciones/{preguntaId}")
    public List<Opcion> listarOpciones(@PathVariable Integer preguntaId) {
        return opcionService.listarOpcionesPreguntaId(preguntaId);
    }

}
