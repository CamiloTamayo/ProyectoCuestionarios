package uniquindio.analisis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    @Column(length = 200)
    private String enunciado;
    @Column(length = 100)
    private String retroalimentacion;

    private String imagen;

    private int nivelDificultad;

    @ManyToOne
    private TipoPregunta tipoPregunta;

    @OneToMany(mappedBy = "pregunta")
    @ToString.Exclude
    @JsonIgnore
    private List<Opcion> opciones;

    @OneToMany(mappedBy = "preguntaRespondida")
    @ToString.Exclude
    @JsonIgnore
    private List<Respuesta> respuestas;
}
