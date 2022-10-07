package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uniquindio.analisis.model.Pregunta;
import uniquindio.analisis.services.PreguntaService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PreguntaRestController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/preguntas")
    public List<Pregunta> listaPreguntas() {
        try {
            return preguntaService.listarPreguntas();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }


}
