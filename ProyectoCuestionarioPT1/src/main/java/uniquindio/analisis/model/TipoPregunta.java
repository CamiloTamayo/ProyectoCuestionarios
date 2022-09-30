package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class TipoPregunta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer numero;

    private String nombre;
}
