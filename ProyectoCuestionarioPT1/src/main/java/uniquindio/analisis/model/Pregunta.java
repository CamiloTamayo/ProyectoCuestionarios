package uniquindio.analisis.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Pregunta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String enunciado;
    @Column(length = 100)
    private String retroalimentacion;

    private byte[] imagen;

    private int nivelDificultad;

    @ManyToOne
    private Materia materia;

    @ManyToOne
    private TipoPregunta tipoPregunta;

    @OneToMany(mappedBy = "pregunta")
    private List<Opcion> opciones;

    @OneToMany(mappedBy = "preguntaRespondida")
    private List<Respuesta> respuestas;
}
