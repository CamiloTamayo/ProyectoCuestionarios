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
public class TipoPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer numero;

    @Column(length = 50)
    private String nombre;

    @OneToMany(mappedBy = "tipoPregunta")
    @ToString.Exclude
    @JsonIgnore
    private List<Pregunta> preguntas;

}
