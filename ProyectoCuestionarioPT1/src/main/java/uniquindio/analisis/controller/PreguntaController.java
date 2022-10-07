package uniquindio.analisis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uniquindio.analisis.services.OpcionService;
import uniquindio.analisis.services.PreguntaService;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import java.io.Serializable;

@Component
@TransactionScoped
@Transactional
public class PreguntaController implements Serializable {

    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private OpcionService opcionService;


}
