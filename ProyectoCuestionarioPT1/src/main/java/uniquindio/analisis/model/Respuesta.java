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

}
