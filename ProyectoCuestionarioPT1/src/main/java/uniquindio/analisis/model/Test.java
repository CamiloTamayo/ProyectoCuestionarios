package uniquindio.analisis.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date tiempo;
    private int puntaje;
    private int adaptacion;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "testRealizado")
    private List<Respuesta> respuestas;
}
