package uniquindio.analisis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniquindio.analisis.model.Pregunta;
import uniquindio.analisis.services.PreguntaService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PreguntaRestController {

    Integer limiteFacilSubir = 115;
    Integer limiteMedioBajar = 125;
    Integer limiteMedioSubir = 165;
    Integer limiteDificilBajar= 175;

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

    @GetMapping("/pregunta/{puntuacion}/{dificultad}/{ids}")
    public Pregunta preguntaDificultad(@PathVariable Integer puntuacion, @PathVariable Integer dificultad, @PathVariable String ids){
        Integer dificultadCalculada = 0;
        Pregunta preguntaSeleccionada;
        //Calcular dificultad dinamica
        //Si se encuentra en dificultad 1
        if(dificultad == 1){
            //Si la puntuacion se encuentra por encima del limite
            if(puntuacion > limiteFacilSubir){
                //sube la dificultad
                dificultadCalculada = 2;
            }else{
                //manten la dificultad
                dificultadCalculada = 1;
            }
        }
        //Si se encuentra en dificultad 2
        if(dificultad == 2){
            if(puntuacion <= limiteMedioBajar){
                dificultadCalculada = 1;
            }else if(puntuacion > limiteMedioSubir){
                dificultadCalculada = 3;
            }else{
                dificultadCalculada = 2;
            }
        }
        //Si se encuentra en dificultad 3
        if (dificultad == 3){
            if(puntuacion < limiteDificilBajar){
                dificultadCalculada = 2;
            }else{
                dificultadCalculada = 3;
            }
        }

        //obtenemos la lista de preguntas por la dificultad
        List<Pregunta> preguntas = preguntaService.obtenerPreguntasDificultad(dificultadCalculada);
        //desordenamos la lista para que sea aleatorio
        Collections.shuffle(preguntas);
        preguntaSeleccionada = preguntas.get(0);
        //Revisamos que no sea repita una pregunta
        if(!ids.equals("")){
            String[] listaIds = ids.split("@");
            if(ids.contains(preguntaSeleccionada.getId()+"")){
                preguntas.remove(0);
                preguntaSeleccionada = preguntas.get(0);
            }
        }
        return preguntaSeleccionada;
    }


}
