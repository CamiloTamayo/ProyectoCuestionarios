package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nombre;
}
