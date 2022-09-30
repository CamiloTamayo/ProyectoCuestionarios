package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
public class Pregunta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String enunciado;
    private String retroalimentacion;
    private byte[] imagen;
    private int nivelDificultad;
    private TipoPregunta tipoPregunta;
}
