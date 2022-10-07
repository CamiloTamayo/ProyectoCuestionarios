package uniquindio.analisis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private Date tiempo;
    private int puntaje;
    private int adaptacion;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "testRealizado")
    @ToString.Exclude
    @JsonIgnore
    private List<Respuesta> respuestas;
}
