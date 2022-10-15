package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.dto.ResultadoDTO;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.model.Respuesta;
import uniquindio.analisis.model.Test;
import uniquindio.analisis.services.TestService;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TestRestController {


    @Autowired
    public TestService testService;

    @GetMapping("/test/{usuarioNombre}")
    public Integer devolverIdTest(@PathVariable String usuarioNombre) {
        return testService.obtenerTestUsuarioNombre(usuarioNombre);
    }

    @GetMapping("/test/{idTest}")
    public List<ResultadoDTO> devolverResultados(@PathVariable Integer idTest) {

        Test test = testService.obtenerTestId(idTest);

        List<Respuesta> respuestas = test.getRespuestas();

        ResultadoDTO resultadoDTO = new ResultadoDTO();
        List<ResultadoDTO> resultadosEnvio = new ArrayList<ResultadoDTO>();

        for (Respuesta respuesta : respuestas) {
            resultadoDTO.setPregunta(respuesta.getPreguntaRespondida());
            resultadoDTO.setOpcionMarcada(respuesta.getOpcionMarcada());

            for (Opcion opcion : respuesta.getPreguntaRespondida().getOpciones()) {
                if (opcion.isCorrecta()) {
                    resultadoDTO.setOpcionCorrecta(opcion);
                    break;
                }
            }
            resultadosEnvio.add(resultadoDTO);
        }

        return resultadosEnvio;
    }
}
