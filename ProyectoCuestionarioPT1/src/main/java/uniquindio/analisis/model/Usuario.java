package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer documento;

    private String nombre;

    private String contrasenia;
}
