package uniquindio.analisis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Materia {

    @Id
    private Integer id;

    @Column(length = 25)
    private String nombre;

    @OneToMany(mappedBy = "materia")
    private List<Pregunta> preguntas;
}
