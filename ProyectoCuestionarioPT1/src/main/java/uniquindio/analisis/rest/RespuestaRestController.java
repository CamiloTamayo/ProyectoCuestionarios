package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.model.Pregunta;
import uniquindio.analisis.model.Respuesta;
import uniquindio.analisis.model.Test;
import uniquindio.analisis.services.OpcionService;
import uniquindio.analisis.services.PreguntaService;
import uniquindio.analisis.services.RespuestaService;
import uniquindio.analisis.services.TestService;

@RestController
@CrossOrigin
@RequestMapping
public class RespuestaRestController {

    @Autowired
    private RespuestaService respuestaService;

    @Autowired
    private OpcionService opcionService;

    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private TestService testService;

    @PostMapping("/respuestas/{testId}/{preguntaId}/{opcionMarcada}/{tiempoRespuesta}")
    public void crearRespuestaUsuario(@PathVariable Integer opcionMarcada, @PathVariable Integer preguntaId,
                                      @PathVariable Integer testId, @PathVariable Integer tiempoRespuesta) {
        Opcion opcionMarca = opcionService.obtenerOpcionId(opcionMarcada);
        Pregunta pregunta = preguntaService.obtenerPreguntaId(preguntaId);
        Test test = testService.obtenerTestId(testId);

        Respuesta respuesta = new Respuesta(null, tiempoRespuesta, test, pregunta, opcionMarca);

        respuestaService.guardarRespuesta(respuesta);

    }

}
