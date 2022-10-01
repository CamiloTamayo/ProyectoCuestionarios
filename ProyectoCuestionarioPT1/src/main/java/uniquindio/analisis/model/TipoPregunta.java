package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Data
public class TipoPregunta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numero;

    @Column(length = 50)
    private String nombre;

    @OneToMany(mappedBy = "tipoPregunta")
    private List<Pregunta> preguntas;
}
