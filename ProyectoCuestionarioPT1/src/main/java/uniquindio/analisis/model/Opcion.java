package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;


@Entity
@Data
public class Opcion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150, nullable = false)
    private String texto;

    private  boolean isCorrecta;

    private byte[] imagen;

    @ManyToOne
    private Pregunta pregunta;
}
