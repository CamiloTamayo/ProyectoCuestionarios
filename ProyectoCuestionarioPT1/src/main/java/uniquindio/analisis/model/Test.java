package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;

import java.sql.Date;

@Data
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private Date tiempo;
    private int puntaje;
    private int adaptacion;
}
