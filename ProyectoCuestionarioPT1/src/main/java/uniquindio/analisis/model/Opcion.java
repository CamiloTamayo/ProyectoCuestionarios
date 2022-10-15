package uniquindio.analisis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Opcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(length = 150)
    private String texto;

    private boolean isCorrecta;

    private String imagen;

    @ManyToOne
    private Pregunta pregunta;

    @OneToMany(mappedBy = "opcionMarcada")
    @ToString.Exclude
    @JsonIgnore
    private List<Respuesta> respuestas;
}
