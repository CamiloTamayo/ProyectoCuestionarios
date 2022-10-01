package uniquindio.analisis.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Respuesta {

    @Id
    private Integer id;

    @ManyToOne
    private Test testRealizado;

    @ManyToOne
    private Pregunta preguntaRespondida;

    @ManyToOne
    private Opcion opcionMarcada;

}
