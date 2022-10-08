package uniquindio.analisis.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Respuesta {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tiempoRespuesta;
    @ManyToOne
    private Test testRealizado;

    @ManyToOne
    private Pregunta preguntaRespondida;

    @ManyToOne
    private Opcion opcionMarcada;

    public Respuesta(Integer tiempoRespuesta, Test test, Pregunta pregunta, Opcion opcion){
        this.tiempoRespuesta = tiempoRespuesta;
        this.testRealizado = test;
        this.preguntaRespondida = pregunta;
        this.opcionMarcada = opcion;
    }
}
